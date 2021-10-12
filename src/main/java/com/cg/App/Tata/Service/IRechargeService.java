package com.cg.App.Tata.Service;


import java.time.LocalDate;
import java.util.Date;
import java.util.List;


import com.cg.App.Tata.Module.Account;
import com.cg.App.Tata.Module.Pack;
import com.cg.App.Tata.Module.Recharge;



public interface IRechargeService {
  Recharge createRecharge(Recharge recharge);
  Recharge update(Recharge recharge);
  int rechargesForUserCount(long id);
  List<Recharge> findAllRechargesInPeriod(Date startDate, Date endDate);
  int countRechargesInPeriod(Date startDate, Date endDate);
  double totalRevenueInPeriod(Date startDate, Date endDate);
  long rechargesCount();
 

  

}
  

