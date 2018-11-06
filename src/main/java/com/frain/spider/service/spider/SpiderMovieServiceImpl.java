package com.frain.spider.service.spider;

import com.alibaba.fastjson.JSON;
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

import static org.jsoup.nodes.Document.OutputSettings.Syntax.html;

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
            String [] keys = text.split("◎");
            for (String key:keys){
                final String code = key.trim();


            }
        }




        //链接
//        Elements as = elements.select("table").select("a[href]");
//        for (Element element:as){
//            System.out.println(element.text());
//            final String href= element.text().trim();
//            result.put("link",href);
//            break;
//        }

        //背景图片
//        Elements imgs = elements.select("img");
//        for (Element element:imgs){
//            String images = element.attr("src").trim();
//            System.out.println(images);
//            result.put("images",images);
//            break;
//        }

        return null;
    }




}
