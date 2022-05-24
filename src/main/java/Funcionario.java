package main.java;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends Pessoa {

    private BigDecimal salary;
    private String funct;

    public Funcionario() {  }
    public Funcionario(String name, LocalDate birthDate, BigDecimal salary, String funct) {
        super.name = name;
        super.birthDate = birthDate;
        this.salary = salary;
        this.funct = funct;
    }

    public String getName() { return super.name; }

    public BigDecimal getSalary() {  return salary; }

    public void setSalary(BigDecimal salary) { this.salary = salary; }

    public String getFunct() { return funct;  }

    public void setFunct(String funct) { this.funct = funct; }

    @Override
    public String toString() {
        return name + " | " + birthDate + "  |  " + salary + "  |  " + funct;
    }
}
