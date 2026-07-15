package br.com.edvan.spring_enterprise_patterns_api.controller;

import br.com.edvan.spring_enterprise_patterns_api.dto.request.CustomerRequest;
import br.com.edvan.spring_enterprise_patterns_api.dto.response.CustomerResponse;
import br.com.edvan.spring_enterprise_patterns_api.service.interfaces.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerResponse create(@RequestBody @Valid CustomerRequest request){

        return service.create(request);

    }

    @GetMapping
    public List<CustomerResponse> findAll(){

        return service.findAll();

    }

    @GetMapping("/{id}")
    public CustomerResponse findById(@PathVariable Long id){

        return service.findById(id);

    }

    @PutMapping("/{id}")
    public CustomerResponse update(@PathVariable Long id,
                                   @RequestBody @Valid CustomerRequest request){

        return service.update(id,request);

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){

        service.delete(id);

    }

}