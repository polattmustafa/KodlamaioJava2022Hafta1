import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int number = 28;
        List<Integer> tamBolenler = new ArrayList<>();
        int toplam = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                tamBolenler.add(i);
            }
        }
        for (int bolenSayilar : tamBolenler) {
            toplam += bolenSayilar;
        }

        if (toplam == number)
            System.out.println("Number is perfect number");
        else
            System.out.println("Number is not perfect number");

    }
}
