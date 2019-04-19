package com.mapper;

import com.pojo.UserComments;
import com.pojo.UserCommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCommentsMapper {
    int countByExample(UserCommentsExample example);

    int deleteByExample(UserCommentsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserComments record);

    int insertSelective(UserComments record);

    List<UserComments> selectByExample(UserCommentsExample example);

    UserComments selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserComments record, @Param("example") UserCommentsExample example);

    int updateByExample(@Param("record") UserComments record, @Param("example") UserCommentsExample example);

    int updateByPrimaryKeySelective(UserComments record);

    int updateByPrimaryKey(UserComments record);
}