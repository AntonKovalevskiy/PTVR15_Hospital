package classes;

import interfaces.Employee;

public class Nurse extends Person implements Employee {

    private Integer salary;
    private String status;

    public Nurse(String firstname, String lastname, String code) {
        super(firstname, lastname, code);
    }

    public Nurse(Integer salary, String status, String firstname, String lastname, String code) {
        super(firstname, lastname, code);
        this.salary = salary;
        this.status = status;
    }

    @Override
    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
    
    
}
