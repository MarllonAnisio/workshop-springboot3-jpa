package com.MarllonAnisio.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MarllonAnisio.curso.entities.User;
import com.MarllonAnisio.curso.repositories.UserRepository;
@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();	
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

	public User insertUser(User user) {
		return repository.save(user);
	}
	public void deleteUser(Long id) {
		repository.deleteById(id);
	}
	public User updateUser(Long id, User user) {
		User entity = repository.getReferenceById(id);
		updateData(entity,user);
		return repository.save(entity);

	}

	private void updateData(User entity, User user) {
		entity.setName(user.getName());
		entity.setEmail(user.getEmail());
		entity.setPhone(user.getPhone());
	}

}
