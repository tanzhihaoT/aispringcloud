package com.southwind.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private long id;
    private String name;
    private int age;

   /* public Student(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }*/
}
