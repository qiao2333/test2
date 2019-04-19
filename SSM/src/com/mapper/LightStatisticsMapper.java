package com.mapper;

import com.pojo.LightStatistics;
import com.pojo.LightStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LightStatisticsMapper {
    int countByExample(LightStatisticsExample example);

    int deleteByExample(LightStatisticsExample example);

    int deleteByPrimaryKey(Integer lightId);

    int insert(LightStatistics record);

    int insertSelective(LightStatistics record);

    List<LightStatistics> selectByExample(LightStatisticsExample example);

    LightStatistics selectByPrimaryKey(Integer lightId);

    int updateByExampleSelective(@Param("record") LightStatistics record, @Param("example") LightStatisticsExample example);

    int updateByExample(@Param("record") LightStatistics record, @Param("example") LightStatisticsExample example);

    int updateByPrimaryKeySelective(LightStatistics record);

    int updateByPrimaryKey(LightStatistics record);
}