/**
 * @Title: MpServiceImpl
 * @Package com.frain.spider.service.mp
 */
package com.frain.spider.service.mp;

import com.alibaba.fastjson.JSON;
import com.frain.spider.mapper.TMpMapper;
import com.frain.spider.model.TMp;
import com.frain.spider.model.TMpConf;
import com.frain.spider.utils.HttpClientUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description: TODO(抓取)
 * @author frain.gui
 * @create 2018/9/5 14:43
 * @version v1.0
 */
@Service
public class MpServiceImpl implements  MpService{

    @Autowired
    private TMpMapper tMpMapper;

    @Override
    public void spider(TMpConf conf) {
        final String url = conf.getUrl();
        List<TMp> mps = transToObj(url,conf.getLabel());
        if (mps!=null && !mps.isEmpty()){
            for (TMp mp:mps) {
                mp.setCreatetime(new Date());
                tMpMapper.insertSelective(mp);
            }
        }

    }

    private List<TMp> transToObj(final String url,final String label){
        System.out.println(url);
        List<TMp> mps = new ArrayList<>();
        final String body = HttpClientUtil.get(url,"utf-8");
        if (body == null){
            return null;
        }
        final Document document = Jsoup.parse(body);
        System.out.println("------1-----");
        Elements elements = document.getElementsByClass("news-list").select("li");
        for (Element element:elements) {
            System.out.println("------2-------");
            TMp mp = new TMp();
            final String images = element.select(".img-box img").attr("src");
            mp.setImages(images);
            Elements box = element.select(".txt-box > h3 > a");
            final String link = box.attr("href");
            mp.setLink(link);
            final String title = box.text();
            mp.setTitle(title);
            final String mark = element.select(".txt-info").text();
            mp.setMark(mark);
            final String mp_name = element.select(".s-p > a").text();
            final String mp_href = element.select(".s-p > a").attr("href");
            mp.setMpName(mp_name);
            mp.setMpHistory(mp_href);
            mp.setLabel(label);

            if (!StringUtils.isEmpty(link)){
                final String  ur = link.replaceAll("http://","https://");
                System.out.println(ur);
                long stat =System.currentTimeMillis();
                final String content = getContent(ur);
                mp.setContent(content);
                System.out.println(System.currentTimeMillis()-stat);
            }
            System.out.println(JSON.toJSONString(mp));
            mps.add(mp);
        }
        return mps;
    }

    private String getContent(String url){
        String  ur = url.replaceAll("http://","https://");
        final String content = HttpClientUtil.get(ur,"utf-8");
        if (content == null){
            return null;
        }
        StringBuilder str = new StringBuilder();
        Document document = Jsoup.parse(content);
        final Elements elements = document.select("#js_content");
        for ( Element element:elements){
            final Elements imgs = elements.select("img");
            if (imgs.size()>0){
                for (Element img:imgs){
                    String ims = img.attr("data-src");
                    str.append("<img src='"+ims+"' />");
                }
            }
            str.append(element.text());
        }
        return str.toString();
    }
}
