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

        String testString = "Hello Andrew, here is my homework";
        int testNumber = 7;

        I_MathOperation i_mathOperation;
        switch (index) {
            case  (1):
                i_mathOperation = new I_MathOperation<String>() {
                    @Override
                    public String select(String a) {
                        return new StringBuilder(a).reverse().toString();
                    }
                };
                break;
            case (2):
                i_mathOperation = new I_MathOperation<Integer>() {
                    @Override
                    public Integer select(Integer a) {
                        int result = 1;
                        for (int i = 1; i <= a; i++) {
                            result = result*i;
                        }
                        return result;
                    }
                };
                break;
            default:
                i_mathOperation = new I_MathOperation() {
                    @Override
                    public Object select(Object a) {
                        return null;
                    }
                };
                break;
        }

        if (index == 1){
            System.out.println(i_mathOperation.select(testString));
        } else if (index == 2){
            System.out.println(i_mathOperation.select(testNumber));
        } else System.out.println("unknown index");











    }

}
