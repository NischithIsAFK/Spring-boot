package com.nis.SpringBootFirst;

import com.nis.SpringBootFirst.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Saved");
    }
}
