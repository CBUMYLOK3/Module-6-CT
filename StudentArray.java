public class StudentArray {
    int rollno;
    String name;
    String address;

    public StudentArray(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return "Student Roll Number: " + rollno + ", Name: " + name + ", Address: " + address;
    }
}