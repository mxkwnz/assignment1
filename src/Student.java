import java.util.ArrayList;

public class Student extends Person {
    private static int idC=1;
    private int studentID;
    private ArrayList<Integer> grades;

    public Student(String name, String surname, ArrayList<Integer> grades) {
        super(name, surname);
        this.studentID=idC++;
        this.grades = new ArrayList<>(grades);
    }
    public void addGrade(int grade) {
        if(grade >=0 && grade <=100) {
            grades.add(grade);
        }
        else{
            System.out.println("Invalid grade");
        }
    }
    public double calculateGPA(){
        if(grades.isEmpty()){
            return 0;
        }
        int total = 0;
        for(Integer grade : grades){
            total += grade;
        }
        return total/(double)grades.size();
    }
    @Override
    public String toString() {
        return super.toString() + " I am a Student with ID" + studentID + ", my GPA is " + calculateGPA();
    }
}
