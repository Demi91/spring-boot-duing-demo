package com.duing.controller;

import com.duing.bean.Guest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;


/**
 * 业务控制类  返回json
 * @Api 声明一系列接口的功能   放在controller之上
 */
@RestController
@RequestMapping("/guest")
@Api(tags = "嘉宾相关的接口",description = "对嘉宾进行增删改查的接口")
public class GuestController {

    /**
     * @ApiOperation
     * 声明具体接口的功能  放在controller的方法之上
     * @param model
     * @return
     */
    @GetMapping
    @ApiOperation("查询嘉宾列表")
    public String list(Model model){
        return "list";
    }

    @ApiIgnore
    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    @PostMapping
    @ApiOperation("增加嘉宾接口")
    public String add(Guest guest){
        return "add guest";
    }

    /**
     * @ApiIgnore
     * 不显示此接口
     * @param name
     * @return
     */
    @ApiIgnore
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(@PathVariable("name") String name){
        return "update";
    }

    @ApiOperation("更新嘉宾接口")
    @PutMapping
    public String update(Guest guest){
        return "update guest";
    }


    @ApiOperation("删除嘉宾接口")
    @ApiImplicitParam(name = "name",value = "姓名")
    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name){
        return "delete guest";
    }
}
