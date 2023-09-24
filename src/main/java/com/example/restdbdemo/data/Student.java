package com.example.restdbdemo.data;

import javax.persistence.*;

@Entity     //  so the spring container is going to identify this as an entity
@Table(name = "student")      //  name of the table, must be as it is
public class Student {
    //  columns of the table

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //  whatever the strategy used in the table, apply it to here as well
    //  all these annotations is because this column is the most important column in the table
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
