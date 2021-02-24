package com.simplilearn.phase3end.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "todos")
@NoArgsConstructor
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    
    @Column(name = "user_name")
    private String userName;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "start_date")
    private Date startDate;
    
    @Column(name = "end_date")
    private Date endDate;
    
    @Column(name = "severity")
    private String severity;

    public Todo(String user, String desc, Date startDate, Date endDate, String severity, boolean isDone) {
        super();
        this.userName = user;
        this.description = desc;
        this.startDate = startDate;
        this.endDate = endDate;
        this.severity = severity;
    }
}