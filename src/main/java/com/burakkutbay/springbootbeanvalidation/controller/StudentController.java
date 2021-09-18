package com.burakkutbay.springbootbeanvalidation.controller;

import com.burakkutbay.springbootbeanvalidation.model.Student;
import com.burakkutbay.springbootbeanvalidation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author : Burak KUTBAY
 * Date    : 17.09.2021
 */
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/save")
    ResponseEntity<String> addStudent(@Valid @RequestBody Student student) {
        studentService.save(student);
        return ResponseEntity.ok("Student Saved");
    }

}
