package com.frain.spider.utils;

import org.springframework.util.StringUtils;

import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class UrlUtil {
    private UrlUtil(){}


    public static String getDomain(String url){
        if (StringUtils.isEmpty(url)){
            return null;
        }
        try {
            URL effectiveURI = new URL(url);
            int port = effectiveURI.getPort();
            return effectiveURI.getProtocol()+"://"+effectiveURI.getHost()+(port<0?"":":"+port);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


    /**过滤HTML里去除img、p、span外的所有标签
     * @param str
     * @return
     * @throws PatternSyntaxException
     */
    public static String stringFilter(String str)throws PatternSyntaxException {
        String regEx = "(?!<(img|strong|font|a).*?>)<.*?>";
        Pattern p_html = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher m_html = p_html.matcher(str);
        str = m_html.replaceAll("");
        return str.trim();
    }


    public static void main(String[] args){
        System.out.println(getDomain("https://127.0.0.2:8090/a.html"));
    }
}
