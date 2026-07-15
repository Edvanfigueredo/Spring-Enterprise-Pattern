package br.com.edvan.spring_enterprise_patterns_api.service.impl;

import br.com.edvan.spring_enterprise_patterns_api.dto.request.CustomerRequest;
import br.com.edvan.spring_enterprise_patterns_api.dto.response.CustomerResponse;
import br.com.edvan.spring_enterprise_patterns_api.entity.Customer;
import br.com.edvan.spring_enterprise_patterns_api.enums.CustomerStatus;
import br.com.edvan.spring_enterprise_patterns_api.mapper.CustomerMapper;
import br.com.edvan.spring_enterprise_patterns_api.repository.CustomerRepository;
import br.com.edvan.spring_enterprise_patterns_api.service.interfaces.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;
    private final CustomerMapper mapper;

    @Override
    public CustomerResponse create(CustomerRequest request) {

        Customer customer = mapper.toEntity(request);

        customer.setStatus(CustomerStatus.ACTIVE);

        return mapper.toResponse(repository.save(customer));
    }

    @Override
    public List<CustomerResponse> findAll() {

        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .toList();

    }

    @Override
    public CustomerResponse findById(Long id) {

        return mapper.toResponse(repository.findById(id).orElseThrow());

    }

    @Override
    public CustomerResponse update(Long id, CustomerRequest request) {

        Customer customer = repository.findById(id).orElseThrow();

        customer.setName(request.getName());
        customer.setCpf(request.getCpf());
        customer.setEmail(request.getEmail());
        customer.setPhone(request.getPhone());

        return mapper.toResponse(repository.save(customer));

    }

    @Override
    public void delete(Long id) {

        repository.deleteById(id);

    }

}