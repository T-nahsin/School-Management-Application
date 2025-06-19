package com.tnahsin.sma.schoolManagementApplication.service;


import com.tnahsin.sma.schoolManagementApplication.DTO.Attendance;
import com.tnahsin.sma.schoolManagementApplication.entity.Student;
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
public class StudentService {

    @Autowired
    StudentRepository studentRepository;






public void saveStudent(Student student) {
    studentRepository.save(student);
}

public List<Student> getAllStudents(){
    return  studentRepository.findAll();
}

public Optional<Student> findById(ObjectId id) {
     return studentRepository.findById(id);
}

public void deleteStudent(ObjectId id) {
    studentRepository.deleteById(id);
}

public Optional<Student> findByRollno(String rollno) {
    return studentRepository.findByRollno(rollno);
}
}
