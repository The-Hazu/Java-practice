import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Question[] quiz = new Question[5];
        for (int i = 0; i < quiz.length; i++) {
            quiz[i] = new Question();
        }
        quiz[0].setData("Что такое класс в Java?",new String[] {"A)Готовый объект", "B)Шаблон для создания объектов", "C)Метод", "D)Переменная"},'B');
        quiz[1].setData("Что такое объект?",new String[]{"A) Экземпляр класса", "B) Тип данных", "C) Цикл", "D) Пакет"},'A');
        quiz[2].setData("Что такое метод?",new String[]{"A) Переменная класса", "B) Блок кода, выполняющий определённую задачу", "C) Тип объекта", "D) Конструктор"},'B');
        quiz[3].setData("Для чего нужен ArrayList?",new String[]{"A) Для работы с динамическим списком", "B) Для создания классов", "C) Для SQL", "D) Для обработки исключений"},'A');
        quiz[4].setData("Что делает extends?",new String[]{"A) Создаёт объект", "B) Позволяет классу наследоваться от другого класса", "C) Создаёт интерфейс", "D) Останавливает программу"},'B');
        Scanner sc = new Scanner(System.in);
        int score = 0;
        for (int i = 0; i < quiz.length; i++) {
            quiz[i].printQuestion();
            char userAns = sc.next().charAt(0);
            if (userAns == quiz[i].correctAnswer ) {
                System.out.println("Правильно!");
                score = score + 100;
            } else {
                System.out.println("Неправильный ответ!");
            }
        }
        System.out.println("Ваш счёт: " + score);
    }
}
class Question {
    String questionText;
    String[] options;
    char correctAnswer;

    void setData(String text, String[] opts, char answer) {
        questionText = text;
        options = opts;
        correctAnswer = answer;
    }
    void printQuestion() {
        System.out.println(questionText);
        for (String option : options) {
            System.out.println(option);
        }
    }
}