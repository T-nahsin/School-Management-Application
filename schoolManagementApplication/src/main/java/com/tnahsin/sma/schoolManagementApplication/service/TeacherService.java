package com.tnahsin.sma.schoolManagementApplication.service;

import com.tnahsin.sma.schoolManagementApplication.entity.Student;
import com.tnahsin.sma.schoolManagementApplication.entity.Teacher;
import com.tnahsin.sma.schoolManagementApplication.repository.StudentRepository;
import com.tnahsin.sma.schoolManagementApplication.repository.TeacherRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    public void saveTeacher(Teacher teacher) {teacherRepository.save(teacher);}

    public List<Teacher> findAllTeachers(){
        return teacherRepository.findAll();
    }

    public Optional<Teacher> findById(ObjectId id) {
        return teacherRepository.findById(id);
    }

    public void deleteTeacher(ObjectId id) {
        teacherRepository.deleteById(id);
    }
}
