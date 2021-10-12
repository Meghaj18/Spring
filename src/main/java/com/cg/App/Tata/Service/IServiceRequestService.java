package com.cg.App.Tata.Service;

import java.util.List;

import com.cg.App.Tata.Module.Account;
import com.cg.App.Tata.Module.ServiceRequest;

public interface IServiceRequestService {
  ServiceRequest createServiceRequestForUser(ServiceRequest serviceRequest);
  List<ServiceRequest> openedServiceRequest();
  ServiceRequest close(Long id);
}
