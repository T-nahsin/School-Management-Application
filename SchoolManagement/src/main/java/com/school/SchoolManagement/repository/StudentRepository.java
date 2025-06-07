package com.school.SchoolManagement.repository;

import com.school.SchoolManagement.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface StudentRepository extends MongoRepository<Student, String> {
    Optional<Student> findByRollNo(String rollNo);
}
