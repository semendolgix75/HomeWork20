package pro.sky27.Collection.domain;

import java.util.Objects;

public class Employee {
        private String name;        //ФИО
        private String passport;  //Паспорт
        private int department;   //Отдел
        private int salary;       //Зарплата сотрудника

    public Employee(String name, String passport, int department, int salary) {
        this.name = name;
        this.passport = passport;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPassport() {
        return passport;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return department == employee.department && salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(passport, employee.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, passport, department, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", passport='" + passport + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}
