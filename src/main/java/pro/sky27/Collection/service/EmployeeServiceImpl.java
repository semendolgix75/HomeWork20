package pro.sky27.Collection.service;

import org.springframework.stereotype.Service;
import pro.sky27.Collection.domain.Employee;
import pro.sky27.Collection.exception.EmployeeAlReadyAddedException;
import pro.sky27.Collection.exception.EmployeeNotFindException;

import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    public Map<String, Employee> employeeMap;
    Employee employee1 = new Employee("Ivanov AA", "123456", departmentGenerator(), salaryGenerator());
    Employee employee2 = new Employee("Petrov HJ", "124587", departmentGenerator(), salaryGenerator());


    public EmployeeServiceImpl(Map<String, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }

    public int salaryGenerator() {
        java.util.Random random = new java.util.Random();
        int minimumScore = 100_000;
        int salaryGenerator = random.nextInt(300_000) + minimumScore;
        return salaryGenerator;
    }

    public int departmentGenerator() {
        java.util.Random random = new java.util.Random();
        int minimumScore = 1;
        int salaryGenerator = random.nextInt(5) + 1;
        return salaryGenerator;
    }

    public Employee add(String name, String passport, int department, int salary) {
        employeeMap.put(employee1.getName() + employee1.getPassport(), employee1);
        employeeMap.put(employee2.getName() + employee2.getPassport(), employee2);
        Employee employee = new Employee(name, passport, department, salary);
        String keyEmployeeMap = name + passport;
        if (!employeeMap.containsKey(keyEmployeeMap)) {
            employeeMap.put(keyEmployeeMap, employee);
        } else {
            throw new EmployeeAlReadyAddedException("Работник уже в списке");
        }
        return employee;
    }
    public Employee remove(String name, String passport) {

        String keyEmployeeMap = name + passport;
        Employee employee = employeeMap.get(keyEmployeeMap);
        if (employee!=null) {
            employeeMap.remove(keyEmployeeMap, employee);
        } else {
            throw new EmployeeNotFindException("Работник уже в списке");
        }
        return employee;
    }
}
