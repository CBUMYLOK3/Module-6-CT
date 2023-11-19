import java.util.Comparator;

public class SortStudentName implements Comparator<StudentArray> {
    public int compare(StudentArray a, StudentArray b){
        return a.name.compareTo(b.name);
    }
}