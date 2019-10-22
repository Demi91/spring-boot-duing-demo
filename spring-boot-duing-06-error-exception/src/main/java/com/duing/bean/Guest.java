package com.duing.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data @AllArgsConstructor
public class Guest {

    @NotBlank(message = "嘉宾名字不能为空")
    private String name;
    @NotBlank
    private String role;
}
