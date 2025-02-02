package com.example.dao;

import com.example.model.Student;

import java.util.List;

public interface GenericDao<T, T1> {
    void save(Student entity);

    Student findById(Long id);

    Student findByEmail(String email);

    List<Student> findAll();

    Student update(Student entity);

    boolean deleteById(Long id);
}
