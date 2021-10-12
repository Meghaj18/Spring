package com.cg.App.Tata.Ctrl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.App.Tata.Module.Account;
import com.cg.App.Tata.Module.Pack;
import com.cg.App.Tata.Service.IAccountService;

@RestController
@RequestMapping("/api")
public class AccountController {
	@Autowired
	IAccountService accservice;
	
	@GetMapping("/findbyId/{id}")
	public Account findById(@PathVariable Long id) {
		
		return accservice.findById(id);
		
	}

	@PostMapping("/accounts")
	public Account createAccount(@RequestBody Account account) {
		
		return accservice.createAccount(account);
	}
	
	@PutMapping("/accounts")
	public Account updateAccount(@RequestBody Account account) {
		
		return accservice.updateAccount(account);
	}

	@DeleteMapping("/deleteById/{id}")
	public String deleteByAccountId(@PathVariable Long id) {
		
		return accservice.deleteByAccountId(id);
	}

	@GetMapping("/accountscreated")
	public List<Account> getCreatedAccounts() {
		
		return accservice.getCreatedAccounts();
	}

	

	@GetMapping("/totalAccounts")
	public long countAccounts() {
		
		return accservice.countAccounts();
	}

	@DeleteMapping("/removepackaccount/{id}")
	public String removePackForAccount(@PathVariable Long id) {
		
		return accservice.removePackForAccount(id);
		
	}

	
	
}
