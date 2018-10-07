package com.learning.jpa.jpatraining;

import com.learning.jpa.jpatraining.entity.User;
import com.learning.jpa.jpatraining.service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class UserDAOServiceCLI implements CommandLineRunner {

    private static final Logger log =
            LoggerFactory.getLogger(UserDAOServiceCLI.class);

    @Autowired
    private UserDAOService userDAOService;

    @Override
    public void run(String... arg0) throws Exception {
        User user  = new User("Jack","Admin");
        long insert = userDAOService.insert(user);
        log.info("New User is created " + user);

    }
}
