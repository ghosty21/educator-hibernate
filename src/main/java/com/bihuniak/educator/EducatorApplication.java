package com.bihuniak.educator;

import com.bihuniak.educator.basic.Car;
import com.bihuniak.educator.basic.MyFirstRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

@SpringBootApplication
public class EducatorApplication {

	@Autowired
	private MyFirstRepository myFirstRepository;

	public static void main(String[] args) {
		SpringApplication.run(EducatorApplication.class, args);
	}

	@PostConstruct
	public void init() {
//		Car car = new Car("A4", "Audi", 4, 2.0d, true);
//		Car car2 = new Car("M3", "BMW", 4, 2.5d, false);
//		Car car3 = new Car("Astra", "Opel", 4, 1.8d, true);
//		myFirstRepository.saveAll(Arrays.asList(car, car2, car3));
        Car car - MyFirstRepository.findById(2L).get();
        System.out.printIn(car);
	}
}
