package br.com.dgobrito.userapi.services;

import java.util.List;

import br.com.dgobrito.userapi.domain.User;

public interface UserService {
	
	User findById(Long id);
	List<User> findAll();
}