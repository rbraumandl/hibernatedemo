package com.elvessoftware.hibernatedemo;

import com.elvessoftware.hibernatedemo.model.PersonRemarks;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class HibernatedemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(HibernatedemoApplication.class, args);
    }

    private PersonRemarkService personRemarkService;

    public HibernatedemoApplication(PersonRemarkService personRemarkService) {
        this.personRemarkService = personRemarkService;
    }

    @Override
    public void run(String... args) throws Exception {
        List<PersonRemarks> all = personRemarkService.all();
        for (PersonRemarks personRemark :
                all) {
            System.out.println(personRemark);
        }

    }
}
