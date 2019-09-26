package ew.demo.dao;

import ew.demo.model.student;
import ew.demo.model.studentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface studentMapper {
    long countByExample(studentExample example);

    int deleteByExample(studentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(student record);

    int insertSelective(student record);

    List<student> selectByExampleWithBLOBs(studentExample example);

    List<student> selectByExample(studentExample example);

    student selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") student record, @Param("example") studentExample example);

    int updateByExampleWithBLOBs(@Param("record") student record, @Param("example") studentExample example);

    int updateByExample(@Param("record") student record, @Param("example") studentExample example);

    int updateByPrimaryKeySelective(student record);

    int updateByPrimaryKeyWithBLOBs(student record);

    int updateByPrimaryKey(student record);
}