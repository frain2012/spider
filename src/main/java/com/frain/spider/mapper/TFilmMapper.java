package com.frain.spider.mapper;

import com.frain.spider.model.TFilm;
import com.frain.spider.model.TFilmCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFilmMapper {
    int countByExample(TFilmCriteria example);

    int deleteByExample(TFilmCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(TFilm record);

    int insertSelective(TFilm record);

    List<TFilm> selectByExample(TFilmCriteria example);

    TFilm selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TFilm record, @Param("example") TFilmCriteria example);

    int updateByExample(@Param("record") TFilm record, @Param("example") TFilmCriteria example);

    int updateByPrimaryKeySelective(TFilm record);

    int updateByPrimaryKey(TFilm record);
}