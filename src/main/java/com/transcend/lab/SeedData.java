package com.transcend.lab;

import com.transcend.lab.domain.Account;
import com.transcend.lab.services.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.stream.IntStream;

@Component
@Profile("middle")
public class SeedData implements ApplicationListener<ContextRefreshedEvent> {
    private static Logger LOG = LoggerFactory
            .getLogger(SeedData.class);

    AccountService accountService;

    public SeedData(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        this.run();

    }

    public void run(String... args) {
        IntStream.rangeClosed(1, 10).forEach(i -> {
            Account account = new Account();
            Double rnd = Math.random() * 10000;
            account.setOwner(nameGen());
            account.setBalance(rnd.intValue());
            accountService.saveAccount(account);
            LOG.info(account.toString() + " Saved to Database");
        });
    }

    public String nameGen() {
        String[] names = {
                "Douglass Koll",
                "Shonda Gowen",
                "Ha Bowman",
                "Chas Borelli",
                "Kermit Highfill",
                "Elyse Bull",
                "Palma Copp",
                "Zetta Tsan",
                "Porsha Alpert",
                "Karima Marie",
                "Miguel Glandon",
                "Bryce Creegan",
                "Sueann Arnott",
                "Charlotte Bevington",
                "Leticia Casteel",
                "Randa Wessel",
                "Niesha Shaughnessy",
                "Amy Tillett"
        };
        int i = new Random().nextInt(names.length);
        return names[i];

    }
}
