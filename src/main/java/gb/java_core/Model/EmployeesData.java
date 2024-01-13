package gb.java_core.Model;

import java.util.ArrayList;
import java.util.List;

public class EmployeesData {

    static List<Employee> employee = new ArrayList<>();

    private static void addEmployee(String firstname, String lastname, String post, String phone, Double salary, String birth) {
        employee.add(new Employee(firstname, lastname, post, phone, salary, birth));
    }

    private static void addDirector(String firstname, String lastname, String post, String phone, Double salary, String birth) {
        employee.add(new Director(firstname, lastname, post, phone, salary, birth));
    }

    public static List<Employee> EmployeeList() {
        addEmployee("Иван", "Иванов", "developer", "89787412589", 50000.00, "1980-02-05");
        addEmployee("Ольга", "Иванова","tester", "89142562358", 49000.00, "1989-12-30");
        addEmployee("Сергей", "Сергеев","designer", "89451245632", 48000.00, "1986-06-06");
        addEmployee("Наталья", "Волкова","analitic", "89222111333", 47000.00,"1980-08-09");
        addEmployee("Андрей", "Кузнецов","devops", "89555222444", 47000.00, "1972-10-12");
        addEmployee("Илья", "Кулаков","analitic", "89222111333", 48000.00,"1978-05-20");
        addEmployee("Анна", "Белых","devops", "89555222444", 51000.00, "1985-07-30");

        addDirector("Анатолий", "Малых","director", "89111111111", 80000.00,"19656-12-10");
        addDirector("Илья", "Белых","director", "89256458952", 80000.00, "1980-04-11");
        return employee;
    }

}
