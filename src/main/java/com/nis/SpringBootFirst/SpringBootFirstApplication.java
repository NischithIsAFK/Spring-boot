package com.nis.SpringBootFirst;

import com.nis.SpringBootFirst.model.Alien;
import com.nis.SpringBootFirst.model.Laptop;
import com.nis.SpringBootFirst.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootFirstApplication.class, args);

		LaptopService service=context.getBean(LaptopService.class);
		Laptop lap=context.getBean(Laptop.class);
		service.addLaptop(lap);



//		Alien obj= context.getBean(Alien.class);
//		obj.code();
	}

}
