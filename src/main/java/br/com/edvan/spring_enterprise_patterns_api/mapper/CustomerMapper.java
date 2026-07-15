package br.com.edvan.spring_enterprise_patterns_api.mapper;

import br.com.edvan.spring_enterprise_patterns_api.dto.request.CustomerRequest;
import br.com.edvan.spring_enterprise_patterns_api.dto.response.CustomerResponse;
import br.com.edvan.spring_enterprise_patterns_api.entity.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    Customer toEntity(CustomerRequest request);

    CustomerResponse toResponse(Customer customer);

}