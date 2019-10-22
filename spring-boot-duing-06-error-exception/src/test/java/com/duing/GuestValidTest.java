package com.duing;

import com.duing.bean.Guest;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class GuestValidTest {


    public static void main(String[] args) {
        //通过Validation创建一个validator实例  （普通模式）
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

        //创建一个快速失败模式的实例
        Validator validatorFastFail = Validation.byDefaultProvider().configure()
                .addProperty("hibernate.validator.fail_fast", "true").
                        buildValidatorFactory().getValidator();

        //创建一个不符合要求的bean
        Guest guest = new Guest("", "");
        //开始验证  接收验证结果
        Set<ConstraintViolation<Guest>> violationSet = validator.validate(guest);
        for (ConstraintViolation violation : violationSet) {
            System.out.println(violation.getPropertyPath() + "," + violation.getMessage());
        }

        System.out.println("==============================");

        Set<ConstraintViolation<Guest>> violationFastFailSet = validatorFastFail.validate(guest);
        for (ConstraintViolation violation : violationFastFailSet) {
            System.out.println(violation.getPropertyPath() + "," + violation.getMessage());
        }
    }
}
