package com.spring_security.zAuthJwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_security.zAuthJwt.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByUsername(String username);

}
