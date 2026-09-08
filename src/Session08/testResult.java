package Session08;

import java.util.HashMap;
import java.util.Map;

public class testResult {
    public static void main(String[] args) {

    }
    public static Map getOriginalGrades()
    {
        Map Grades = new HashMap<>();
        Grades.put("Islam",90);
        Grades.put("Ahmed",80);
        Grades.put("Adham",70);
        Grades.put("Mohamed",60);

        return Grades;

    }
    public static Map getMakeupGrades()
    {
        Map Grades = new HashMap<>();
        Grades.put("Islam",90);
        Grades.put("Ahmed",95);
        Grades.put("Adham",80);
        Grades.put("Mohamed",50);

        return Grades;

    }
}
