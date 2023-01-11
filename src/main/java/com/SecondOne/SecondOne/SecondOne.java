package com.SecondOne.SecondOne;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class SecondOne {
    @Id
    @GeneratedValue
      int Id;
    @Column(name="Firstname")
    String fname;
    @Column(name="Secondname")
    String sname;
    @Column(name="Age")
    String age;
    @Column(name="School")
    String school;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getId() {
        return Id;

    }

    @Override
    public String toString() {
        return "Id:"+Id+
                ",fname:"+fname+
                ",sname:"+sname+
                ",age:"+age+
                ",school:"+school;
    }
}
