package com.target.igniteplus.mvcdemo.service;

import com.target.igniteplus.mvcdemo.model.Login;
import com.target.igniteplus.mvcdemo.model.User;
import com.target.igniteplus.mvcdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String saveUser(User user){
        User user1=userRepository.save(user);
        return user1.getFirstname();
    }

    public User validateUser(Login login){
        User user=userRepository.findByUsernameAndPassword(login.getUsername(),login.getPassword());
        return user;
    }

}
