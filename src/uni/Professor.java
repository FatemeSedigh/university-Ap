package uni;

import java.util.ArrayList;

public class Professor {

    public int id;
    public static ArrayList<Professor> professorList = new ArrayList<>();
    public int personID;
    public int majorID;

    public Professor(int personID, int majorID) {
        this.personID = personID;
        this.majorID = majorID;
        professorList.add(this);
        this.id = professorList.size();
    }

    public static Professor findByID(int id) {
        for (Professor findProfessor : professorList) {
            if (findProfessor.id == id) {
                return findProfessor;
            }
        }
        return null;
    }
}