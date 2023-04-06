package ObjectStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Pratice {

    public static void main(String[] args) {
        
        ArrayList<Employee> employees = new ArrayList<Employee>();
        readFile("employees.dat", employees);


    } static void createFile(String filename, ArrayList<Employee> employees) {

        employees.add(new Employee(1, "John", 1000));
        employees.add(new Employee(2, "Jane", 2000));
        employees.add(new Employee(3, "Jack", 3000));



        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            out.writeObject(employees);
        } catch (Exception e) {
            System.out.println("Error writing to file");
        }
    }
    static void readFile(String filename, ArrayList<Employee> employees) {
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("employees.dat"))) {
            employees = (ArrayList<Employee>) in.readObject();

            for (Employee e: employees) {
                System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
            }

            
        } catch (Exception e) {
            System.out.println("Error reading from file");
        }
    }
}
