package com.duing.service;

import com.duing.model.Guest;

import java.util.List;

public interface GuestService {

    List<Guest> getGuests();

    Guest get(String guestName);

    Boolean add(Guest guest);

    Boolean update(Guest guest);

    Boolean delete(String guestName);

}
