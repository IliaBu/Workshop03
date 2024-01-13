package gb.java_core.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public
class Student {
    public static String[] specialityList = {"Русский язык", "Математика", "Информатика", "Физика", "Химия", "Сопротивление материалов"};
    private String name;
    private List<Double> grades;
    private String specialty;

    public double getAverageGrade() {
        return grades.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", " +
                "Список оценок: " + grades + ", " +
                "Специальность: " + specialty;
    }
}
