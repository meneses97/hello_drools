package com.example.demo;

import entidade.Fare;
import entidade.Homem;
import entidade.TaxiRide;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.TaxiFareCalculatorService;
import services.TaxiFareConfiguration;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(TaxiFareConfiguration.class);
        TaxiFareCalculatorService taxiFareCalculatorService = (TaxiFareCalculatorService) context.getBean(TaxiFareCalculatorService.class);

//        TaxiFareCalculatorService service = new TaxiFareCalculatorService();
        TaxiRide taxiRide = new TaxiRide();
        taxiRide.setIsNightSurcharge(true);
        taxiRide.setDistanceInMile(190L);
        Fare rideFare = new Fare();
        taxiFareCalculatorService.calculateFare(taxiRide, rideFare);
//        testing


    }



}
