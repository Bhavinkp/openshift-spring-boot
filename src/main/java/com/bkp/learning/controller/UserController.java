package com.bkp.learning.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.bkp.learning.dao.UserDao;
import com.bkp.learning.exception.UserNotFoundException;
import com.bkp.learning.pojo.User;

@RestController
public class UserController {

	@Autowired
	private UserDao userDao;

	@GetMapping(path="/user")
	public List<User> getUser() {
		return UserDao.getAllUserList();
	}

	@PostMapping(path="/user")
	public ResponseEntity<?> createUser(@RequestBody User user) {

		User createdObject = userDao.addUser(user);

		URI createdLocation = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(createdObject.getId())
				.toUri();

		return ResponseEntity.created(createdLocation).build();

	}

	@GetMapping(path="/user/{id}")
	public User getUser(@PathVariable int id) {

		User user = userDao.getUserById(id);

		if (null==user)
			throw new UserNotFoundException("For Id -"+id);

		return user;
	}

	@DeleteMapping(path="/user/{id}")
	public boolean deleteUser(@PathVariable int id) {
		return userDao.deleteUserById(id);
	}

	@PutMapping(path="/user/{id}/{name}/{right}")
	public boolean updateUser(@PathVariable int id,@PathVariable String name, @PathVariable String right) {
		return userDao.updateUserById(new User(id,name,right));
	}
}
