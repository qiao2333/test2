package com.mapper;

import com.pojo.Borrowbooks;
import com.pojo.BorrowbooksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowbooksMapper {
    int countByExample(BorrowbooksExample example);

    int deleteByExample(BorrowbooksExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Borrowbooks record);

    int insertSelective(Borrowbooks record);

    List<Borrowbooks> selectByExample(BorrowbooksExample example);

    Borrowbooks selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Borrowbooks record, @Param("example") BorrowbooksExample example);

    int updateByExample(@Param("record") Borrowbooks record, @Param("example") BorrowbooksExample example);

    int updateByPrimaryKeySelective(Borrowbooks record);

    int updateByPrimaryKey(Borrowbooks record);
}