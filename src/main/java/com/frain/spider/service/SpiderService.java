/**
 * @Title: SpiderService
 * @Package com.frain.spider.service
 */
package com.frain.spider.service;

import com.frain.spider.utils.HttpClientUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: TODO()
 * @author frain.gui
 * @create 2018/8/29 11:01
 * @version v1.0
 */
public class SpiderService {
    private static Set<String> urlSet =new HashSet<>();

    public static void main(String[] args){
        spider(0,"http://tech.163.com/");
//        final String body = HttpClientUtil.get("http://tech.163.com/");
//        Document document = Jsoup.parse(body);
//        Elements elements = document.getElementsByClass("newest-lists").select("a");
//        for (Element element:elements) {
//            System.out.println("link:"+element.attr("href"));
//            System.out.println("html:"+element.text());
//        }

    }

    public static void spider(final int num,final String url){
        if (url.indexOf("http")>-1){
            if (urlSet.contains(url)){
                return;
            }
            urlSet.add(url);
            final String body = HttpClientUtil.get(url);
            if (body==null){
                return;
            }
            Document document = Jsoup.parse(body);
            Elements elements = document.select("a[href]");
            if (elements==null || elements.isEmpty()){
                return;
            }
//        Elements elements = document.getElementsByClass("newest-lists").select("a");
            for (Element element:elements) {
                String link = element.attr("href");
                if (!link.trim().equals(url)){
                    System.out.println("num:"+num+",link:"+link);
                    System.out.println("num:"+num+",html:"+element.text());
                    spider(num+1,link);
                }

            }
        }
    }
}
