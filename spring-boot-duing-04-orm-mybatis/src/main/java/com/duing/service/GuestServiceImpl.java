package com.duing.service;

import com.duing.mapper.GuestMapper;
import com.duing.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestMapper mapper;

    @Override
    public List<Guest> getGuests() {
        return mapper.getGuests();
    }

}
