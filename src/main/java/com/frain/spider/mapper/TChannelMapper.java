package com.frain.spider.mapper;

import com.frain.spider.model.TChannel;
import com.frain.spider.model.TChannelCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TChannelMapper {
    int countByExample(TChannelCriteria example);

    int deleteByExample(TChannelCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TChannel record);

    int insertSelective(TChannel record);

    List<TChannel> selectByExample(TChannelCriteria example);

    TChannel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TChannel record, @Param("example") TChannelCriteria example);

    int updateByExample(@Param("record") TChannel record, @Param("example") TChannelCriteria example);

    int updateByPrimaryKeySelective(TChannel record);

    int updateByPrimaryKey(TChannel record);
}