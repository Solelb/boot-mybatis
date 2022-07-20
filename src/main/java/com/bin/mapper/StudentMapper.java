package com.bin.mapper;

import com.bin.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {

    //查询所有学生
    List<Student> getStudent();

    //查询学生按班级降序排序
    List<Student> getStudentByClassDesc();

    //查询某列所有信息
    List<Student> getColumn();

    //查询某班级的人数
    int getNumByClass(String Sclass);

    //按学号查询学生
    Student queryBySno(int Sno);

    //添加一个学生
    int addStudent(Student student);

    //添加多个学生
    int insertManyStudents(@Param("list") List<Student> studentList);

    //修改学生信息
    int updateStudent(Student student);

    //删除学生
    int deleteStudent(int Sno);
}
