package com.MarllonAnisio.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MarllonAnisio.curso.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
