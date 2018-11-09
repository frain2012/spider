package com.frain.spider.mapper;

import com.frain.spider.model.TType;
import com.frain.spider.model.TTypeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTypeMapper {
    int countByExample(TTypeCriteria example);

    int deleteByExample(TTypeCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TType record);

    int insertSelective(TType record);

    List<TType> selectByExample(TTypeCriteria example);

    TType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TType record, @Param("example") TTypeCriteria example);

    int updateByExample(@Param("record") TType record, @Param("example") TTypeCriteria example);

    int updateByPrimaryKeySelective(TType record);

    int updateByPrimaryKey(TType record);
}