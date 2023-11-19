package com.example.amenapp.entities;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
public class Address  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String homeAddress;


    @OneToOne
    @JoinColumn(name = "std_id")
    @JsonManagedReference
    private Student student;
}
