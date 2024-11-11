package com.nis.SpringBootFirst.service;

import com.nis.SpringBootFirst.LaptopRepository;
import com.nis.SpringBootFirst.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;
    public void addLaptop(Laptop lap){
        repo.save(lap);
    }

    public boolean isGoodForGaming(Laptop lap){
        return true;
    }
}
