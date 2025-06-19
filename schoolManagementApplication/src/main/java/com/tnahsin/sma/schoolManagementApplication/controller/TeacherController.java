package com.tnahsin.sma.schoolManagementApplication.controller;


import com.tnahsin.sma.schoolManagementApplication.DTO.Attendance;
import com.tnahsin.sma.schoolManagementApplication.entity.Student;
import com.tnahsin.sma.schoolManagementApplication.entity.Teacher;
import com.tnahsin.sma.schoolManagementApplication.repository.TeacherRepository;
import com.tnahsin.sma.schoolManagementApplication.service.AttendanceService;
import com.tnahsin.sma.schoolManagementApplication.service.StudentService;
import com.tnahsin.sma.schoolManagementApplication.service.TeacherService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("teacher")
@RestController
public class TeacherController {


    @Autowired
    StudentService studentService;

    @Autowired
    AttendanceService attendanceService;

    @Autowired
    TeacherService teacherService;

    @PostMapping("/add-teacher")
    public void registerTeacher(@RequestBody Teacher teacher) {
        teacherService.saveTeacher(teacher);
    }

    @GetMapping("/get-all-students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/details/{rollno}")
    public ResponseEntity<?> getDetails(@PathVariable String rollno) {
        return new ResponseEntity<>(studentService.findByRollno(rollno) , HttpStatus.FOUND);
    }

    @PostMapping
    public void AddStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
    }


    @PostMapping("/mark-attendance")
    public ResponseEntity<?> markAttendance(@RequestBody Attendance attendance) {
        boolean b = attendanceService.addAttendanceToStudent(attendance);
        if(b) {
            return new ResponseEntity<>(HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
