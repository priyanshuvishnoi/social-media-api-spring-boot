package com.priyanshu.socialmediaapi.services;

import com.priyanshu.socialmediaapi.error.UserAlreadyExistsException;
import com.priyanshu.socialmediaapi.models.User;
import com.priyanshu.socialmediaapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(String name, String password, String email, int age) throws UserAlreadyExistsException {
        User user = userRepository.findUserByEmail(email);

        if (user != null) {
            throw new UserAlreadyExistsException();
        }

        User newUser = new User(email, name, password, age);

        return userRepository.save(newUser);
    }
}
