import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        grades = new ArrayList<>();
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double total = 0;
        for (Integer grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }
    public void updateGrade(int grade, int index) {
        this.grades.set(index, grade);
    }
    public void deleteGrade(int index) {
        this.grades.remove(index);
    }
}