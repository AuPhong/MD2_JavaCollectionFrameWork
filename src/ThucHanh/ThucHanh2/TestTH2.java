package ThucHanh.ThucHanh2;

import java.util.HashMap;
import java.util.Map;

public class TestTH2 {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",20, "HN");
        Student student2 = new Student("Hung",21, "HN");
        Student student3 = new Student("Ha",22, "HN");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
       // System.out.println(studentMap);
        for(int ID : studentMap.keySet()){
            System.out.println(studentMap.get(ID));
        }

        for (Map.Entry<Integer, Student> student: studentMap.entrySet()){
            System.out.println(student.toString());
        }


    }
}
