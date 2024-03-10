package com.example.practisesunday;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolRepository extends JpaRepository<School,Long> {
    public String findBySchoolName(String schoolName);
    public Long findByStudentsNumber();
}
