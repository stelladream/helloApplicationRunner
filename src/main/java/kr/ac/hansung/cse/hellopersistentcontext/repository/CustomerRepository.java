package kr.ac.hansung.cse.hellopersistentcontext.repository;

import kr.ac.hansung.cse.hellopersistentcontext.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}
