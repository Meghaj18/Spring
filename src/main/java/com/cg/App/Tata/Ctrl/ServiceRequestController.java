package com.cg.App.Tata.Ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.App.Tata.Module.Account;
import com.cg.App.Tata.Module.ServiceRequest;
import com.cg.App.Tata.Service.IServiceRequestService;

@RestController
@RequestMapping("/api/ServiceRequest")
public class ServiceRequestController {
	@Autowired
	IServiceRequestService srservice;
	
	@PostMapping("/createServiceRequest")
	public ServiceRequest createServiceRequestForUser(@RequestBody ServiceRequest serviceRequest) {
		return srservice.createServiceRequestForUser(serviceRequest);
	}

	@PostMapping("/OpenServiceRequest")
	public  List<ServiceRequest> openedServiceRequest() {
		return srservice.openedServiceRequest();
	}

	@PostMapping("/closeServiceRequest/{id}")
	public ServiceRequest close(@PathVariable Long id) {
		return srservice.close(id);
	}
	
	

}
