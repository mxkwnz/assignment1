public class Classes {
    private static int id = 1;
    private int id_gen;
    private String name;
    private String surname;
    private int age;
    private boolean gender;
    public Classes() {
        id_gen = id++;
    }
    public Classes(String name, String surname) {
        this();
        this.name = name;
    }
    public Classes(String name, String surname, int age, boolean gender) {
        this(name, surname);
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public boolean isGender() {
        return gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Id:" + id_gen + "\nHi I am" + " " + name + " " + surname + ", a " + age + "-year-old" + ", " + (gender ? "male" : "female");
    }
}
