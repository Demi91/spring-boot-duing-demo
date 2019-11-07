package com.duing.service;

import com.duing.mapper.GuestMapper;
import com.duing.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
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

    @Cacheable(cacheNames = "guests",key = "#id", unless = "#id>1")
    @Override
    public Guest getGuestById(int id) {
        System.out.println("查询第" + id + "位嘉宾");
        return mapper.getGuestById(id);
    }

}
