package com.homework_lesson_10;

import com.homework_lesson_10.myInterface.I_MathOperation;
import java.util.Scanner;
/**
 * Создать обобщенный функциональный интерфейс
 * Написать класс с методом мэйн.
 * В этом методе мейн реализуйте логику
 * если в консоль введена цифра 1, то:
 *  использования интерфейса со строковым типом
 *  и передать в метод интерфейса логику реверса строки(вывода строки в обратном порядке)
 *
 * если в консоль введена цифра 2, то:
 * использования интерфейса с целочисленным типом и передать в метод интерфейса логику нахождения факториала числа
 */
public class Main{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        scanner.close();


        int testNumber = 7;
        String testLine = "Hello, Andrew. Here is my homework";


        I_MathOperation<String> i_mathOperation_1 = t -> new StringBuilder(t).reverse().toString();
        I_MathOperation<Integer> i_mathOperation_2 = t -> {
            int result = 1;
            for (int i = 1; i <= t; i++) {
                result = result * i;
            }
            return result;
        };


        if (index == 1) {
            System.out.println(i_mathOperation_1.select(testLine));
        } else if (index == 2) {
            System.out.println(i_mathOperation_2.select(testNumber));
        } else System.out.println("Wrong index");

    }

}
