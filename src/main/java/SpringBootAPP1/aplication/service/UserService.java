package SpringBootAPP1.aplication.service;

import javax.validation.Valid;

import SpringBootAPP1.entity.User;


public interface UserService {
	
	public Iterable<User> getAllUsers();
	
	public User createUser(User user) throws Exception;

}
