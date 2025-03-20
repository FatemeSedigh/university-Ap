import uni.Major;
import uni.Student;
import uni.Professor;
import uni.Course;
import uni.PresentedCourse;
import uni.Transcript;
import base.Person;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(1, 1403, 1);
        student1.name = "فاطمه";
        Student student2 = new Student(2, 1403, 1);
        student2.name = "پانیذ";
        Student student3 = new Student(3, 1403, 2);
        student3.name = "نگین";

        Major major1 = new Major("ریاضی", 50);
        Major major2 = new Major("علوم کامپیوتر", 40);

        Professor professor1 = new Professor(4, 1);
        professor1.name = "استاد نجفی";
        Professor professor2 = new Professor(5, 2);
        professor2.name = "استاد قطعی";

        Course course1 = new Course("BP", 3);
        Course course2 = new Course("AP", 4);
        Course course3 = new Course("DS", 3);

        PresentedCourse presentedCourse1 = new PresentedCourse(course1.id, professor1.id, 30);
        PresentedCourse presentedCourse2 = new PresentedCourse(course2.id, professor1.id, 30);
        PresentedCourse presentedCourse3 = new PresentedCourse(course3.id, professor2.id, 25);

        presentedCourse1.addStudent(student1.id);
        presentedCourse1.addStudent(student2.id);
        presentedCourse2.addStudent(student1.id);
        presentedCourse2.addStudent(student2.id);
        presentedCourse2.addStudent(student3.id);
        presentedCourse3.addStudent(student3.id);

        Transcript transcript1 = new Transcript(student1.id);
        Transcript transcript2 = new Transcript(student2.id);
        Transcript transcript3 = new Transcript(student3.id);

        transcript1.setGrade(presentedCourse1.id, 19.05);
        transcript1.setGrade(presentedCourse2.id, 18.75);
        transcript2.setGrade(presentedCourse1.id, 12.25);
        transcript2.setGrade(presentedCourse2.id, 10.05);
        transcript3.setGrade(presentedCourse2.id, 20.00);
        transcript3.setGrade(presentedCourse3.id, 15.75);

        Professor foundProfessor1 = Professor.findByID(4);
        if (foundProfessor1 != null) {
            System.out.println(foundProfessor1.name + " - آیدی: " + foundProfessor1.id + " - رشته: ریاضی");
        } else {
            System.out.println("استاد با آیدی 4 پیدا نشد.");
        }

        Professor foundProfessor2 = Professor.findByID(5);
        if (foundProfessor2 != null) {
            System.out.println(foundProfessor2.name + " - آیدی: " + foundProfessor2.id + " - رشته: علوم کامپیوتر");
        } else {
            System.out.println("استاد با آیدی 5 پیدا نشد.");
        }

        Student foundStudent1 = Student.findByID(1);
        Student foundStudent2 = Student.findByID(2);
        Student foundStudent3 = Student.findByID(3);

        System.out.println("\n" + foundStudent1.name + " - آیدی: " + foundStudent1.id + " - رشته: ریاضی");
        transcript1.printTranscript();
        System.out.println("معدل: " + transcript1.getGPA());

        System.out.println("\n" + foundStudent2.name + " - آیدی: " + foundStudent2.id + " - رشته: ریاضی");
        transcript2.printTranscript();
        System.out.println("معدل: " + transcript2.getGPA());

        System.out.println("\n" + foundStudent3.name + " - آیدی: " + foundStudent3.id + " - رشته: علوم کامپیوتر");
        transcript3.printTranscript();
        System.out.println("معدل: " + transcript3.getGPA());
    }
}