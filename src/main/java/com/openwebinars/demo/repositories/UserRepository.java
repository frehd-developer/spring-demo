package com.openwebinars.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.openwebinars.demo.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
