package kr.ac.hansung.cse.hellopersistentcontext;

import kr.ac.hansung.cse.hellopersistentcontext.entity.Customer;
import kr.ac.hansung.cse.hellopersistentcontext.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerRunner implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    private static final Logger log =
            LoggerFactory.getLogger(CustomerRunner.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {

        // save a few customers
        customerRepository.save(new Customer("Jack", "Bauer"));
        customerRepository.save(new Customer("Chloe", "O'Brian"));
        customerRepository.save(new Customer("Kim", "Bauer"));
        customerRepository.save(new Customer("David", "Palmer"));
        customerRepository.save(new Customer("Michelle", "Dessler"));

        // fetch all customers
        log.info("Customers found with findAll():");
        log.info("-------------------------------");
        for (Customer customer : customerRepository.findAll()) {
            log.info(customer.toString());
        }
        log.info("");

        // fetch an individual customer by ID
        Customer customer = customerRepository.findById(1L).get();
        log.info("Customer found with findById(1L):");
        log.info("--------------------------------");
        log.info(customer.toString());
        log.info("");

        // fetch customers by last name
        log.info("Customer found with findByLastName('Bauer'):");
        log.info("--------------------------------------------");
        customerRepository.findByLastName("Bauer").forEach(bauer -> {
            log.info(bauer.toString());
        });

    }
}
