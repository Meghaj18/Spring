package com.cg.App.Tata.Ctrl;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.App.Tata.Module.Account;
import com.cg.App.Tata.Module.Pack;
import com.cg.App.Tata.Module.Recharge;
import com.cg.App.Tata.Service.IRechargeService;

@RestController
@RequestMapping("/api/Recharge")
public class RechargeController {
	@Autowired
	IRechargeService rcgservice;
	
	@PostMapping("/createRecharge")
	public Recharge createRecharge(@RequestBody Recharge recharge) {
		return rcgservice.createRecharge(recharge);
	}

	@PostMapping("/updateRecharge")
	public Recharge update(@RequestBody Recharge recharge) {
		return rcgservice.update(recharge);
	}


	@GetMapping("/rechargesforUserCount/{id}")
	public int rechargesForUserCount(@PathVariable long id) {
		return rcgservice.rechargesForUserCount(id);
	}

	@GetMapping("/findRecharges/{startDate}/{endDate}")
	public List<Recharge> findAllRechargesInPeriod(@PathVariable Date startDate, @PathVariable Date endDate) {
		return rcgservice.findAllRechargesInPeriod(startDate, endDate);
	}

	@GetMapping("/countRecharges/{startDate}/{endDate}")
	public int countRechargesInPeriod(@PathVariable Date startDate,@PathVariable Date endDate) {
		return rcgservice.countRechargesInPeriod(startDate, endDate);
	}

	@GetMapping("/totalrevenueinPeriod/{startDate}/{endDate}")
	public double totalRevenueInPeriod(@PathVariable Date startDate, @PathVariable Date endDate) {
		return rcgservice.totalRevenueInPeriod(startDate, endDate);
	}

	@GetMapping("/rechargesCount")
	public long rechargesCount() {
		return rcgservice.rechargesCount();
	}

	

}
