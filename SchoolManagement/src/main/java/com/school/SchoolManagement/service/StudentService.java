package com.school.SchoolManagement.service;

import com.school.SchoolManagement.model.Student;
import com.school.SchoolManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public Student saveStudent(Student s) {
        return repo.save(s);
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Optional<Student> getById(String id) {
        return repo.findById(id);
    }

    public void deleteById(String id) {
        repo.deleteById(id);
    }
}

