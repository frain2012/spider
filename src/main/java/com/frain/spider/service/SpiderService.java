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
//        spider("http://weixin.sogou.com/pcindex/pc/pc_16/pc_16.html");
        getContent(null);

//        final String body = HttpClientUtil.get("https://mp.weixin.qq.com/s?timestamp=1535594986&src=3&ver=1&signature=CtYmJavt7D4BSY3hNtB4PTst0IDnlmHQKk5IIRK3fvCyoHP4VsFg7sz4JLDmtG5vPhoqlF68Ikh9jjuLqtw45YGUjfCGsuPOmAjMunaaveK9g-KogwMO5k7GcfLTHU9ZpjI1-GXjjInfUrrDLh7yFn4*ekn7En9iyXcBj05dcO4=");
//        Document document = Jsoup.parse(body);
//        System.out.println(document.body().text());

//        Elements elements = document.getElementsByClass("newest-lists").select("a");
//        for (Element element:elements) {
//            System.out.println("link:"+element.attr("href"));
//            System.out.println("html:"+element.text());
//        }

    }

    public static void spider(final String url){
//        final String body = HttpClientUtil.get(url,"utf-8");
//        Document document = Jsoup.parse(body);
//        Elements elements = document.getElementsByClass("news-list").select("li");
//        for (Element element:elements) {
//            TMp mp = new TMp();
//            final String images = element.select(".img-box img").attr("src");
//            mp.setImages(images);
//            Elements box = element.select(".txt-box > h3 > a");
//            final String link = box.attr("href");
//            mp.setLink(link);
//            final String title = box.text();
//            mp.setTitle(title);
//            final String mark = element.select(".txt-info").text();
//            mp.setMark(mark);
//            final String mp_name = element.select(".s-p > a").text();
//            final String mp_href = element.select(".s-p > a").attr("href");
//            mp.setMpName(mp_name);
//            mp.setMpHistory(mp_href);
//
//            if (!StringUtils.isEmpty(link)){
//                final String content = getContent(link);
//                mp.setContent(content);
//            }
//            System.out.println(JSON.toJSONString(mp));
//        }
    }

    public static String getContent(final String url){
        String  link ="https://mp.weixin.qq.com/s?src=11&timestamp=1536130820&ver=1103&signature=TRWtXSKb9fk3T**a4shjRksJ7Q5I091*FmtBoX8vqmsstTTrH9OusgI2z4mLJfXksDvKLB4XbhCxEmNQsk-oCyRIEmoR7e-hk1-KTtILwspSz4-Vh512qCvrKN4Ka-2A&new=1";
        final String content = HttpClientUtil.get(link,"utf-8");
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
//        return null;
    }
}
