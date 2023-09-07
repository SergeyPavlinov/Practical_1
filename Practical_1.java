package practical_works;
import java.util.Scanner;

public class Practical_1 {
    public static int factorial(int a)
    {
        int result = 1;
        if (a == 0)
        {
            return 1;
        }
        else
        {
            for (int i = 1; i <= a; i++)
            {
                result *= i;
            }
        }
        return result;
    }

    public static void main (String[] args) {

        // 3
        /*int[] x = new int[]{0,1,2,3,4,5,6,7,8,9};
        float sum = 0;
        float sr = 0;
        for (int i = 0; i < x.length; i++)
        {
            sum += x[i];
        }
        sr = sum / x.length;
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее арифметическое: " + sr);*/

        // 4
        /*Scanner input = new Scanner(System.in);
            int min = 100000000;
            int max = 0;
            int sum = 0;
            System.out.println("Введите длину массива: ");
            int size = input.nextInt();
            int array[] = new int[size];
            int a = 0;
            System.out.println("Введите элементы массива: ");

            for (int i = 0; i < size; i++)
            {
                array[i] = input.nextInt();
            }

            while(a < size)
            {
                if (array[a] < min)
                {
                    min = array[a];
                }

                if (array[a] > max)
                {
                    max = array[a];
                }
                sum += array[a];
                a ++;
            }
            System.out.println("Максимальный элемент: " + max);
            System.out.println("Минимальный элемент: " + min);
            System.out.println("Сумма элементов: " + sum);*/

        // 5
        /*for (String str : args) {
            System.out.println("аргумент = " + str);
        }*/

        // 6
        /*for (int i = 1; i < 11; i++) {
            //System.out.println(1./ i);
            System.out.println(1 + "/" + i);
        }*/

        // 7
        /*Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = factorial(input.nextInt());
        System.out.println("Факториал числа: " + num);*/

    }
}

