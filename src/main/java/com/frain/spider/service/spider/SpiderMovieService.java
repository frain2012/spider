package com.frain.spider.service.spider;

import java.util.List;
import java.util.Map;

public interface SpiderMovieService{
    /**
     * 匹配第一层内容(主页)
     * @param link
     * @param rule
     * @return
     */
    List<String> firstMatchContent(final String link, final String rule);

    /**
     * 匹配第二层内容(列表页)
     * @param links
     * @param rule
     * @return
     */
    List<String> secondMatchContent(final String links,final String rule);


    /**
     * 匹配第三层内容(详情页)
     * @param link
     * @param rule
     * @return
     */
    Map ThirdMatchContent(final String link,final String rule);



}
