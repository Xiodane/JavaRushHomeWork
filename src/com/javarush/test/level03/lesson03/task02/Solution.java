package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {
    double b = convertEurToUsd(1,1.5);
        System.out.println(b);
        b = convertEurToUsd(2,2.5);
        System.out.println(b);
    }

    public static double convertEurToUsd(int eur, double course){
        double result = eur*course;
        return result;

    }
}
