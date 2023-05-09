package S5_N1_E5;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private String lastName;
    private String dni;
    private double salary;

    public Employee(String name, String lastName, String dni, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDni() {
        return dni;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dni='" + dni + '\'' +
                ", salary=" + salary +
                '}';
    }
}
