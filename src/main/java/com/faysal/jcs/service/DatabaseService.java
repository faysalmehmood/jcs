package com.faysal.jcs.service;


import com.faysal.jcs.beans.City;
import com.faysal.jcs.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DatabaseService {

    @Autowired
    CityRepository cityRepository;


    List<City> cities = new ArrayList<>();

    public void cacheTable() {
        cities = cityRepository.findAll();
    }
}
