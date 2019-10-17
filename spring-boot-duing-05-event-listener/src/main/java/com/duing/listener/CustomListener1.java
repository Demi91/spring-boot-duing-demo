package com.duing.listener;

import com.duing.event.CustomEvent;
import org.springframework.context.ApplicationListener;


public class CustomListener1 implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent event) {
        event.printMessage("CustomListener1监听到了");
    }
}
