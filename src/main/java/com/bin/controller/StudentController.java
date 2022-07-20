package com.bin.controller;

import com.bin.mapper.StudentMapper;
import com.bin.pojo.Student;
import com.bin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/student")
    public List<Student> queryStudent(){
        List<Student> studentList = studentService.getStudent();
        for (Student student : studentList) {
            System.out.println(student);
        }
        return studentList;
    }

    @RequestMapping("/desc")
    public List<Student> queryStudentByClassDesc(){
        List<Student> studentByClassDescList = studentService.getStudentByClassDesc();
        for (Student student : studentByClassDescList) {
            System.out.println(student);
        }
        return studentByClassDescList;
    }

    @RequestMapping("/c")
    public List<Student> queryColumn(){
        List<Student> columnList = studentService.getColumn();
        return columnList;
    }

    @RequestMapping("/num")
    public int queryCountByClass(String Sclass){
        int numByClass = studentService.getNumByClass(Sclass);
        System.out.println(numByClass);
        return numByClass;
    }

    @RequestMapping("/id")
    public Student queryById(int Sno){
        Student student = studentService.queryBySno(Sno);
        System.out.println(student);
        return student;
    }

    @PostMapping("/save")
    public int saveStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PostMapping("/update")
    public int updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @RequestMapping("/delete")
    public int deleteStudent(@RequestParam("Sno") int Sno){
        return studentService.deleteStudent(Sno);
    }
}
