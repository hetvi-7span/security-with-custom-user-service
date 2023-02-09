package com.security.securitywithcustomuserservice.service;

import com.security.securitywithcustomuserservice.entity.LoginUser;
import com.security.securitywithcustomuserservice.entity.User;
import com.security.securitywithcustomuserservice.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class LoginUserDetailService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {

        User user = userRepository.findByUname(username);
        if(user == null){
            throw new UsernameNotFoundException(username);
        }
        return new LoginUser(user);
    }
}
