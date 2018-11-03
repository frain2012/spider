package com.frain.spider.service.spider;

import com.frain.spider.utils.HttpClientUtil;
import com.frain.spider.utils.UrlUtil;
import org.springframework.stereotype.Service;

@Service
public class SpiderService {
    private String defaultCharset="UTF-8";
    private String charset; //字符集
    private String domain;  //域名

    /**
     * 爬链接
     * @param url
     * @return
     */
    public String spiderUrl(String url,String charset){
        if (this.charset==null){
        this.charset=(charset==null?defaultCharset:charset);
        }
        if (this.domain==null){
        this.domain = UrlUtil.getDomain(url);
        }
        return HttpClientUtil.get(url,getCharset());
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
