package com.MarllonAnisio.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MarllonAnisio.curso.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

}
