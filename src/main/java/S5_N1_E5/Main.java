package S5_N1_E5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("Nuria", "Viana", "38849361S", 22000.0);
        Employee e2 = new Employee("David", "Rojo", "46835710M", 22000.0);
        Employee e3 = new Employee("Elisabet", "Fernández", "46825962S", 22000.0);

        List<Employee> employees = new ArrayList();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        serializing_deserializing(employees);

    }
    public static void serializing_deserializing (List<Employee> employees) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file_serialized.ser"));
            out.writeObject(employees);
            out.close();

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("file_serialized.ser"));
            List<Employee> employeesCopy = (List<Employee>)in.readObject(); //casting
            in.close();

            for (Employee e : employeesCopy) {
                System.out.println(e);
            }
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getStackTrace());
        }
    }






}
