import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        School school = new School();

        File studentsFile = new File("src\\students.txt");
        Scanner studentsScan = new Scanner(studentsFile);
        File teachersFile = new File("src\\teachers.txt");
        Scanner teacherScan = new Scanner(teachersFile);
        while (studentsScan.hasNextLine()) {
            String line = studentsScan.nextLine().trim();
            if (line.isEmpty()) continue;

            Scanner lineScanner = new Scanner(line);
            String name = lineScanner.next();
            String surname = lineScanner.next();
            int age = lineScanner.nextInt();
            boolean gender = lineScanner.nextBoolean();

            ArrayList<Integer> grades = new ArrayList<>();
            while (lineScanner.hasNextInt()) {
                grades.add(lineScanner.nextInt());
            }

            Student std = new Student(name, surname, grades);
            std.setAge(age);
            std.setGender(gender);
            school.addMember(std);
            lineScanner.close();
        }
        studentsScan.close();
        while (teacherScan.hasNextLine()) {
            String line = teacherScan.nextLine().trim();
            if(line.isEmpty()) continue;
            Scanner lineScanner = new Scanner(line);
            String name = lineScanner.next();
            String surname = lineScanner.next();
            int age = lineScanner.nextInt();
            boolean gender = lineScanner.nextBoolean();
            String subject = lineScanner.next();
            int yearsOfExperience = lineScanner.nextInt();
            int salary = lineScanner.nextInt();

            Teacher teacher = new Teacher(name, surname, subject, yearsOfExperience, salary);
            teacher.setAge(age);
            teacher.setGender(gender);
            school.addMember(teacher);
            lineScanner.close();
        }
        teacherScan.close();
        school.getMembers().sort((p1, p2) -> p1.getSurname().compareToIgnoreCase(p2.getSurname()));
        System.out.println(school);
        for(Person member : school.getMembers()) {
            System.out.println(member);
        }
    }
}