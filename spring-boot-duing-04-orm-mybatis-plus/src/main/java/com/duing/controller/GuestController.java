package com.duing.controller;

import com.duing.service.GuestService;
import com.duing.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;


    @GetMapping("")
    public String getGuests(Model model) {
        List<Guest> result = guestService.list();
        model.addAttribute("guests", result);
        return "/list";
    }

    @GetMapping("/toAdd")
    public String toAdd(){
        return "/add";
    }

//    @Transactional
    @PostMapping("")
    public String add(Guest guest){
        guestService.save(guest);
//        int result = 1/0;
        return "redirect:/guest";
    }

}
