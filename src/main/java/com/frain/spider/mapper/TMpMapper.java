package com.frain.spider.mapper;

import com.frain.spider.model.TMp;
import com.frain.spider.model.TMpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMpMapper {
    long countByExample(TMpExample example);

    int deleteByExample(TMpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMp record);

    int insertSelective(TMp record);

    List<TMp> selectByExampleWithBLOBs(TMpExample example);

    List<TMp> selectByExample(TMpExample example);

    TMp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMp record, @Param("example") TMpExample example);

    int updateByExampleWithBLOBs(@Param("record") TMp record, @Param("example") TMpExample example);

    int updateByExample(@Param("record") TMp record, @Param("example") TMpExample example);

    int updateByPrimaryKeySelective(TMp record);

    int updateByPrimaryKeyWithBLOBs(TMp record);

    int updateByPrimaryKey(TMp record);
}