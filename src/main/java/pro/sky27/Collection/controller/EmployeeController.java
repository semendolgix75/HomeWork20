package pro.sky27.Collection.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky27.Collection.domain.Employee;
import pro.sky27.Collection.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam("name") String name,
                                @RequestParam("passport") String passport,
                                @RequestParam("department") Integer department,
                                @RequestParam("salary") Integer salary) {
        return employeeService.add(name, passport, department, salary);

    }
    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam("name") String name,
                            @RequestParam("passport") String passport,
                            @RequestParam("department") Integer department,
                            @RequestParam("salary") Integer salary) {
        return employeeService.remove(name, passport);

    }
    @GetMapping("/find")
    public Employee findEmployee(@RequestParam("name") String name,
                                   @RequestParam("passport") String passport,
                                   @RequestParam("department") Integer department,
                                   @RequestParam("salary") Integer salary) {
        return employeeService.findEmployee(name, passport);

    }
}

