package com.bin.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Student {
    private Integer Sno;
    private String Sname;
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date Sbirthday;
    private String Ssex;
    private String Sclass;
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Integer getSno() {
        return Sno;
    }

    public void setSno(Integer sno) {
        Sno = sno;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public Date getSbirthday() {
        return Sbirthday;
    }

    public void setSbirthday(Date sbirthday) {
        Sbirthday = sbirthday;
    }

    public String getSsex() {
        return Ssex;
    }

    public void setSsex(String ssex) {
        Ssex = ssex;
    }

    public String getSclass() {
        return Sclass;
    }

    public void setSclass(String sclass) {
        Sclass = sclass;
    }


    @Override
    public String toString() {
        return "Student{" +
                "Sno=" + Sno +
                ", Sname='" + Sname + '\'' +
                ", Sbirthday=" + Sbirthday +
                ", Ssex='" + Ssex + '\'' +
                ", Sclass='" + Sclass + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
