package net.ccfish.jvue.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.ccfish.jvue.model.User;
import net.ccfish.jvue.repository.UserRepository;
import net.ccfish.jvue.service.UserService;

/**
 * Generated by Spring Data Generator on 31/01/2018
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public JpaRepository<User, Long> jpaRepository() {
        return this.userRepository;
    }

}
