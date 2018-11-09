package com.frain.spider.service.hander;

import com.frain.spider.mapper.TFilmDetailMapper;
import com.frain.spider.mapper.TFilmMapper;
import com.frain.spider.mapper.TSpiderMapper;
import com.frain.spider.model.TSpider;
import com.frain.spider.service.spider.SpiderMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpiderHander {

    @Autowired
    private SpiderMovieService spiderMovieService;
    @Autowired
    private TFilmMapper tFilmMapper;
    @Autowired
    private TFilmDetailMapper tFilmDetailMapper;
    @Autowired
    private TSpiderMapper tSpiderMapper;

    public void handle(){
        int size = tSpiderMapper.countByExample(null);

        List<TSpider> list = tSpiderMapper.selectByExample(null);

    }
}
