package com.burakkutbay.springbootbeanvalidation.service;

import com.burakkutbay.springbootbeanvalidation.model.Student;
import com.burakkutbay.springbootbeanvalidation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

/**
 * @author : Burak KUTBAY
 * Date    : 18.09.2021
 */
@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void save(Student student){
        studentRepository.save(student);
    }
}
