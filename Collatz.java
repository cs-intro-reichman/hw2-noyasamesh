// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

        int N = Integer.parseInt(args[0]);
        String mode = args[1];
        if (!mode.equals("v") && !mode.equals("c")) {
            System.out.println("Mode must be either 'v' or 'c'.");
        }

        for (int seed = 1; seed <= N; seed++) {
            int num = seed;
            int counter = 1; 

            if (mode.equals("v")) {
                System.out.print(num);
            }

            do {
                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = 3 * num + 1;
                }
                counter++;

                if (mode.equals("v")) {
                    System.out.print(" " + num);
                }

            } while (num != 1);

            if (mode.equals("v")) {
                System.out.println(" (" + counter + ")");
            }
        }

        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}




