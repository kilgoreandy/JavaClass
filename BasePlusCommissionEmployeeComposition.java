/*
 * BasePlusCommissionEmployeeComposition.java
 */

 /*
 9.3 (Recommended: Using Composition Rather Than Inheritance) Many
programs written with inheritance could be written with composition
instead, and vice versa. Rewrite class BasePlus–
CommissionEmployee (Fig. 9.11 ) of the
CommissionEmployee–BasePlusCommissionEmployee
hierarchy so that it contains a reference to a CommissionEmployee
object, rather than inheriting from class CommissionEmployee. Retest
BasePlusCommissionEmployee to demonstrate that it still provides
the same functionality.
*/ 

public class BasePlusCommissionEmployeeComposition {
    IllegalArgumentException IAE = new IllegalArgumentException();
    private double baseSalary; // base salary per week
    // Demonstrate composition of (as opposed to inheritance from) a CommissionEmployee object
    
    // six-argument constructor
    public BasePlusCommissionEmployeeComposition( String first, String last, 
            String ssn, double sales, double rate, double salary) {
    	// implemented the 6 argument constructor
        this.first = first;
        this.last = last;
        this.ssn = ssn;
        this.sales = sales;
        this.rate = rate;
        this.salary = salary;
        baseSalary = salary; 
        CommissionEmployee ce = new CommissionEmployee(first, last, ssn, gross, commission);
    }
    
    // Implement accessors and mutators for all six attributes (stubs appear below)
    // As per the text (demonstrated in its BasePlusCommissionEmployee implementation), throw an IllegalArgumentException if the salary argument is negative
    public void setBaseSalary( double salary ) {
    	// implemented this method
        if (salary < 0){
            throw IAE;
        }
        else{
        this.salary = salary;
        }
    }    

    public double getBaseSalary() {
    	// implemented this method
        return salary;
    }

    public String getFirstName() {
    	// implemented this method
        return first;
    }

    public String getLastName() {
    	// implemented this method
        return last;
    }

    public String getSocialSecurityNumber() {
    	// implemented this method
        return ssn;
    }

    public double getGrossSales() {
    	// implemented this method
        return ce.gross;
    }

    public void setGrossSales(double sales) {
    	// implemented this method
        this.sales = sales;
    }

    public double getCommissionRate() {
    	// implemented this method
        return ce.commission;
    }

    public void setCommissionRate(double rate) {
    	// implemented this method
        this.commission = commission;
    }    
    
    public double earnings() {
    	// TODO: implement this method
        return double earnings;
    }
    
    @Override
    public String toString() {        
    	// TODO: implement this method
        return String.format("%s: %s%n%s: %s%n%s: %s%n%s: %f%n%s: %f%n%s: %f%n","First Name", getFirstName(),
                "Last Name", getLastName(), "SSN", getSocialSecurityNumber(), "Commission", getCommissionRate(),
                "Gross", getGrossSales(), "Base Salary", getBaseSalary());
    }
}
