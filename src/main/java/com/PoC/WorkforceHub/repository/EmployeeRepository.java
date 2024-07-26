package com.PoC.WorkforceHub.repository;



import com.PoC.WorkforceHub.model.EmployeeModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    private final List<EmployeeModel> employees = new ArrayList<>();
    private long currentId = 1L;

    public EmployeeModel save(EmployeeModel employee) {
        if (employee.getId() == null) {
            employee.setId(currentId++);
        } else {
            deleteById(employee.getId());
        }
        employees.add(employee);
        return employee;
    }

    public List<EmployeeModel> findAll() {
        return new ArrayList<>(employees);
    }

    public EmployeeModel findById(Long id) {
        for (EmployeeModel emp : employees) {
            if (emp.getId().equals(id)) {
                return emp;
            }
        }
        return null;
    }


    public boolean deleteById(Long id) {
        return employees.removeIf(emp -> emp.getId().equals(id));
    }
}
