package com.javacommunity.cg.studentservice.model;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {


    @Id
    private Integer id;
    private String name;
    private int age;
    private String gender;
    private Integer schoolId;
}
