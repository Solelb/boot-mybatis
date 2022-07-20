package com.bin.service;

import com.bin.mapper.StudentMapper;
import com.bin.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentMapper {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> getStudent() {
        return studentMapper.getStudent();
    }

    @Override
    public List<Student> getStudentByClassDesc() {
        return studentMapper.getStudentByClassDesc();
    }

    @Override
    public List<Student> getColumn() {
        return studentMapper.getColumn();
    }

    @Override
    public int getNumByClass(String Sclass) {
        return studentMapper.getNumByClass(Sclass);
    }

    @Override
    public Student queryBySno(int Sno) {
        return studentMapper.queryBySno(Sno);
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);

    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    @Override
    public int deleteStudent(int Sno) {
        return studentMapper.deleteStudent(Sno);
    }
}
