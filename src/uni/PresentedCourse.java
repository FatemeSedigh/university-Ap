package uni;

import java.util.ArrayList;

public class PresentedCourse {

    public int id;
    public static ArrayList<PresentedCourse> presentedCourseList = new ArrayList<>();
    public int courseID;
    public int professorID;
    public int capacity;
    public ArrayList<Integer> studentIds;

    public PresentedCourse(int courseID, int professorID, int capacity) {
        this.courseID = courseID;
        this.professorID = professorID;
        this.capacity = capacity;
        this.studentIds = new ArrayList<>();
        presentedCourseList.add(this);
        this.id = presentedCourseList.size();
    }

    public static PresentedCourse findByID(int id) {
        for (PresentedCourse findCourse : presentedCourseList) {
            if (findCourse.id == id) {
                return findCourse;
            }
        }
        return null;
    }

    public void addStudent(int studentID) {
        if (studentIds.size() < capacity) {
            studentIds.add(studentID);
            System.out.println("Student " + studentID + " added to course " + courseID);
        } else {
            System.out.println("Cannot add student " + studentID + ". Course " + courseID + " is full.");
        }
    }
}