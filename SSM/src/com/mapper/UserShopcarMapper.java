package com.mapper;

import com.pojo.UserShopcar;
import com.pojo.UserShopcarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserShopcarMapper {
    int countByExample(UserShopcarExample example);

    int deleteByExample(UserShopcarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserShopcar record);

    int insertSelective(UserShopcar record);

    List<UserShopcar> selectByExample(UserShopcarExample example);

    UserShopcar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserShopcar record, @Param("example") UserShopcarExample example);

    int updateByExample(@Param("record") UserShopcar record, @Param("example") UserShopcarExample example);

    int updateByPrimaryKeySelective(UserShopcar record);

    int updateByPrimaryKey(UserShopcar record);
}