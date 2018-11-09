package com.frain.spider.mapper;

import com.frain.spider.model.TSpider;
import com.frain.spider.model.TSpiderCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSpiderMapper {
    int countByExample(TSpiderCriteria example);

    int deleteByExample(TSpiderCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TSpider record);

    int insertSelective(TSpider record);

    List<TSpider> selectByExample(TSpiderCriteria example);

    TSpider selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TSpider record, @Param("example") TSpiderCriteria example);

    int updateByExample(@Param("record") TSpider record, @Param("example") TSpiderCriteria example);

    int updateByPrimaryKeySelective(TSpider record);

    int updateByPrimaryKey(TSpider record);
}