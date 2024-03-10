package com.example.practisesunday;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    public String findByFirstName(String firstName);
    public List<Student> findAllByAge(int age);
}
