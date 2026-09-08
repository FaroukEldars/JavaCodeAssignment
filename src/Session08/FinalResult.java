package Session08;

import java.util.Map;

public class FinalResult {
    public static void main(String[] args) {
        Map<String,Integer> originalGrades=testResult.getOriginalGrades();
        Map<String,Integer> makeupGrades= testResult.getMakeupGrades();
        for(var student:makeupGrades.entrySet())
        {
            Integer firstGrade= originalGrades.get(student.getKey());
            Integer secondGrade= makeupGrades.get(student.getKey());
            if (secondGrade>firstGrade)
            {
                originalGrades.put(student.getKey(),secondGrade);
            }
            System.out.println("student"+student.getKey()+" has grade "+originalGrades.get(student.getKey()));
        }


    }
}
