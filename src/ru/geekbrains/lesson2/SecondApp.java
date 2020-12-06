package ru.geekbrains.lesson2;

import java.util.Arrays;

public class SecondApp
{
    public static void main(String[] args)
    {
    //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    //Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int a = 0;
        int b = 1;

        int[] arr = new int[2];
        arr[0] = a;
        arr[1] = b;

        while(a == 0 && b == 1) {
            a = 1;
            System.out.println("a = " + a);
            b = 0;
            System.out.println("b = " + b);
        }

    //2. Задать пустой целочисленный массив размером 8.
    //С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int j = 0;
        int[] arrA = new int[8];
        for(int i = 0; i <= 21; i = i + 3) {
            arrA[j] = i;
            System.out.println("arrA[" + j + "] = " + i);
            j++;
        }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    //пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] arrB = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int k = 0; k < arrB.length; k++) {
            if (arrB[k] < 6) {
                arrB[k] = arrB[k] * 2;
            }
        }
        System.out.println(Arrays.toString(arrB));

    //4. Создать квадратный двумерный целочисленный массив
    // (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
    //заполнить его диагональные элементы единицами;

        int i = 0;
        int r = 0;
        int[][] table = new int[10][10];
        for(i = 0; i < table.length; i++) {
            for (r = 0; r < table.length; r++) {
                if(i == r) {
                    table[i][r] = 1;
                }
            }
        }
        for(i = table.length - 1; i >= 0; i--) {
            for(r = 0; r < table.length; r++) {
                if (r + i == table.length - 1) {
                    table[i][r] = 1;
                }
            }
        }
        for(i = 0; i < table.length; i++) {
            System.out.println(Arrays.toString(table[i]) + " ");
        }

    //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

        int[] arrF = new int[]{1, 5, 3, 2, 11, 4, 5, -2, 4, 8, 9, 1};
        int maxN = arrF[0];
        int minN = arrF[0];
        for(i = 1; i < arrF.length; i++) {
            if(maxN < arrF[i]) {
                maxN = arrF[i];
            }
            if (arrF[i] < minN) {
                minN = arrF[i];
            }
        }
        System.out.println("максимальное значение: " + maxN + "\n" + "минимальное значение: " + minN);

        //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        //метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        //Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
        //граница показана символами ||, эти символы в массив не входят.


        int[] arrT = new int[]{ 2, 3, 5, 0, 1, 9 };
        int iLeft = 0;
        int iRight = arrT.length - 1;
        int sumLeft = arrT[iLeft];
        int sumRight = arrT[iRight];
        while (iLeft + 1 < iRight) {
            if (sumLeft < sumRight) {
                iLeft++;
                sumLeft = sumLeft + arrT[iLeft];
            }
            else {
                iRight--;
                sumRight = sumRight + arrT[iRight];
            }
        }
        if(sumLeft == sumRight) {
            System.out.println("True: сумма значений правой и левой части массива равны");
        }
        else {
            System.out.println("Fasle: сумма значений правой и левой части массива не равны");
        }

        //7. **** Написать метод, которому на вход подается одномерный массив и число n
        //(может быть положительным, или отрицательным), при этом метод должен сместить
        //все элементы массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.

        int[] arrR = new int[]{ 1, 2, 3};
            int n = - 1;
            if(n > 0) {
                n = n % arrR.length;
                for (i = 0; i < n; i++) {
                    for (i = arrR.length - 1; i > 0; i--) {
                        int elA = arrR[i];
                        int elB = arrR[i - 1];
                        arrR[i] = elB;
                        arrR[i - 1] = elA;
                    }
                }
                System.out.println(Arrays.toString(arrR));
            }
            else {
                n = -1 * n;
                n = n % arrR.length;
                for (i = arrR.length - 1; i > n; i--) {
                    for (i = 0; i < arrR.length - 1; i++) {
                        int elA = arrR[i];
                        int elB = arrR[i + 1];
                        arrR[i] = elB;
                        arrR [i + 1] = elA;
                    }
                }
                System.out.println(Arrays.toString(arrR));
            }
    }
}
