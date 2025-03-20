package uni;

import java.util.ArrayList;

public class Course {

    public int id;
    public static ArrayList<Course> courseList = new ArrayList<>();
    public String title;
    public int units;

    public Course(String title, int units) {
        this.title = title;
        this.units = units;
        courseList.add(this);
        this.id = courseList.size();
    }

    public static Course findByID(int id) {
        for (Course findCourse : courseList) {
            if (findCourse.id == id) {
                return findCourse;
            }
        }
        return null;
    }
}