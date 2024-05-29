package com.java.authentication.service;

import com.java.authentication.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store=new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Peris", "peris.rai@machnetinc.com"));
        store.add(new User(UUID.randomUUID().toString(), "Ramesh", "ramesh@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Suresh", "suresh@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Paresh", "paresh@gmail.com"));
    }
    public List<User> getUsers(){
        return this.store;
    }
}
