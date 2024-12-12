package com.log.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.log.ENTITY.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
