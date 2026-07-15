package br.com.edvan.spring_enterprise_patterns_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.edvan.spring_enterprise_patterns_api.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{
	
}