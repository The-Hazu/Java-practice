package university;

public class Student extends Person implements Learnable {
    private String group;
    static int studentCount = 0;
    public  Student(String name, int age, String group) {
        super(name, age);
        this.group = group;
        studentCount++;
    }
    public void study() {
        System.out.println("Студент " + getName() +  " учится в группе " + group);
    }
    @Override
    public String toString() {
        return super.toString() + " [group: " + group + "]";
    }
    static void showStudentCount() {
        System.out.println("Количество студентов: " + studentCount);
    }
}
