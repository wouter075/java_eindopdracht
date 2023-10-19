public class Main {
    public static void main(String[] args) {
        System.out.println("Figuur 1");
        for (int i = 1; i <= 5; i++) {
            System.out.println("*");
        }
        System.out.println("\n");

        System.out.println("Figuur 2");
        for (int i = 1; i <=5; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");

        System.out.println("Figuur 3");
        for (int i = 5; i >= 1; i--) {
            for (int x = 1; x <= i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");

        System.out.println("Figuur 4");
        for (int i = 1; i <= 5; i++) {
            for (int x = 1; x <= 5; x++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("\n");


        System.out.println("Figuur 5");
        for (int i = 1; i <=5; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("\n");

        System.out.println("Figuur 6");
        for (int i = 1; i <=5; i++) {
            for (int x = i; x <= 5; x++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("\n");

        System.out.println("Figuur 7");
        for (int i = 1; i <=5; i++) {
            // spaces
            for (int x = 5; x > i; x--) {
                System.out.print(" ");
            }

            // counting
            for (int x = 1; x <= i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");

        System.out.println("Figuur 8");
        for (int i = 1; i <=8; i++) {
            // spaces
            for (int x = 8; x > i; x--) {
                System.out.print(" ");
            }

            // counting
            for (int x = 1; x <= i; x++) {
                System.out.print(x);
            }
            System.out.println();
        }
        System.out.println("\n");

        System.out.println("Figuur 9");
        for (int i = 1; i <=8; i++) {
            // spaces
            for (int x = 8; x > i; x--) {
                System.out.print(" ");
            }
            // stars
            for (int x = 1; x <= (i * 2) - 1; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");

        System.out.println("Figuur 10");
        for (int i = 1; i <= 8; i++) {
            // spaces
            for (int x = 8; x > i; x--) {
                System.out.print(" ");
            }

            // -->
            for (int x = 1; x < i; x++) {
                System.out.print(x);
            }

            // <--
            for (int x = i; x >= 1; x--) {
                System.out.print(x);
            }
            System.out.println();
        }
        System.out.println("\n");

        System.out.println("Figuur 11");
        for (int i = 1; i <= 8; i++) {
            // spaces
            for (int x = 8; x > i; x--) {
                System.out.print(" ");
            }

            // calculate max:
            int max = (i * 2) - 1;
            // -->
            for (int x = i; x < max ; x++) {
                System.out.print(x % 10);
            }
            // <--
            for (int x = max; x >= i; x--) {
                System.out.print(x % 10);
            }
            System.out.println();

        }
        System.out.println("\n");
    }
}