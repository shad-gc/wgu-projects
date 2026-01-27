package com.example.demo.BootStrapData;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (customerRepository.count() <= 1) {
            Customer jose = new Customer();
            jose.setFirstName("Jose");
            jose.setLastName("Gomez");
            jose.setAddress("444 Red Street");
            jose.setPhone("888-888-8888");
            jose.setPostal_code("888888");
            jose.setDivision(divisionRepository.getReferenceById(2L));

            customerRepository.save(jose);

            Customer shad = new Customer();
            shad.setFirstName("Shad");
            shad.setLastName("Doe");
            shad.setAddress("444 Silver Street");
            shad.setPhone("677-333-4444");
            shad.setPostal_code("11111");
            shad.setDivision(divisionRepository.getReferenceById(67L));

            customerRepository.save(shad);

            Customer rashad = new Customer();
            rashad.setFirstName("Rashad");
            rashad.setLastName("Hussain");
            rashad.setAddress("333 Ruby Road");
            rashad.setPhone("888-666-9999");
            rashad.setPostal_code("132349");
            rashad.setDivision(divisionRepository.getReferenceById(3L));

            customerRepository.save(rashad);

            Customer james = new Customer();
            james.setFirstName("James");
            james.setLastName("Doe");
            james.setAddress("247 Emerald Drive");
            james.setPhone("777-777-7777");
            james.setPostal_code("482984");
            james.setDivision(divisionRepository.getReferenceById(12L));

            customerRepository.save(james);

            Customer jane = new Customer();
            jane.setFirstName("Jane");
            jane.setLastName("Doe");
            jane.setAddress("114 Platinum Street");
            jane.setPhone("241-421-4242");
            jane.setPostal_code("42342");
            jane.setDivision(divisionRepository.getReferenceById(101L));

            customerRepository.save(jane);
        }
    }
}