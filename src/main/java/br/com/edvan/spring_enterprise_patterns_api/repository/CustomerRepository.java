package br.com.edvan.spring_enterprise_patterns_api.repository;

import br.com.edvan.spring_enterprise_patterns_api.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByCpf(String cpf);

    Page<Customer> findByNameContainingIgnoreCase(String name, Pageable pageable);

}