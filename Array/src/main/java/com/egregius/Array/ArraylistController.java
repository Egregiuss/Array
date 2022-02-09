package com.egregius.Array;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

;import java.util.ArrayList;

@RestController
public class ArraylistController {

    ArrayList<String> school = new ArrayList<String>();

    public ArraylistController(){
        school.add("FUNAAB");
        school.add("OAU");
        school.add("UI");
        school.add("UNN");

    }
    @RequestMapping("/schools")
    public ArrayList<String> schools(){
        return school;
    }

}
