import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainCode {

    public static void main(String[] args) {


        ArrayList<StudentArray> studentList = new ArrayList<StudentArray>();
        studentList.add(new StudentArray(2, "Michael", "1234 Home St"));
        studentList.add(new StudentArray(5, "John", "4567 South St"));
        studentList.add(new StudentArray(3, "Doe", "3256 West St"));
        studentList.add(new StudentArray(1, "Bob", "3236 Bark St"));

        Collections.sort(studentList, new SortStudentRollno());

        System.out.println("Sorted by Roll Number:");
        for (int i = 0; i < studentList.size(); i++)
            System.out.println(studentList.get(i));

        Collections.sort(studentList, new SortStudentName());

        System.out.println("\nSorted by Name:");
        for (int i = 0; i < studentList.size(); i++)
            System.out.println(studentList.get(i));
    }
}