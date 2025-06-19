package com.tnahsin.sma.schoolManagementApplication.service;

import com.tnahsin.sma.schoolManagementApplication.DTO.Attendance;
import com.tnahsin.sma.schoolManagementApplication.entity.Student;
import com.tnahsin.sma.schoolManagementApplication.repository.AttendanceRepository;
import com.tnahsin.sma.schoolManagementApplication.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
public class AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    @Autowired
    StudentRepository studentRepository;


    @Autowired
    StudentService studentService;


    public boolean addAttendanceToStudent(Attendance attendance) {
        try {
            Student student = studentRepository.findById(attendance.getStudentId())
                    .orElseThrow(() -> new RuntimeException("Student not found"));

            student.getAttendanceList().add(attendance);
            studentRepository.save(student);
            return true;
        } catch (Exception e) {
            log.error("e: ", e);
            return false;
        }
    }

    public List<Attendance> getAttendanceByStudentId(ObjectId studentId) {
        try {
            Optional<Student> st = studentService.findById(studentId);
            if (st.isPresent()) {
                return st.get().getAttendanceList();
            } else {
                throw new RuntimeException("Student not found with ID: " + studentId);
            }
        } catch (Exception e) {
            log.error("Student Id cant be generated");
            return null;
        }
    }

    public List<Attendance> getAttendanceByDateRange(ObjectId studentId, LocalDate start, LocalDate end) {
        return studentService.findById(studentId)
                .map(student -> student.getAttendanceList().stream()
                        .filter(a -> !a.getDate().isBefore(start) && !a.getDate().isAfter(end))
                        .collect(Collectors.toList()))
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

}
