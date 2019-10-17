package com.duing.listener;

import com.duing.event.CustomEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomListener3 {

    @EventListener
    public void eventListener(CustomEvent event){
        event.printMessage("CustomListener3监听到了");
    }
}
