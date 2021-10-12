package com.cg.App.Tata.Service;

import com.cg.App.Tata.Module.User;

public interface IUserService {

	 User register(User user);
	 User update(User user);
	 User findById(Long id);
	
	 User findByUsername(String username);
	 String deleteByUserId(Long id);
	 
}
