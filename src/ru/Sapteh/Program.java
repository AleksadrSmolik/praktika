package ru.Sapteh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        System.out.println(devesion(30, 5));

        System.out.println(proizv(4, 5, 6, 7));

        String[] strings = new String[]{"Vasya", "Antoni", "Lia", "Aleksey", "Aleksandr"};
        System.out.println(Arrays.toString(sortLength(strings)));

        List<Integer> array = new ArrayList<>(List.of(4, 5, 6, 7, 8, 8 , 10));
//        array.add(2);
//        array.add(5);
//        array.add(8);
//        array.add(11);
//        array.add(12);
//        array.add(9);
        System.out.println(positiv(array));
    }

    public static int devesion(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public static long proizv(int... a) {
        long res = (1);
        for (int el : a) {
            res *= el;
        }
        return res;
    }


    public static String[] sortLength(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String tp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tp;

                }
            }
        }
        return arr;
    }

    public static int positiv(List<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)  0) {
                count++;
            }
        }
        return count;
    }
}
