import java.io.*;
public class Employee {

   // this instance variable is visible for any child class.
   public String name;

   // roll  variable is visible in Employee class only.
   private int roll;

   // The name variable is assigned in the constructor.
   public Employee (String empName) {
      name = empName;
   }

   // The roll variable is assigned a value.
   public void setAge(int empAge) {
      roll = empAge;
   }

   // This method prints the employee details.
   public void printEmp() {
      System.out.println("name  : " + name );
      System.out.println("Roll :" + roll);
   }

   public static void main(String args[]) {
      Employee empOne = new Employee("Bishal Singh");
      empOne.setAge(27);
      empOne.printEmp();
   }
}