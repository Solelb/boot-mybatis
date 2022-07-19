package com.bin.controller;

import com.bin.mapper.StudentMapper;
import com.bin.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("/student")
    public List<Student> queryStudent(){
        List<Student> studentList = studentMapper.getStudent();
        for (Student student : studentList) {
            System.out.println(student);
        }
        return studentList;
    }

    @RequestMapping("/desc")
    public List<Student> queryStudentByClassDesc(){
        List<Student> studentByClassDescList = studentMapper.getStudentByClassDesc();
        for (Student student : studentByClassDescList) {
            System.out.println(student);
        }
        return studentByClassDescList;
    }

    @RequestMapping("/c")
    public List<Student> queryColumn(){
        List<Student> columnList = studentMapper.getColumn();
        return columnList;
    }

    @RequestMapping("/num")
    public int queryCountByClass(){
        int numByClass = studentMapper.getNumByClass("95031");
        System.out.println(numByClass);
        return numByClass;
    }
}
