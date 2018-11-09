package com.frain.spider.mapper;

import com.frain.spider.model.TFilmDetail;
import com.frain.spider.model.TFilmDetailCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFilmDetailMapper {
    int countByExample(TFilmDetailCriteria example);

    int deleteByExample(TFilmDetailCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(TFilmDetail record);

    int insertSelective(TFilmDetail record);

    List<TFilmDetail> selectByExample(TFilmDetailCriteria example);

    TFilmDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TFilmDetail record, @Param("example") TFilmDetailCriteria example);

    int updateByExample(@Param("record") TFilmDetail record, @Param("example") TFilmDetailCriteria example);

    int updateByPrimaryKeySelective(TFilmDetail record);

    int updateByPrimaryKey(TFilmDetail record);
}