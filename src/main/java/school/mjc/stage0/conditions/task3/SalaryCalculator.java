package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double salaryAfterTax;
        if (salary > 0) {
            if (salary <= 10000) {
                salaryAfterTax =salary-(salary * 0.15);
                System.out.println(salaryAfterTax);
            } else if (salary <= 20000) {
                salaryAfterTax =salary-(salary * 0.18);
                System.out.println(salaryAfterTax);
            } else {
                salaryAfterTax=salary-(salary/5);
                System.out.println(salaryAfterTax);
            }
        } else {
            System.out.println("wrong input!");
        }
    }
}
