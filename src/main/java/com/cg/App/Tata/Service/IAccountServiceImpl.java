package com.cg.App.Tata.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.App.Tata.Module.Account;
import com.cg.App.Tata.Module.Pack;
import com.cg.App.Tata.Module.User;
import com.cg.App.Tata.Repository.IAccountRepository;
import com.cg.App.Tata.Repository.IPackRepository;


@Service
public class IAccountServiceImpl implements IAccountService {
@Autowired
IAccountRepository accountRepository;
IPackRepository packrepo;
	@Override
	public Account findById(Long id) {
		
		Optional<Account> byid = accountRepository.findById(id);
		Account sp = byid.get();
		return sp;
		
	}

	@Override
	public Account createAccount(Account account) {
		Account acc= accountRepository.save(account);
		return acc;
	}

	@Override
	public String deleteByAccountId(Long id) {
		accountRepository.deleteById(id);
		return "Record deleted";
		
		
		
	}

	@Override
	public List<Account> getCreatedAccounts() {
		// TODO Auto-generated method stub
		return accountRepository.findAll();
		//return null;
	}

	
	@Override
	public long countAccounts() {
		
		long count = accountRepository.count();
		return count;
	}

	@Override
	public String removePackForAccount(Long id) {
		Optional<Account> accountContainer  = accountRepository.findById(id);

		 if(accountContainer.isPresent()) {

		 Account account = accountContainer.get();

		 Pack pack = account.getCurrentPack();

		 if(null!=pack) {

		 packrepo.deleteById(pack.getId());

		 return "Current Pack deleted successfully";

		}

		}

		 return "";
		
	}

	@Override
	public Account updateAccount(Account account) {
		Optional<Account> updateacc =accountRepository.findById(account.getAccountId());
		if(updateacc.isPresent()) {
			accountRepository.saveAndFlush(account);
			
		}
		return account;
		
	}

	
}
