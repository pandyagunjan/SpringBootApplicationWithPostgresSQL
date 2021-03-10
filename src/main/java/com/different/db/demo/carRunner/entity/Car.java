package com.different.db.demo.carRunner.entity;

import lombok.*;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
//@Slf4j
@Log
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String Model;
    private Integer carYear;
    private String brand;
    private String color;
    private String fuelKind;
    private String carURL;


    //log.severe("This should be inside a method!!");

//
}
