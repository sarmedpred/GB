    package ru.geekbrains.lesson1;

        //  1. Создать пустой проект в IntelliJ IDEA и прописать метод main();

    import javax.xml.namespace.QName;

    public class FirstApp
    {
        public static void main(String[] args)
        {
            System.out.println("Hello World!");

            //  2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
            byte aa = 100;
            short bb = 10000;
            int cc = 10;
            long dd = 100000L;

            float ee = 10.1f;
            double ff = 10.11;

            char jj = '*';

            boolean kk = true;
            boolean ll = false;

            //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
            //где a, b, c, d – входные параметры этого метода;

            int a = 1;
            int b = 2;
            int c = 3;
            int d = 4;
            float f = a * (b + (c / d));
            System.out.println(f);

            //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
            //в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;

            a = 5;
            b = 10;
            c = a + b;
            if (c > 10 && c <= 20)
            {
                System.out.println("Верно: " + c + " в пределах от 10 до 20 включительно.");
                //System.out.println(c);
            }

            //5. Написать метод, которому в качестве параметра передается целое число, метод должен
            //напечатать в консоль положительное ли число передали, или отрицательное;
            //Замечание: ноль считаем положительным числом.

            a = -6;
            if (a >= 0)
            {
                System.out.println("Число " + a + " положительное.");
            }
            else if (a < 0)
            {
                System.out.println("Число " + a + " отрицательное.");
            }

            //6. Написать метод, которому в качестве параметра передается целое число, метод должен
            //вернуть true, если число отрицательное;

            a = -2;
            if (a < 0)
            {
                System.out.println("Верно");
            }

            //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
            //метод должен вывести в консоль сообщение «Привет, указанное_имя!»;

            String myName = "Гуля";
            String result = printName(myName);
            System.out.println(result);
        }

        static String printName(String name)
        {
            return ("Привет, " + name + "!");
        }

        public static void printMyName(String name)
        {
            System.out.println("Привет, " + name + "!");
        }

        //8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
        //Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

        public static void printLeapYear(int year)
        {
            if (year % 400 == 0)
            {
                System.out.println("Год високосный");
            }
            else
            {
                if (year % 4 == 0)
                {
                    if (year % 100 == 0)
                    {
                        System.out.println("Год невисокосный");
                    }
                    else
                    {
                        System.out.println("Год високосный");
                    }
                }
                else
                {
                    System.out.println("Год невисокосный");
                }
            }
        }
    }

