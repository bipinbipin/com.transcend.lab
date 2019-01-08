package com.transcend.lab;

import com.transcend.lab.domain.Account;
import com.transcend.lab.services.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;
import java.util.stream.IntStream;

@SpringBootApplication
public class LabApplication {

    private static Logger LOG = LoggerFactory
            .getLogger(LabApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(LabApplication.class, args);
    }


}

