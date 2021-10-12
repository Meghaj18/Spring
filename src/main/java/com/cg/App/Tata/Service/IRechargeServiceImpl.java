package com.cg.App.Tata.Service;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.App.Tata.Module.Account;
import com.cg.App.Tata.Module.Pack;
import com.cg.App.Tata.Module.Recharge;
import com.cg.App.Tata.Repository.IAccountRepository;
import com.cg.App.Tata.Repository.IPackRepository;
import com.cg.App.Tata.Repository.IRechargeRepository;
@Service
public class IRechargeServiceImpl implements IRechargeService{
	@Autowired
	IRechargeRepository rechargerepository;
	@Autowired
    private IPackRepository packrepository;
	@Autowired
    private IAccountRepository accountrepository;

	

	public Recharge createRecharge(Recharge recharge) {
		Recharge recharg= rechargerepository.save(recharge);
	      return recharg;			
	}

	@Override
	public Recharge update(Recharge recharge) {
		// TODO Auto-generated method stub
		
		Optional<Recharge> existingUserContainer = rechargerepository.findById(recharge.getId());
		Recharge existingUser= null;
		 if(existingUserContainer.isPresent()) {
			 existingUser= existingUserContainer.get();
			 existingUser.setId(recharge.getId());
			 existingUser.setAmount(recharge.getAmount());
			 existingUser.setAccount(recharge.getAccount());
			 existingUser.setDaysValidity(recharge.getDaysValidity());
			 rechargerepository.saveAndFlush(existingUser);
			 
		 }
		return existingUser;
	}


	@Override
	public int rechargesForUserCount(long id) {
		Optional<Account> accountContainer  = accountrepository.findById(id);
		int counts = 0;
		if(accountContainer.isPresent()) {
			
			 counts = (int) rechargerepository.count();
		
   
			}
        return counts;
		
	}

	@Override
	public List<Recharge> findAllRechargesInPeriod(Date startDate, Date endDate) {
		
		return rechargerepository.findAllRechargesInPeriod(startDate, endDate);
	}

	
	@Override
	public int countRechargesInPeriod(Date startDate,Date endDate) {
		return rechargerepository.countRechargesInPeriod(startDate, endDate);
	}



	@Override
	public long rechargesCount() {
		long count = rechargerepository.count();
		return count;
		
	}


	@Override
	public double totalRevenueInPeriod(Date startDate, Date endDate) {
		return rechargerepository.totalRevenueInPeriod(startDate, endDate);
	
	}

	


}
