package gb.java_core.Model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Comparable<Employee> {
    private String firstname;
    private String lastname;
    private String post;
    private String phone;
    private Double salary;
    private String birth;

    @Override
    public String toString() {
        return  "Имя: " + firstname + ", " +
                "Фамилия: " + lastname + ", " +
                "Должность: " + post + ", " +
                "Телефон: " + phone + ", " +
                "Зарплата: " + salary + ", " +
                "Дата рождения: " + birth + "\n";
    }

    @Override
    public int compareTo(Employee o) {
        return this.getBirth().compareTo(o.getBirth());
    }
}
