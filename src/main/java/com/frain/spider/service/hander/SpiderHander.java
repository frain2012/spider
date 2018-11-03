package com.frain.spider.service.hander;

import com.frain.spider.service.spider.SpiderMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpiderHander {

    @Autowired
    private SpiderMovieService spiderMovieService;

    public void spiderMovie(String url){
//        String content = spiderMovieService.spiderUrl(url,"gbk");

    }
}
