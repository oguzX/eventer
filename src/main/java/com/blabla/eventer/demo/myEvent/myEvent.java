package com.blabla.eventer.demo.myEvent;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "events")
@Data
public class myEvent {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;
    private String Date;
    private String Address;
}
