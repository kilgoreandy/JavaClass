/*
 * EmployeeTest.java
 */

/**
 *
 * @author StudentName
 */
public class EmployeeTest {
    
    public static void main(String args[]){
        // Create two Employee objects
        //	 Employee #1: Benjamin Bernanke has a monthly salary of 1234.56
        //   Employee #2: Paul Volcker has a monthly salary of 2345.67


        Employee one = new Employee("Benjamin", "Bernanke", 14814.72 );
        Employee two = new Employee("Paul", "Volcker", 28148.04 );
        // Display the employees' info (including yearly salary)

        System.out.println(one.getFirstName() + " " + one.getLastName()+ "'s yearly salary: " + one.getMonthlySalary());
        System.out.println(two.getFirstName() + " " + two.getLastName()+ "'s yearly salary: " + two.getMonthlySalary());

        /* Note that you'll receive slightly different results for the salary displaying via printf and print/println.
         * This is due to the implicit precision and the rounding that is applied.
         * I used println, but you're welcome to use printf if you like: I account for slight variations in the numeric values displayed for the salaries.
         */

        System.out.println("Giving raises...");
        // Give each employee a 10% raises.
        one.setMonthlySalary(one.getMonthlySalary() + (one.getMonthlySalary() * .10));
        two.setMonthlySalary(two.getMonthlySalary() + (two.getMonthlySalary() * .10));
        // Be sure to actually apply the raise to the Employee objects: don't just calculate and display a 10% greater salary within this test code

        // Display the employees' info (including yearly salary)
        System.out.println(one.getFirstName() + " " + one.getLastName()+ "'s yearly salary: " + one.getMonthlySalary());
        System.out.println(two.getFirstName() + " " + two.getLastName()+ "'s yearly salary: " + two.getMonthlySalary());

        System.out.println("Attempting to set a negative salary value...");
        // Attempt to set Bernanke's salary to a negative value...
        one.setMonthlySalary(-5000.00);
        // Display Bernanke's info (including yearly salary)
        System.out.println(one.getFirstName() + one.getFirstName()+ " 's yearly salary: " + one.getMonthlySalary());
    }

}