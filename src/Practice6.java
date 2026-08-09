import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Question[] quiz = new Question[5];
        quiz[0] = new Question("Что такое класс в Java?",new String[] {"A)Готовый объект", "B)Шаблон для создания объектов", "C)Метод", "D)Переменная"},'B');
        quiz[1] = new Question("Что такое объект?",new String[]{"A) Экземпляр класса", "B) Тип данных", "C) Цикл", "D) Пакет"},'A');
        quiz[2] = new Question("Что такое метод?",new String[]{"A) Переменная класса", "B) Блок кода, выполняющий определённую задачу", "C) Тип объекта", "D) Конструктор"},'B');
        quiz[3] = new Question("Для чего нужен ArrayList?",new String[]{"A) Для работы с динамическим списком", "B) Для создания классов", "C) Для SQL", "D) Для обработки исключений"},'A');
        quiz[4] = new Question("Что делает extends?",new String[]{"A) Создаёт объект", "B) Позволяет классу наследоваться от другого класса", "C) Создаёт интерфейс", "D) Останавливает программу"},'B');
        Scanner sc = new Scanner(System.in);
        int score = 0;
        for (int i = 0; i < quiz.length; i++) {
            quiz[i].printQuestion();
            char userAns = sc.next().charAt(0);
            if (userAns == quiz[i].getCorrectAnswer()) {
                System.out.println("Правильно!");
                score = score + 100;
            } else {
                System.out.println("Неправильный ответ!");
                System.out.println("Правильный вариант:" + quiz[i].getCorrectAnswer());
            }
        }
        System.out.println("Ваш счёт: " + score);
    }
}
class Question {
    private final String questionText;
    private String[] options;
    private char correctAnswer;
    Question(String questionText, String[] options, char correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
    void printQuestion() {
        System.out.println(questionText);
        for (String option : options) {
            System.out.println(option);
        }
    }
    char getCorrectAnswer() {
        return correctAnswer;
    }
}