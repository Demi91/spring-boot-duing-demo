package com.duing.service;


import com.duing.model.Guest;
import com.duing.dao.GuestDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestDAO dao;

    @Override
    public List<Guest> getGuests() {
        return dao.getGuestList();
    }

    @Override
    public Guest get(String guestName) {
        return dao.get(guestName);
    }

    @Override
    public Boolean add(Guest guest) {
        dao.add(guest);
        return true;
    }

    @Override
    public Boolean update(Guest guest) {
        if(dao.isExist(guest.getName())) {
            dao.update(guest);
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String guestName) {
        if(dao.isExist(guestName)) {
            dao.delete(guestName);
            return true;
        }
        return false;
    }
}
