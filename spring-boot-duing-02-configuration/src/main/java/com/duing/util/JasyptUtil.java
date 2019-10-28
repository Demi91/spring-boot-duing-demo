package com.duing.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {

    public static void main(String[] args) {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("123456!@#");
        String username = encryptor.encrypt("root");
        String password = encryptor.encrypt("root123");
        System.out.println(username);
        System.out.println(password);

        //spWXsaBtIzypjX9XnqKbMA==
        //3NuuW1bIJStZN41WgXLGRw==

        //Mru5gwjAluKSCxkLxdGIKw==
        //A1+yAABwLTuA5ynz7zUKLQ==
    }
}
