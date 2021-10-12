package com.cg.App.Tata.Ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.App.Tata.Module.User;
import com.cg.App.Tata.Service.IUserService;

@RestController
@RequestMapping("/api/User")
public class UserController {
	@Autowired
	IUserService uservice;
	
	@PostMapping("/registerUser")
	public User register(@RequestBody User user) {
		return uservice.register(user);
	}

	@PostMapping("/updateUser")
	public User update(@RequestBody User user) {
		return uservice.update(user);
	}

	@GetMapping("/findById/{id}")
	public User findById(@PathVariable Long id) {
		return uservice.findById(id);
	}

	@GetMapping("/findUsername/{username}")
	public User findByUsername(@PathVariable String username) {
		return uservice.findByUsername(username);
	}

	@DeleteMapping("/deleteUserbyId/{id}")
	public String deleteByUserId(@PathVariable Long id) {
		return uservice.deleteByUserId(id);
		
	}


}
