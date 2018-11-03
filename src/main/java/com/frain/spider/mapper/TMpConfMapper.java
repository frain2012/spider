package com.frain.spider.mapper;

import com.frain.spider.model.TMpConf;
import com.frain.spider.model.TMpConfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMpConfMapper {
    long countByExample(TMpConfExample example);

    int deleteByExample(TMpConfExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TMpConf record);

    int insertSelective(TMpConf record);

    List<TMpConf> selectByExample(TMpConfExample example);

    TMpConf selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TMpConf record, @Param("example") TMpConfExample example);

    int updateByExample(@Param("record") TMpConf record, @Param("example") TMpConfExample example);

    int updateByPrimaryKeySelective(TMpConf record);

    int updateByPrimaryKey(TMpConf record);
}