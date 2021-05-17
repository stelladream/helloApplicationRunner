package kr.ac.hansung.cse.hellopersistentcontext;

import kr.ac.hansung.cse.hellopersistentcontext.entity.Customer;
import kr.ac.hansung.cse.hellopersistentcontext.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class HellopersistentcontextApplicationTests {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    void persistMergeTest() {

        /* Customer customer1 = new Customer();
        customer1.setFirstName("Alice");
        customer1.setLastName("Kim");
        Customer savedCustomer = customerRepository.save(customer1); //persist()
        assertEquals(customer1, savedCustomer);

        Customer customer2 = new Customer();
        customer2.setId(savedCustomer.getId());
        customer2.setFirstName("Bob");
        customer2.setLastName("Lee");
        Customer mergedCustomer = customerRepository.save(customer2);  // merge()
        assertNotEquals(customer2, mergedCustomer);

        List<Customer> customers = customerRepository.findAll();
        assertEquals(customers.size(), 6);

        for (Customer customer : customers) {
            System.out.println("-->" + customer.toString() );
        } */
    }

}
