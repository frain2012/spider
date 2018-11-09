package com.frain.spider.service.spider;

import com.alibaba.fastjson.JSON;
import com.frain.spider.constant.DyttMoive;
import com.frain.spider.mapper.TFilmDetailMapper;
import com.frain.spider.mapper.TFilmMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SpiderMovieServiceImpl implements SpiderMovieService {
    @Autowired
    private SpiderService spiderService;

    @Override
    public List<String> firstMatchContent(String link, String rule) {
        if (StringUtils.isEmpty(link)){
            return null;
        }
        final String str = spiderService.spiderUrl(link,"GBK");
        if (StringUtils.isEmpty(str)){
            return null;
        }
        Document document = Jsoup.parse(str);
        final Elements elements = document.select(".bd3r").select("a[href]");
        List<String> lists = new ArrayList<>();
        for ( Element element:elements){
            String href = element.attr("href");
            if (StringUtils.isEmpty(href)){
                continue;
            }
            String subLink = href.trim().replaceAll("#","");
            if (StringUtils.isEmpty(subLink)){
                continue;
            }
            if (link.startsWith("/")){
                link = spiderService.getDomain()+link;
            }
            System.out.println(element.text()+"----->"+subLink);
            lists.add(link);
        }
        return lists;
    }

    @Override
    public List<String> secondMatchContent(String url,final String rule) {

        return null;
    }

    @Override
    public Map ThirdMatchContent(String link, String rule) {
        if (StringUtils.isEmpty(link)){
            return null;
        }
        final String str = spiderService.spiderUrl(link,"GBK");
        if (StringUtils.isEmpty(str)){
            return null;
        }
        Document document = Jsoup.parse(str);
        final Elements elements = document.select("#Zoom");
        Map<String,String> result = new HashMap<>();
        Elements ps = elements.select("p");
        for (Element element:ps){
            final String text = element.text().trim();
            if (StringUtils.isEmpty(text)){
                continue;
            }
            String [] keys = text.split("◎");
            final int size =keys.length;
            for (int i=0;i<size;i++){
                final String code = keys[i].trim();
                if (i==0){
                    result.put("name",code);
                    continue;
                }else if (i!=size-1){
                    DyttMoive moive = DyttMoive.getContent(code);
                    if (moive==null){
                        continue;
                    }
                    String tmp = code.replace(moive.getName(),"");
                    result.put(moive.getValue(),tmp.trim());
                }else{
                    DyttMoive moive = DyttMoive.getContent(code);
                    if (moive==null){
                        continue;
                    }
                    String tmp = code.replace(moive.getName(),"").replace("【下载地址】 磁力链下载点击这里","");
                    result.put("awards",tmp.trim());
                }
            }
        }
//        String title = document.select("title_all").text().trim();
//        System.out.println("title="+title);
//        result.put("name",title);
        //链接
        Elements as = elements.select("table").select("a[href]");
        for (Element element:as){
            final String href= element.text().trim();
            result.put("link",href);
            break;
        }

        //背景图片
        Elements imgs = elements.select("img");
        for (Element element:imgs){
            String images = element.attr("src").trim();
            result.put("images",images);
            break;
        }
        System.out.println(JSON.toJSONString(result));
        return result;
    }




}
