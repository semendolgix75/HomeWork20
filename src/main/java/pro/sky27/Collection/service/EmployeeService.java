package pro.sky27.Collection.service;

import pro.sky27.Collection.domain.Employee;

import java.util.Map;

public interface EmployeeService {
    Employee addEmployee(String name, String passport, int department, int salary);

    Employee removeEmployee(String name, String passport);

    Employee findEmployee(String name, String passport);

    Map<String, Employee> outputEmployeeInfo();
}
