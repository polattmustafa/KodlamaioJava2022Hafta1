public class Main {

    public static void main(String[] args) {

        char harf = 'I';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("harf kalın sesli");
                break;
            default:
                System.out.println("harf ince sesli");
        }


    }
}
