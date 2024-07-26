package com.PoC.WorkforceHub.service;

import com.PoC.WorkforceHub.model.EmployeeModel;
import com.PoC.WorkforceHub.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;
import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeModel save(@Valid EmployeeModel employee) {
        return employeeRepository.save(employee);
    }

    public List<EmployeeModel> findAll() {
        return employeeRepository.findAll();
    }

    public EmployeeModel findById(Long id) {
        return employeeRepository.findById(id);
    }

    public boolean deleteById(Long id) {
        return employeeRepository.deleteById(id);
    }
}
