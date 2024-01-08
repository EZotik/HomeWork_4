package qa.qury;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //4 Примитивных целочисленных типа: byte, short, int, long
        byte a=5;// ограничение на память 1 байт (-128 до 127 число);
        short b=3;// ограничение на память 2 байт (примерно -32000 до 32000 число);
        int c=4;// ограничение на память 4 байт (огромное число));
        long d=10;// ограничение на память 8 байт (огромное число));
        long z=d/a;

        System.out.println(10/4.0); // вещественные числа приоритетные, в ответе остаток.
        System.out.println(10%4);// в ответе записывает остаток.
        System.out.println(10%3); // по умолчанию int

        //Вещественные типы: double, float
        float e=20.0f;// ограничение на память 4 байт (огромное число));
        double g=30.5;// ограничение на память 8 байт (огромное число));
        // по умолчанию double

        //символьный тип: char
        char q=98;// может принимать какой-то символ, но также может принимать число(если кладем код (цифру),
        // то в ответ покажет символ);
        System.out.println(q);

        //условный тип: boolean
        boolean f=false; // по умолчанию false

        //строковый тип (не явл. примитивным типом!): String (строки).

        //Инкременты и декременты.
        //1. ++Префиксная форма (вначале увеличивается исходное значение, увеличение в первой строчке);
        //2. Постфиксная форма ++(вначале увеличивается исходное значение, увеличение во второй строчке).

        int x = 10;
        int m=++x;
        System.out.println(x);
        System.out.println(m);

        int xx = 10;
        int mm=xx++;
        System.out.println(xx);
        System.out.println(mm);

        int yz=10;
        int zx=20;
        int ca=yz+10* ++zx;
        System.out.println(ca);

        char c1='y';
        System.out.println(++c1 + 10);// при арифметич. операциях с числом в результате будет число;

        //Логические операции:
        boolean name = (2>8)||(6>4);//true
        boolean name1 = (2>8)&&(6>4);//false
        boolean name2 = (2>8)&&(6/2>4);//false
        boolean name3 = ((2>8)&&(6/2>4))||((6/3<0)&&(10*2>30));//false
        System.out.println(name3);

        //Преобразование примитивных типов:
        short x2 = 1;
        byte ah =(byte)x2;
        System.out.println(ah);//превратили  short в byte

        long zc=2;
        float we = zc;
        System.out.println(we);

        float zc1=2.3334566f;
        long we1 = (long)zc;
        System.out.println(we1);

        float zc2=2.3334566f;
        double we2= zc;
        System.out.println(we2);

        double zc3=2.3334566;
        float we3 = (short)zc3;
        System.out.println(we3);

        long ab=10;
        long qa = ++ab;
        System.out.println(qa);

        // Переполнение:
        int intValue = 128;
        byte value = (byte)intValue;
        System.out.println(value);

        // IfElse:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a1 = scanner.nextInt();
        if (a1>9 && a1<100){
            System.out.println("Введено двухзначное число");
        } else {
            System.out.println("Введено однозначное число");
        }

        // в параметрах Switch не может быть 4 типа: boolean, long, float, double (из-за особенностей языка)
        String a2 = "false";
        switch (a2){
            case "true": System.out.println("Вы ввели true"); break; //для выхода из кейсов (разграничитель)
            case "false": System.out.println("Вы ввели false"); break;
            case "123": System.out.println("Вы ввели 123"); break;
            default:
                System.out.println("Данные не найдены");
        }
    }
}