package com.example.amenapp.entities;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class Student  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstname;
    private String lastname;
    private int age;

    @OneToOne(mappedBy = "student")
    @JsonBackReference
    private Address address;

    @ManyToMany
    @JoinTable(
            name = "std_sub",
            joinColumns = {@JoinColumn(name = "std_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "sub_id", referencedColumnName = "id")}
    )
    @JsonManagedReference
    private List<Subject> subjects;
}
