package com.duing.dao;

import com.duing.model.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDAO {

    private static List<Guest> guestList = new ArrayList<>();

    static {
        guestList.add(new Guest("黄晓明", "店长"));
        guestList.add(new Guest("秦海璐", "财务总监"));
        guestList.add(new Guest("王俊凯", "大堂经理"));
        guestList.add(new Guest("林述巍", "总厨"));
        guestList.add(new Guest("杨紫", "茶水小妹"));
    }

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void add(Guest guest) {
        guestList.add(guest);
    }

    public void delete(String guestName) {
        guestList.remove(getOne(guestName));
    }

    public void update(Guest oneGuest) {
        getOne(oneGuest.getName()).setRole(oneGuest.getRole());
    }

    public Guest get(String guestName) {
        return getOne(guestName);
    }

    public Boolean isExist(String guestName){
        for (Guest guest : guestList) {
            if (guest.getName().equals(guestName)) {
                return true;
            }
        }
        return false;
    }


    public Guest getOne(String guestName) {
        for (Guest guest : guestList) {
            if (guest.getName().equals(guestName)) {
                return guest;
            }
        }
        return new Guest("null", "null");
    }

}
