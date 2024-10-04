/ Nmae :- Nikhil Lanje
//class :-SY-1
//Roll No:-113
//subject:- OOP in Java

class Worker {
    private String givenName;
    private String familyName;
    private double monthlyIncome;

    public Worker(String gname, String fname, double income) {
        givenName = gname;
        familyName = fname;
        monthlyIncome = income;

        if (income < 0.0)
            monthlyIncome = 0.0;
    }

    public void setGivenName(String gname) {
        givenName = gname;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setFamilyName(String fname) {
        familyName = fname;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setMonthlyIncome(double income) {
        monthlyIncome = income;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public double getAnnualIncome() {
        double annualIncome = monthlyIncome * 12;
        return annualIncome;
    }

    public double getIncreasedIncome() {
        double increment = monthlyIncome * 0.1;
        double increasedIncome = (monthlyIncome + increment) * 12;
        return increasedIncome;
    }
}

public class WorkerTest {
    public static void main(String[] args) {
        Worker person1 = new Worker("Alice", "Johnson", 4500.00);
        Worker person2 = new Worker("Bob", "Williams", 7200.00);

        System.out.printf("Yearly salary of %s %s: %.2f\n", person1.getGivenName(), person1.getFamilyName(), person1.getAnnualIncome());
        System.out.printf("Yearly salary of %s %s: %.2f\n", person2.getGivenName(), person2.getFamilyName(), person2.getAnnualIncome());

        System.out.println();

        System.out.println("***** Giving 10% raise for each worker *****");
        System.out.printf("Yearly salary of %s %s: %.2f\n", person1.getGivenName(), person1.getFamilyName(), person1.getIncreasedIncome());
        System.out.printf("Yearly salary of %s %s: %.2f\n", person2.getGivenName(), person2.getFamilyName(), person2.getIncreasedIncome());
    }
}

/* Output:
 * Yearly salary of Alice Johnson: 54000.00
 * Yearly salary of Bob Williams: 86400.00
 * 
 * ***** Giving 10% raise for each worker *****
 * Yearly salary of Alice Johnson: 59400.00
 * Yearly salary of Bob Williams: 95040.00
 */

