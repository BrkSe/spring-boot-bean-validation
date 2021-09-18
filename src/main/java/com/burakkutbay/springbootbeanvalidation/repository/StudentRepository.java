package com.burakkutbay.springbootbeanvalidation.repository;

import com.burakkutbay.springbootbeanvalidation.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Burak KUTBAY
 * Date    : 18.09.2021
 */
public interface   StudentRepository extends JpaRepository<Student,Long> {
}
