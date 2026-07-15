package br.com.edvan.spring_enterprise_patterns_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.edvan.spring_enterprise_patterns_api.entity.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}