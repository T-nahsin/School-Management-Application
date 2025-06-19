package com.tnahsin.sma.schoolManagementApplication.controller;


import com.tnahsin.sma.schoolManagementApplication.DTO.Attendance;
import com.tnahsin.sma.schoolManagementApplication.service.AttendanceService;
import com.tnahsin.sma.schoolManagementApplication.service.StudentService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RequestMapping("/student")
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/{rollno}")
    public ResponseEntity<?> getDetails(@PathVariable String rollno) {
        return new ResponseEntity<>(studentService.getAllStudents() , HttpStatus.FOUND);
    }

    @Autowired
    AttendanceService attendanceService;


    @GetMapping("get-attendance/{studentId}")
    public ResponseEntity<?> getAttendanceByStudent(@PathVariable ObjectId studentId) {
        List<Attendance> list = attendanceService.getAttendanceByStudentId(studentId);
        if(list != null) {
            return new ResponseEntity<>(list , HttpStatus.FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @GetMapping("get-attendance-range/{studentId}")
    public ResponseEntity<?> getAttendanceByDateRange(
            @PathVariable ObjectId studentId,
            @RequestParam String from,
            @RequestParam String to
    ) {
        LocalDate fromDate = LocalDate.parse(from);
        LocalDate toDate = LocalDate.parse(to);
        return new ResponseEntity<>(attendanceService.getAttendanceByDateRange(studentId, fromDate, toDate),HttpStatus.FOUND);

    }
}