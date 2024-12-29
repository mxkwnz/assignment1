import java.util.ArrayList;

public class Student extends Person {
    private static int idC = 1;
    private int studentID;
    private ArrayList<Integer> grades;

    public Student(String name, String surname, ArrayList<Integer> grades) {
        super(name, surname);
        this.studentID = idC++;
        this.grades = new ArrayList<>(grades);
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade");
        }
    }

    public double calculateGPA() {
        if (grades.isEmpty()) {
            return 0;
        }
        double totalGPA = 0;
        for (Integer grade : grades) {
            totalGPA += gradeToGPA(grade);
        }
        double averageGPA = totalGPA / grades.size();
        return Math.round(averageGPA * 100.0) / 100.0; // Rounds to 2 decimal places
    }

    private double gradeToGPA(int grade) {
        if (grade >= 95) return 4.0;
        else if (grade >= 90) return 3.67;
        else if (grade >= 85) return 3.33;
        else if (grade >= 80) return 3.0;
        else if (grade >= 75) return 2.67;
        else if (grade >= 70) return 2.33;
        else if (grade >= 65) return 2.0;
        else if (grade >= 60) return 1.67;
        else if (grade >= 55) return 1.33;
        else if (grade >= 50) return 1.0;
        else return 0.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", I am a Student with ID " + studentID + ", my GPA is " + calculateGPA();
    }
}
