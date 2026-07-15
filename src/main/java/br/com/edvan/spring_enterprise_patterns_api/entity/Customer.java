package br.com.edvan.spring_enterprise_patterns_api.entity;

import br.com.edvan.spring_enterprise_patterns_api.enums.CustomerStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_customer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer extends BaseEntity {

    private String name;

    @Column(unique = true)
    private String cpf;

    private String email;

    private String phone;

    @Enumerated(EnumType.STRING)
    private CustomerStatus status;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Address> addresses;

}