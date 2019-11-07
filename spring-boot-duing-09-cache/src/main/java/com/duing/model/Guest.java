package com.duing.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guest implements Serializable {

    private static final long serialVersionUID = -9214582588351579637L;
    private Integer id;
    private String name;
    private String role;
}
