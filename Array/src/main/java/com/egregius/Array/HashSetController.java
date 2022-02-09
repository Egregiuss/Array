package com.egregius.Array;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
@RestController
public class HashSetController {

        HashSet<String> cars = new HashSet<String>();

        public HashSetController(){
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

    }

    @RequestMapping("/cars")
    public HashSet<String> cars(){
            return cars;
    }
}