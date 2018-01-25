import java.util.Scanner;

public class MathQuiz {

    int correctAnswers = 0;

    Scanner question = new Scanner(System.in);

    public boolean question1() {
        int answer = 15;
        System.out.println("3 * 5 is equal ?");
        int equal = question.nextInt();

        return answer == equal;
    }

    public boolean question2() {
        int answer = 144;
        System.out.println("What is the area of the square with side length equal 12 ?");
        int area = question.nextInt();

        return answer == area;
    }

    public boolean question3() {
        int answer = 123;
        System.out.println("What is the square root of 15129 ?");
        int squareRoot = question.nextInt();

        return answer == squareRoot;
    }

    public void checkResult(boolean question1, boolean question2, boolean question3) {
        if(question1) {
            System.out.println("Question 1: \nThe result is: 15\nIs correct answer\n");
            correctAnswers += 1;
        }else {
            System.out.println("Question 1: \nThe result is: 15\nIs not correct answer\n");
        }
        if(question2) {
            System.out.println("Question 2: \nThe result is: 144\nIs correct answer\n");
            correctAnswers += 1;
        }else {
            System.out.println("Question 2: \nThe result is: 144\nIs not correct answer\n");
        }
        if(question3) {
            System.out.println("Question 3: \nThe result is: 123\nIs correct answer\n");
            correctAnswers += 1;
        }else {
            System.out.println("Question 3: \nThe result is: 123\nIs not correct answer\n");
        }
    System.out.printf("Correct %d out of 3", correctAnswers);
    }



}
