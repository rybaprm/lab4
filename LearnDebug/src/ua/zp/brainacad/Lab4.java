package ua.zp.brainacad;

import java.util.Calendar;

public class Lab4 {
    public static void main(String[] args) {
//        ЗАДАНИЯ
//        1. Решить логические вычисления:
//        a. true && false || true && !false
//        b. false || false || !true && false
//        c. !false && (false || true && true)
//        d. 4 > 8 && !(7 == 0)
//        e. !(true && false || false && true) && !(true && 4 <= 5)
        boolean isBool_a = true && false || true && !false; //true
        boolean isBool_b = false || false || !true && false; //false
        boolean isBool_c = !false && (false || true && true); //true
        boolean isBool_d = 4 > 8 && !(7 == 0); //false
        boolean isBool_e = !(true && false || false && true) && !(true && 4 <= 5); //false
        System.out.println(isBool_a);
        System.out.println(isBool_b);
        System.out.println(isBool_c);
        System.out.println(isBool_d);
        System.out.println(isBool_e);

//        2. Написать программу, которая выводит на экран (с новой строки) числа от 0 до 10
//        и возле каждого пишет четное это число или нечетное.
//                Пример
//        1 -> нечетное
//        2 -> четное
//        и т д.
        for (int i = 0; i <= 10; i++) {
            System.out.println(i % 2 == 0 ? i + " -> четное" : i + " -> нечетное");
        }

//        3. Написать программу, которая выводит информацию о дне неделе.
//                Например для понедельника – пятницы выводит сообщение “Это рабочий
//        день”, а для субботы и воскресенья выводит “Это выходной!”
        Calendar c = Calendar.getInstance();
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayOfWeek == 1 && dayOfWeek == 7 ? "Это выходной!" : "Это рабочий день");

//        4. Написать программу, которая считает факториал числа и выводит
//        промежуточные значения на экран.
//        Условие: если промежуточное значение >1000, завершить цикл предварительно
//        написав в консоли “Достигнут максимально возможный результат”.
        int result = 1;
        for (int j = 1; j < 1000; j++) {
            result *= j;
            if (result > 1000) {
                System.out.println("Достигнут максимально возможный результат");
                break;
            }
            System.out.println(result);
        }

//        5. Написать программу, которая выводит на экран каждое 3-е i-ое значение цикла.
        for (int k = 0; k < 20; k++) {
            if ((k + 1) % 3 == 0) {
                System.out.println(k);
            }
        }
    }
}
