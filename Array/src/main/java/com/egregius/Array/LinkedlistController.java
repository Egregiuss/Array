package com.egregius.Array;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
@RestController
public class LinkedlistController {

    LinkedList<String> phone = new LinkedList<String>();

    public LinkedlistController(){
       phone.add("LG");
       phone.add("Samsung");
       phone.add("Huawei");
       phone.add("Xiaomi");
       phone.addFirst("Iphone");
    }

    @RequestMapping("/phone")
    public LinkedList<String> phone(){
        return phone;
    }
}

