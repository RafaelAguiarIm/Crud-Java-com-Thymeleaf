package com.project.thymeleaf.models;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Data
public class Task {

    public Task(){
    }
    public Task(Long id, String name, Date date){
        this.id = id;
        this.name = name;
        this.date = date;
    }
    private Long id;
    private String name;
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private Date date;

}
