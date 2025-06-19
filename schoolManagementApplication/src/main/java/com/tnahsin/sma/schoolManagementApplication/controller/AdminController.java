package com.tnahsin.sma.schoolManagementApplication.controller;


import com.tnahsin.sma.schoolManagementApplication.entity.Student;
import com.tnahsin.sma.schoolManagementApplication.entity.Teacher;
import com.tnahsin.sma.schoolManagementApplication.service.StudentService;
import com.tnahsin.sma.schoolManagementApplication.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;

@RequestMapping("/admin")
@RestController
public class AdminController {

    @Autowired
    TeacherService teacherService;

    @Autowired
    StudentService studentService;



    @GetMapping("/all-students")
    public ResponseEntity<?> getAllStudents() {
        List<Student> studentList = studentService.getAllStudents();
        if(studentList != null) {
            return new ResponseEntity<>(studentList , HttpStatus.FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/get-all-teachers")
    public ResponseEntity<?> getAllTeachers() {
        List<Teacher> teacherList = teacherService.findAllTeachers();
        if(teacherList != null) {
            return new ResponseEntity<>(teacherList , HttpStatus.FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
