package com.sid.customerfrontthymleafapp;

import com.sid.customerfrontthymleafapp.entities.Customer;
import com.sid.customerfrontthymleafapp.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymleafAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("othmane").email("othmane@gmail.com").build());
            customerRepository.save(Customer.builder().name("darhoni").email("darhoni@gmail.com").build());
            customerRepository.save(Customer.builder().name("kapera").email("kapera@gmail.com").build());
        };
    }
}
