package uni;

import java.util.HashMap;

public class Transcript {

    public int studentID;
    public HashMap<Integer, Double> transcript;

    public Transcript(int studentID) {
        this.studentID = studentID;
        this.transcript = new HashMap<>();
    }

    public void setGrade(int presentedCourseID, double grade) {
        transcript.put(presentedCourseID, grade);
        System.out.println("Grade " + grade + " set for student " + studentID + " in course " + presentedCourseID);
    }

    public void printTranscript() {
        System.out.println("Transcript for student " + studentID + ":");
        for (HashMap.Entry<Integer, Double> entry : transcript.entrySet()) {
            int courseID = entry.getKey();
            double grade = entry.getValue();
            System.out.println("Course ID: " + courseID + ", Grade: " + grade);
        }
    }

    public double getGPA() {
        if (transcript.isEmpty()) {
            return 0.0;
        }
        double totalGrades = 0.0;
        for (double grade : transcript.values()) {
            totalGrades += grade;
        }
        return totalGrades / transcript.size();
    }
}