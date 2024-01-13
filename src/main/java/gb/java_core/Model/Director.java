package gb.java_core.Model;
import java.util.List;

public class Director extends Employee {

    public Director(String firstname, String lastname, String post, String phone, Double salary, String birth){
        super(firstname, lastname, post, phone, salary, birth);
    }

    public static void upSalaryForEmployee(List<Employee> employees, double raiseSalary) {
        for (Employee p : employees) {
            if (!(p instanceof Director)) {
                p.setSalary(p.getSalary() + raiseSalary);
            }
        }
    }
}
