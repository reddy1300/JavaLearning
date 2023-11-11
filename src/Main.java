public class Main {

    public static void main(String[] args) {
        int value = 1;
        switch (value){
            case 1 -> System.out.println("Value was 1");

            case 2 -> System.out.println("Value was 2");

            case 3, 4, 5 -> System.out.println("Value was 3, 4, or 5");

            default -> System.out.println("there is no matching value");
        }
    }

}
