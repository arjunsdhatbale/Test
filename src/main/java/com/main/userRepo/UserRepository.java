package com.main.userRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.module.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
