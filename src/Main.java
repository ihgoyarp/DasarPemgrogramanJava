public class Main {
    public static void main(String[] args) {
        int tinggi = 5;

        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < 2 * tinggi - 1; j++) {
                if (j >= tinggi - 1 - i && j <= tinggi - 1 + i) {
                    System.out.print("*");
                } else {
                    // Spasi di tempat lain
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
