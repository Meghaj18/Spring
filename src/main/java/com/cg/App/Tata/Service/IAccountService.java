package com.cg.App.Tata.Service;

import java.time.LocalDate;
import java.util.List;

import com.cg.App.Tata.Module.Account;
import com.cg.App.Tata.Module.Pack;



public interface IAccountService {
  
	Account findById(Long id);
	Account updateAccount(Account account);
	String deleteByAccountId(Long id);
	List<Account> getCreatedAccounts();
	
	long countAccounts();
	String removePackForAccount(Long id);
	Account createAccount(Account account);
}
