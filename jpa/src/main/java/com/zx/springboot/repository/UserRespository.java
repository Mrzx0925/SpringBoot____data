package com.zx.springboot.repository;

import com.zx.springboot.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

//继承JpaRepository
public interface UserRespository extends JpaRepository<User,Integer>  {
}
