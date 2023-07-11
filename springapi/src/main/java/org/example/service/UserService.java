package org.example.service;

import org.example.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Maria", 35, "maria@mail.com");
        User user2 = new User(2, "Dawnie", 33, "dawnie@mail.com");
        User user3 = new User(3, "Faya", 29, "Faya@mail.com");
        User user4 = new User(4, "Sima", 27, "sima@mail.com");
        User user5 = new User(5, "Gabriel", 23, "gabriel@mail.com");

        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
    }

    public User getUser(Integer id) {
        for (User u : userList) {
            if (id == u.getId()) {
                return u;
            }
        }
        System.out.println("User Doesn't exist");
        return null;
    }
}
