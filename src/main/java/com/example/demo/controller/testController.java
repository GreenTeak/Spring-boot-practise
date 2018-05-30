//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.demo.controller;

import com.example.demo.module.Student;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"test"})
public class testController {
    public testController() {
    }

    @GetMapping({"employees"})
    public List<Student> getStudentManlist() {
        List<Student> students = new ArrayList();
        Student stu1 = new Student(0, "Tom", 20, "man");
        Student stu2 = new Student(1, "Alice", 21, "woman");
        Student stu3 = new Student(2, "Sam", 21, "man");
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        return students;
    }
}



