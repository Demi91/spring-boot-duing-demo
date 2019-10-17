package com.duing;

import com.duing.listener.CustomListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EventListenerApplication {

    public static void main(String[] args) {
         ConfigurableApplicationContext context = SpringApplication.run(EventListenerApplication.class, args);
         context.addApplicationListener(new CustomListener1());
    }

}
