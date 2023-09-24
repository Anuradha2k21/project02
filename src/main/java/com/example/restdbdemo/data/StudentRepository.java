package com.example.restdbdemo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {    //  "Student" is the Entity, Integer is the primary key data type (use wrapper class data types)
    //  interface to interface inheritance it's extends
}
