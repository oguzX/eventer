package com.blabla.eventer.demo.myEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class myEventService {

    @Autowired
    myEventRepository myEvent;

    public List<myEvent> eventsList(){
        return myEvent.findAll();
    }

    public myEvent addEvent(myEvent newEvent){
        return myEvent.save(newEvent);
    }

    public myEvent updateEvent(myEvent fuEvent){
        return myEvent.save(fuEvent);
    }

    public boolean delEvent(Long id){
        try {
            myEvent.deleteById(id);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }
}
