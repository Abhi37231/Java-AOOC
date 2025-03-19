
import java.util.*;

public class Employee {
    String firstname;
    String lastname;    
    double monthlySalary;

        Employee(String fname,String lname , double Salary){
            firstname = fname;
            lastname = lname;
            monthlySalary = Salary;

        }
       static Scanner sc = new Scanner(System.in);

    void getData(){
        System.out.println("Enter Details below");

        System.out.println("Enter First Name:");
        firstname = sc.nextLine();
        System.out.println("Enter Last Name:");
        lastname = sc.nextLine();
        System.out.println("Enter Employee Monthly Salary:");
        monthlySalary = sc.nextDouble();

    }  
    void setData(){
        System.out.println("Empolyee Details");
        
        System.out.println("Employee First Name :"+firstname);
        System.out.println("Employee Last Name:"+lastname);
        System.out.println("Monthly Salary :"+monthlySalary);

    }
    public static void main(String[] args) {
        Employee E1 = new Employee("Abhinandan","Yalamante",70000);
        E1.setData();
        E1.getData();
        E1.setData();
        

    }
}
