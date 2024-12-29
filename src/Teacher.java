public class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private int salary;

    public Teacher(String name, String surname,String subject, int yearsOfExperience, int salary) {
        super(name, surname);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public void giveRaise(double percentage){
        if(percentage > 0){
            salary += salary * (percentage/100);
        } else {
            System.out.println("Invalid percentage");
        }
    }

    public String getSubject() {
        return subject;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public int getSalary() {
        return salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void giveRaise(int percentage){
        this.salary += this.salary * percentage/100;
    }

    @Override
    public String toString() {
        return super.toString() + "I teach" + subject + " for " + yearsOfExperience + " years, my salary is " + salary;
    }
}
