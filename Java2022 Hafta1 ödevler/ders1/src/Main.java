public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello World!");


        //değişkenler
        /*int studentNumber = 10;
        String message = "Student number : ";
        System.out.println(message + studentNumber); */


        //değer atamaları
        /*double number  = 12.5;
        number = -129;
        char character = 'A';
        boolean isTrue = false; */


        //if-else
        /*int number = 20;
        if (number<20) {
            System.out.println("Number smaller than 20");
        } else if (number==20) {
            System.out.println("Number is 20");
        }else {
            System.out.println("Number is bigger than 20");
        }*/


        //en büyük sayıyı bulma
        /*int number1=20;
        int number2=25;
        int number3=2;
        int biggestNumber=number1;

        if (biggestNumber<number2) {
            biggestNumber=number2;
        }
        if (biggestNumber<number3) {
            biggestNumber=number3;
        }
        System.out.println("Biggest number is : " + biggestNumber); */


        //switch-case
        /*char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Perfect! You have passed");
                break;
            case 'B':
                System.out.println("Very good! You have passed");
                break;
            case 'C':
                System.out.println("Good! You have passed");
                break;
            case 'D':
                System.out.println("Not bad! You have passed");
                break;
            case 'F':
                System.out.println("You have failed");
                break;
            default:
                System.out.println("Unexpected grade");
        } */


        //for
        /*for (int i = 1; i < 10; i++) {
            System.out.println(i);
        } */


        //while
        /* int i = 1;
        while (i<10) {
            System.out.println(i);
            i+=2;
        }
        System.out.println("loop has ended"); */


        //do-while
        /*int i=1;
        do {
            System.out.println(i);
            i+=2;
        }while (i<20); */


        //arraylar 1
        /*String[] ogrenciler = new String[3];
        ogrenciler[0] = "Polat";
        ogrenciler[1] = "Mustafa";
        ogrenciler[2] = "Timur";

        for (int i = 0; i<ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        } */


        //arraylar 2
        /*double[] numberList = {1.2,5.4,6.8,4.2};
        double total = 0;
        double max = numberList[0];
        for (double number : numberList) {
            if (number > max) {
                max=number;
            }
            total += number;
            System.out.println(number);
        }
        System.out.println("Total of numbers : " + total);
        System.out.println("Max number : " + max); */


        //2 boyutlu array
        /*String[][] cities = new String[3][3];

        for (int i = 0; i<=2; i++) {
            for (int j = 0; j<=2; j++) {
                System.out.println(cities[i][j]);
            }
        } */


        //String kullanımı 1
        /*String message = "Weather is very good today";
        System.out.println(message);

        System.out.println("Eleman sayisi : " + message.length());
        System.out.println("5. eleman : " + message.charAt(4));
        System.out.println(message.concat(" Yaşasın!"));
        System.out.println(message.startsWith("Wea"));
        System.out.println(message.endsWith("may"));

        char[] characters = new char[7];
        message.getChars(0, 7, characters, 0);
        System.out.println(characters);
        System.out.println(message.indexOf('a'));*/


        //String kullanımı 2
        /*String message = "       Weather is really good today   ";
        System.out.println(message.replace(' ','/'));
        System.out.println(message.substring(0,8));

        for (String kelime : message.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println(message.trim()); */


    }
}
