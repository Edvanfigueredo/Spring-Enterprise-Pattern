package br.com.edvan.spring_enterprise_patterns_api.dto.response;

import br.com.edvan.spring_enterprise_patterns_api.enums.CustomerStatus;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerResponse {

    private Long id;
    private String name;
    private String cpf;
    private String email;
    private String phone;
    private CustomerStatus status;

}