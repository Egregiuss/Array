package com.egregius.Array;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HashMapController {

        HashMap<String, String> capitalCities = new HashMap<>();

    public HashMapController () {



        capitalCities.put("England" ,"London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

    }

    @RequestMapping("/city")
    public HashMap<String, String> capitalCities(){

      return capitalCities;
    }


}








