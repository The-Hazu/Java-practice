import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player1[] players = new Player1[3];
        players[0] = new Player1("1", 0);
        players[1] = new Player1("2", 0);
        players[2] = new Player1("3", 0);
        Question1[] quiz = new Question1[5];
        quiz[0] = new Question1("1. Что такое инкапсуляция в Java?", new String[]{"A. Хранение данных только в массивах","B. Сокрытие внутреннего состояния объекта и контроль доступа к нему", "C. Создание нескольких классов", "D. Автоматическое создание объектов"}, 'B');
        quiz[1] = new Question1("2. Какой модификатор делает поле доступным только внутри своего класса?", new String[]{"A. public","B. protected","C. private","D. static"}, 'C');
        quiz[2] = new Question1("3. Что означает this внутри метода или конструктора?", new String[]{"A. Ссылка на текущий объект","B. Ссылка на родительский класс","C. Создание нового объекта","D. Удаление текущего объекта"}, 'A');
        quiz[3] = new Question1("4. Для чего используется toString()?", new String[]{"A. Для сравнения двух объектов","B. Для преобразования String в int","C. Для получения строкового представления объекта","D. Для создания конструктора"}, 'C');
        quiz[4] = new Question1("5. Что такое интерфейс в Java?", new String[]{"A. Класс, который нельзя создать","B. Контракт, который определяет, какие методы класс должен реализовать","C. Переменная, которая хранит объект","D. Специальный тип массива"}, 'B');
        for (int currentPlayer = 0; currentPlayer < players.length; currentPlayer++) {
            System.out.println("Ход игрока: " + players[currentPlayer].toString());
            System.out.println("-------------------------------");
            for (int j = 0; j < quiz.length; j++) {
                quiz[j].printQuestion();
                quiz[j].printAnswer();
                char correctAnswer = quiz[j].getCorrectAnswer();
                String userAnswer = sc.nextLine();
                char usans = userAnswer.charAt(0);
                if (usans == correctAnswer) {
                    System.out.println("Correct!");
                    players[currentPlayer].addScore();
                } else {
                    System.out.println("Wrong!");
                    System.out.println("Correct answer: " + quiz[j].getCorrectAnswer());
                }
            }
        }
        for (Player1 player : players) {
            System.out.println(player.toString());
        }
    }
}
class Question1 {
    private String question;
    private String[] answer;
    private char correctAnswer;
    public Question1(String question, String answer [], char correctAnswer) {
        this.question = question;
        this.answer = answer;
        this.correctAnswer = correctAnswer;
    }
    void  printQuestion(){
        System.out.println(question);
    }
    void printAnswer(){
        for(int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }
    }
    char getCorrectAnswer(){
        return correctAnswer;
    }
}
class Player1 {
    private String name;
    private int score = 0;
    public Player1(String name, int score) {
        this.name = name;
        this.score = score;
    }
    void addScore(){
        score = score + 100;
    }
    @Override
    public String toString() {
        return "Player-" + name + ", score: " + score;
    }
}