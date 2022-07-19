package com.bin.mapper;

import com.bin.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {

    List<Student> getStudent();

    List<Student> getStudentByClassDesc();

    List<Student> getColumn();

    int getNumByClass(@Param("Sclass") String Sclass);

    Student queryBySno(int Sno);
}
