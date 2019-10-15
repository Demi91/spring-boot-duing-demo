package com.duing.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duing.mapper.GuestMapper;
import com.duing.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl extends ServiceImpl<GuestMapper,Guest>
        implements GuestService {

//    @Autowired
//    private GuestMapper mapper;
//
//
//    @Override
//    public List<Guest> getGuests() {
//        return mapper.selectList(null);
//    }

}
