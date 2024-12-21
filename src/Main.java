import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Classes> classes = new ArrayList<>();

        File file = new File("src\\person-classes.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            Classes c = new Classes();
            c.setName(scanner.next());
            c.setSurname(scanner.next());
            c.setAge(Integer.parseInt(scanner.next()));
            c.setGender(Boolean.parseBoolean(scanner.next()));
            classes.add(c);
        }
        for(Classes c : classes) {
            System.out.println(c.toString());
        }
    }
}