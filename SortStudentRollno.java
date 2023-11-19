import java.util.Comparator;

public class SortStudentRollno implements Comparator<StudentArray> {
    public int compare(StudentArray a, StudentArray b){
        if(a.rollno > b.rollno)
            return 1;
        else
            return -1;
    }
}