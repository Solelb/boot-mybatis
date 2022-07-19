package com.bin.pojo;

import java.util.Date;

public class Student {
    private String Sno;
    private String Sname;
    private Date Sbirthday;
    private String Ssex;
    private String Sclass;

    public String getSno() {
        return Sno;
    }

    public void setSno(String sno) {
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
                "Sno='" + Sno + '\'' +
                ", Sname='" + Sname + '\'' +
                ", Sbirthday=" + Sbirthday +
                ", Ssex='" + Ssex + '\'' +
                ", Sclass='" + Sclass + '\'' +
                '}';
    }
}
