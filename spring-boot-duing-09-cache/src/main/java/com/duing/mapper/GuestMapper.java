package com.duing.mapper;

import com.duing.model.Guest;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface GuestMapper{

    @Select("select id,name,role from guest")
    List<Guest> getGuests();

    @Select("select id,name,role from guest where id = #{id}")
    Guest getGuestById(int id);

}
