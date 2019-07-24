package com.blabla.eventer.demo.myEvent;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "events")
@Data
public class myEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private String Date;
    private String Address;
}
