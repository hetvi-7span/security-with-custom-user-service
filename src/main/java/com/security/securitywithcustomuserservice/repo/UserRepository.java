package com.security.securitywithcustomuserservice.repo;

import com.security.securitywithcustomuserservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByUname(String uname);
}
