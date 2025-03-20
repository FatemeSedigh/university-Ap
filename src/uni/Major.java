package uni;

import java.util.ArrayList;

public class Major {
    public int id;
    public static ArrayList<Major> majorList = new ArrayList<>();
    public String name;
    public final int capacity;
    public int numberOfStudents;

    public Major(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.numberOfStudents = 0;
        majorList.add(this);
        this.id = majorList.size();
    }

    public static Major findByID(int id) {
        for (Major findMajor : majorList) {
            if (findMajor.id == id) {
                return findMajor;
            }
        }
        return null;
    }

    public void addStudent() {
        if (numberOfStudents < capacity) {
            numberOfStudents++;
            System.out.println("Student added to " + name + ". Current number of students: " + numberOfStudents);
        } else {
            System.out.println("Cannot add more students to " + name + ". Capacity is full.");
        }
    }
}
