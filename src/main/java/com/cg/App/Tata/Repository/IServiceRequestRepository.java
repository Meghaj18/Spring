package com.cg.App.Tata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.App.Tata.Module.Account;
import com.cg.App.Tata.Module.ServiceRequest;

@Repository
public interface IServiceRequestRepository extends JpaRepository<ServiceRequest,Long> {

	ServiceRequest save(Account account);


    
}
