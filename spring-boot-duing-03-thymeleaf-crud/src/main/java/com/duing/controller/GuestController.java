package com.duing.controller;

import com.duing.model.Guest;
import com.duing.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GuestController {

    @Autowired
    private GuestService guestService;

    @RequestMapping("/guest/list")
    public String getGuests(Model model){
        List<Guest> result = guestService.getGuests();
        model.addAttribute("guests",result);
        return "guest/list";
    }

    @RequestMapping("/guest/toAdd")
    public String toAdd(){
        return "guest/add";
    }

    @RequestMapping("/guest/add")
    public String add(Guest guest){
        guestService.add(guest);
        return "redirect:/guest/list";
    }

    @RequestMapping("/guest/delete")
    public String delete(String name){
        guestService.delete(name);
        return "redirect:/guest/list";
    }


    @RequestMapping("/guest/toEdit")
    public String toEdit(Model model,String name){
        Guest guest = guestService.get(name);
        model.addAttribute("guest",guest);
        return "/guest/edit";
    }

    @RequestMapping("/guest/update")
    public String update(Guest guest){
        guestService.update(guest);
        return "redirect:/guest/list";
    }


}
