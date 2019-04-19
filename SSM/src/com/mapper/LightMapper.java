package com.mapper;

import com.pojo.Light;
import com.pojo.LightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LightMapper {
    int countByExample(LightExample example);

    int deleteByExample(LightExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Light record);

    int insertSelective(Light record);

    List<Light> selectByExample(LightExample example);

    Light selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Light record, @Param("example") LightExample example);

    int updateByExample(@Param("record") Light record, @Param("example") LightExample example);

    int updateByPrimaryKeySelective(Light record);

    int updateByPrimaryKey(Light record);
}