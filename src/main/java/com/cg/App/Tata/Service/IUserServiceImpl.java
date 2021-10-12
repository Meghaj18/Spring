package com.cg.App.Tata.Service;

import java.rmi.ServerException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.App.Tata.Module.User;
import com.cg.App.Tata.Repository.IUserRepository;
@Service
public class IUserServiceImpl implements IUserService {
	@Autowired
	IUserRepository iuserrepository;
	@Override
	public User register(User user) {
		
		User newuser= iuserrepository.save(user);
	    return newuser;
	}

	@Override
	public User update(User user) {
		
		Optional<User> updateuser =iuserrepository.findById(user.getId());
		if(updateuser.isPresent()) {
			iuserrepository.saveAndFlush(user);
			
		}
		return user;
	}

	public User findById(Long id) {
		
		Optional<User> userbyid= iuserrepository.findById(id);
		User uid= userbyid.get();
		return uid;
	}

	@Override
	public User findByUsername(String username) {
		
		Optional<User> userbyname= iuserrepository.findByUsername(username);
		User usern= userbyname.get();
		return usern;
		
	}

	@Override
	public String deleteByUserId(Long id) {

		Optional<User> userContainer  = iuserrepository.findById(id);
		if(userContainer.isPresent()) {
			
			iuserrepository.deleteById(id);

			

				 return "Current Pack deleted successfully";

				}
		return "";
	
	}

}
