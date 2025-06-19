package com.tnahsin.sma.schoolManagementApplication.repository;

import com.tnahsin.sma.schoolManagementApplication.DTO.Attendance;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface AttendanceRepository extends MongoRepository<Attendance, ObjectId> {

    List<Attendance> findByStudentId(ObjectId studentId);
    List<Attendance> findByStudentIdAndDateBetween(ObjectId studentId, LocalDate from, LocalDate to);
}
