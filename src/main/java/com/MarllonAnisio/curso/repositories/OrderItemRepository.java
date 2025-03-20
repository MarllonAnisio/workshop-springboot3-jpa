package com.MarllonAnisio.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MarllonAnisio.curso.entities.OrderItem;

import jakarta.persistence.Id;


public interface OrderItemRepository  extends JpaRepository<OrderItem, Id/*Long trocado por Id para resolver conflito*/>{

}
