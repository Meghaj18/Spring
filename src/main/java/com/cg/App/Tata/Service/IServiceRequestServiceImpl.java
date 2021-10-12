package com.cg.App.Tata.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.App.Tata.Module.Account;
import com.cg.App.Tata.Module.ServiceRequest;
import com.cg.App.Tata.Repository.IServiceRequestRepository;
@Service
public class IServiceRequestServiceImpl implements IServiceRequestService {
	@Autowired
	IServiceRequestRepository iservicerequestrepository;
	@Override
	public ServiceRequest createServiceRequestForUser(ServiceRequest serviceRequest) {
		ServiceRequest createsr= iservicerequestrepository.save(serviceRequest);
		return createsr;
	}

	@Override
	public List<ServiceRequest> openedServiceRequest() {
		return iservicerequestrepository.findAll();
		
	}

	@Override
	public ServiceRequest close(Long id) {
		Optional<ServiceRequest> closereq =iservicerequestrepository.findById(id);
		if(closereq.isPresent()) {
	
	    closereq.get().setStatusOpened(false);
	    System.out.println("Service closed");}
		return null;
		
	}

}
