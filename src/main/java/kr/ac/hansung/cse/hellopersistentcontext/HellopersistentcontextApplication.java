package kr.ac.hansung.cse.hellopersistentcontext;

import kr.ac.hansung.cse.hellopersistentcontext.entity.Customer;
import kr.ac.hansung.cse.hellopersistentcontext.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HellopersistentcontextApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellopersistentcontextApplication.class, args);
    }

}
