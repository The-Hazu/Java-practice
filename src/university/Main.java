package university;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] =  new Student("Бекжан", 18 , "25-04");
        students[1] =  new Student("Асылмурат", 20 , "23-02");
        students[2] =  new Student("Рамазан", 21 , "22-01");
        for (int i = 0; i < students.length; i++) {
            students[i].study();
            System.out.println(students[i]);
        }
        Student.showStudentCount();
    }
}
