package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String...args) throws Exception {
        this.userRepository.save(new User("Arvind", "arvind@gmail.com", "FIRST CLASS"));
        this.userRepository.save(new User("Prajwal","Prajwalsade@gmail.com", "FAIL"));
        this.userRepository.save(new User("Gowthami","gowths@gmail.com", "DISTINCTION"));
        this.userRepository.save(new User("Tejashwini","teju@gmail.com", "DISTINCTION"));
    }
}