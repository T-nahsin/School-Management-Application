package com.tnahsin.sma.schoolManagementApplication.repository;

import com.tnahsin.sma.schoolManagementApplication.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


import java.util.Optional;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUsername(String username);

    boolean existsByUsername(String username);
}
