package com.security.securitywithcustomuserservice.service;

import com.security.securitywithcustomuserservice.entity.LoginUser;
import com.security.securitywithcustomuserservice.entity.User;
import com.security.securitywithcustomuserservice.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class LoginUserDetailService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {

        User user = userRepository.findByUname(username);
        System.out.println("USER " + user);
        if(user == null){
            throw new UsernameNotFoundException(username);
        }
        return new LoginUser(user);
    }
}
