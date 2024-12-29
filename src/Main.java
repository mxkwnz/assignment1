import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        School school = new School();

        File studentsFile = new File("src\\students.txt");
        Scanner studentsScan = new Scanner(studentsFile);
        while (studentsScan.hasNextLine()) {
            String line = studentsScan.nextLine().trim();
            if (line.isEmpty()) continue;

            Scanner lineScanner = new Scanner(line);
            String name = lineScanner.next();
            String surname = lineScanner.next();
            int age = -1;
            if (lineScanner.hasNextInt()) {
                age = lineScanner.nextInt();
            } else {
                System.out.println("Invalid age value for student: " + name + " " + surname);
            }

            boolean gender = false;
            String genderInput = lineScanner.next();
            if (genderInput.equalsIgnoreCase("male")) {
                gender = false;
            } else if (genderInput.equalsIgnoreCase("female")) {
                gender = true;
            } else {
                System.out.println("Invalid gender value for student: " + name + " " + surname);
            }

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

        File teachersFile = new File("src\\teachers.txt");
        Scanner teacherScan = new Scanner(teachersFile);
        while (teacherScan.hasNextLine()) {
            String line = teacherScan.nextLine().trim();
            if (line.isEmpty()) continue;

            Scanner lineScanner = new Scanner(line);
            String name = lineScanner.next();
            String surname = lineScanner.next();

            int age = -1;
            if (lineScanner.hasNextInt()) {
                age = lineScanner.nextInt();
            } else {
                System.out.println("Invalid age value for teacher: " + name + " " + surname);
            }

            boolean gender = false;
            String genderInput = lineScanner.next();
            if (genderInput.equalsIgnoreCase("male")) {
                gender = false;
            } else if (genderInput.equalsIgnoreCase("female")) {
                gender = true;
            } else {
                System.out.println("Invalid gender value for teacher: " + name + " " + surname);
            }

            String subject = lineScanner.next();
            int yearsOfExperience = -1;
            if (lineScanner.hasNextInt()) {
                yearsOfExperience = lineScanner.nextInt();
            } else {
                System.out.println("Invalid years of experience value for teacher: " + name + " " + surname);
            }

            int salary = -1;
            if (lineScanner.hasNextInt()) {
                salary = lineScanner.nextInt();
            } else {
                System.out.println("Invalid salary value for teacher: " + name + " " + surname);
            }

            Teacher teacher = new Teacher(name, surname, subject, yearsOfExperience, salary);
            teacher.setAge(age);
            teacher.setGender(gender);
            school.addMember(teacher);
            lineScanner.close();
        }
        teacherScan.close();

        school.getMembers().sort((p1, p2) -> p1.getSurname().compareToIgnoreCase(p2.getSurname()));

        System.out.println("School members:");
        for (Person member : school.getMembers()) {
            System.out.println(member);
        }
    }
}
