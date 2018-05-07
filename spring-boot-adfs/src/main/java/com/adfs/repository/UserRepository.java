package com.adfs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adfs.entity.User;


/**
 * @author Pkalashetty
 *
 */
public interface UserRepository extends JpaRepository<User, Integer>{

}
