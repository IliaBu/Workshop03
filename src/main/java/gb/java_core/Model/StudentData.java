package gb.java_core.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static gb.java_core.Model.Student.specialityList;

public class StudentData {
    static List<Student> students = new ArrayList<>();

    private static void addStudent(String name, List<Double> grades, String specialty) {
        students.add(new Student(name, grades, specialty));
    }

    public static List<Student> StudentList() {
        addStudent("Юрий", new ArrayList<>(Arrays.asList (5.0, 2.0, 5.0, 5.0, 5.0)), specialityList[2]);
        addStudent("Маша", new ArrayList<>(Arrays.asList  (2.0, 5.0, 5.0, 5.0, 4.0)), specialityList[0]);
        addStudent("Анна", new ArrayList<>(Arrays.asList  (5.0, 5.0, 5.0, 4.0, 3.0)), specialityList[2]);
        addStudent("Андрей", new ArrayList<>(Arrays.asList(5.0, 4.0, 2.0, 5.0, 5.0)), specialityList[5]);
        addStudent("Иван", new ArrayList<>(Arrays.asList  (5.0, 5.0, 5.0, 4.0, 5.0)), specialityList[2]);
        addStudent("Петр", new ArrayList<>(Arrays.asList  (5.0, 5.0, 5.0, 5.0, 5.0)), specialityList[2]);
        addStudent("Алексей", new ArrayList<>(Arrays.asList(3.0, 5.0, 5.0, 5.0, 5.0)), specialityList[2]);
        addStudent("Александр", new ArrayList<>(Arrays.asList(4.0, 5.0, 5.0, 5.0, 3.0)), specialityList[2]);
        addStudent("Сергей", new ArrayList<>(Arrays.asList(5.0, 5.0, 5.0, 2.0, 2.0)), specialityList[0]);
        addStudent("Дмитрий", new ArrayList<>(Arrays.asList  (5.0, 5.0, 5.0, 4.0, 5.0)), specialityList[1]);
        addStudent("Михаил", new ArrayList<>(Arrays.asList  (5.0, 5.0, 5.0, 5.0, 5.0)), specialityList[3]);
        addStudent("Пантелей", new ArrayList<>(Arrays.asList(3.0, 5.0, 5.0, 5.0, 5.0)), specialityList[4]);
        addStudent("Илья", new ArrayList<>(Arrays.asList  (5.0, 5.0, 5.0, 4.0, 5.0)), specialityList[1]);
        addStudent("Николай", new ArrayList<>(Arrays.asList  (5.0, 5.0, 3.0, 4.0, 5.0)), specialityList[5]);
        addStudent("Анна", new ArrayList<>(Arrays.asList(3.0, 4.0, 5.0, 5.0, 5.0)), specialityList[1]);
        return students;
    }

}
