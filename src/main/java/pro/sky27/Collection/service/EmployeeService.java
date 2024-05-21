package pro.sky27.Collection.service;

import pro.sky27.Collection.domain.Employee;

public interface EmployeeService {
    Employee add(String name, String passport, int department, int salary);

    Employee remove(String name, String passport);

    Employee findEmployee(String name, String passport);
}
