package org.shop;

import org.shop.api.UserService;
import org.shop.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserInitializer {

    @Autowired
    private UserService userService;

    public void initUsers() {
        User user = null;
        
        user = new User();
        user.setUsername("Ivan Ivanov");
        userService.registerUser(user);
        
        user = new User();
        user.setUsername("Petr Petrov");
        userService.registerUser(user);
    }
}
