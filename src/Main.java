import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Person> classes = new ArrayList<>();

        File file = new File("src\\students.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            Person c = new Person();
            c.setName(scanner.next());
            c.setSurname(scanner.next());
            c.setAge(Integer.parseInt(scanner.next()));
            c.setGender(Boolean.parseBoolean(scanner.next()));
            classes.add(c);
        }
        for(Person c : classes) {
            System.out.println(c.toString());
        }
    }
}