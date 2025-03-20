package uni;

import java.util.ArrayList;

public class Student {

    public int id;
    public static ArrayList<Student> studentList = new ArrayList<>();
    public int personID;
    public final int entranceYear;
    public int majorID;
    public String studentID;
    public String name;

    public Student(int personID, int entranceYear, int majorID) {
        this.personID = personID;
        this.entranceYear = entranceYear;
        this.majorID = majorID;
        studentList.add(this);
        this.id = studentList.size();
        this.setStudentCode();
    }

    public static Student findByID(int id) {
        for (Student findStudent : studentList) {
            if (findStudent.id == id) {
                return findStudent;
            }
        }
        return null;
    }

    public void setStudentCode() {
        this.studentID = this.entranceYear + String.format("%04d", this.id);
    }
}