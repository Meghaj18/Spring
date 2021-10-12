package com.cg.App.Tata.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.cg.App.Tata.Module.Recharge;

@Repository
public interface IRechargeRepository extends JpaRepository<Recharge,Long>{
	
	
	@Query(value= "SELECT * FROM recharge_details WHERE purchased_date BETWEEN ?1 AND ?2", nativeQuery = true)
	List<Recharge> findAllRechargesInPeriod(Date startDate, Date endDate);
	
	@Query(value= "SELECT COUNT(id) FROM recharge_details WHERE purchased_date BETWEEN ?1 AND ?2", nativeQuery = true)
	int countRechargesInPeriod(Date startDate,Date endDate);
	
	@Query(value= "SELECT SUM(amount) FROM recharge_details WHERE purchased_date BETWEEN ?1 AND ?2", nativeQuery = true)
	double totalRevenueInPeriod(Date startDate, Date endDate);

	
  

}

