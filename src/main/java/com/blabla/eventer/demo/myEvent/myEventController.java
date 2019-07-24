package com.blabla.eventer.demo.myEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class myEventController {
    @Autowired
    myEventService myEventService;

    @GetMapping("/event")
    public List<myEvent> getAllEvent(){
        return myEventService.eventsList();
    }

    @PostMapping("/event")
    public myEvent saveEvent(@RequestBody myEvent myEvent){
        return myEventService.addEvent(myEvent);
    }

    @PutMapping("/event")
    public myEvent updateEvent(@RequestBody myEvent myEvent){
        return myEventService.updateEvent(myEvent);
    }

    @DeleteMapping("/event")
    public boolean deleteEvent(Long id){
        return myEventService.delEvent(id);
    }

}
