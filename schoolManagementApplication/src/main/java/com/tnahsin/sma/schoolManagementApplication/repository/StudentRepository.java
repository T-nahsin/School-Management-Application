package com.tnahsin.sma.schoolManagementApplication.repository;

import com.tnahsin.sma.schoolManagementApplication.entity.Student;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface StudentRepository extends MongoRepository<Student , ObjectId> {
    Optional<Student> findByRollno(String rollno);

    Optional<Student> findById(ObjectId studentId);


}
