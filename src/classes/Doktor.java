package classes;

import interfaces.Employee;

public class Doktor extends Person implements Employee {

    private Integer salary;
    private String specialization;

    public Doktor(String firstname, String lastname, String code) {
        super(firstname, lastname, code);
    }

    public Doktor(Integer salary, String specialization, String firstname, String lastname, String code) {
        super(firstname, lastname, code);
        this.salary = salary;
        this.specialization = specialization;
    }

    @Override
    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    
 
}
