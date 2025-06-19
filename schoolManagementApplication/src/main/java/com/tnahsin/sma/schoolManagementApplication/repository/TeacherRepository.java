package com.tnahsin.sma.schoolManagementApplication.repository;

import com.tnahsin.sma.schoolManagementApplication.entity.Teacher;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.security.core.userdetails.User;

public interface TeacherRepository extends MongoRepository<Teacher, ObjectId> {
}
