package com.duing.controller;

import com.duing.model.Guest;
import com.duing.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/guest/rest")
public class GuestRestController {

    @Autowired
    private GuestService guestService;
    //返回页面的路径
    private String path = "/guest/rest";


    @GetMapping("")
    public String getGuests(Model model) {
        List<Guest> result = guestService.getGuests();
        model.addAttribute("guests", result);
        return path + "/list";
    }

    @GetMapping("/toAdd")
    public String toAdd() {
        return path + "/add";
    }

    @PostMapping("")
    public String add(Guest guest) {
        guestService.add(guest);
        return "redirect:" + path;
    }


    @DeleteMapping("/{name}")
    public String delete(@PathVariable(name = "name") String name) {
        guestService.delete(name);
        return "redirect:" + path;
    }


    @GetMapping("/{name}")
    public String toEdit(Model model, @PathVariable(name = "name") String name) {
        Guest guest = guestService.get(name);
        model.addAttribute("guest", guest);
        return path + "/edit";
    }

    @PutMapping("")
    public String update(Guest guest) {
        guestService.update(guest);
        return "redirect:" + path;
    }


}
