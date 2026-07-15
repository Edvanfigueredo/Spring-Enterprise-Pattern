package br.com.edvan.spring_enterprise_patterns_api.service.interfaces;

import br.com.edvan.spring_enterprise_patterns_api.dto.request.CustomerRequest;
import br.com.edvan.spring_enterprise_patterns_api.dto.response.CustomerResponse;

import java.util.List;

public interface CustomerService {

    CustomerResponse create(CustomerRequest request);

    List<CustomerResponse> findAll();

    CustomerResponse findById(Long id);

    CustomerResponse update(Long id, CustomerRequest request);

    void delete(Long id);

}