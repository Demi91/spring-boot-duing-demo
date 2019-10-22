package com.duing.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data @AllArgsConstructor
public class Guest {

    @NotBlank(message = "{guest.name.notblank}")
    private String name;
    @NotBlank
    private String role;
}
