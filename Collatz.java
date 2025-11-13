// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
        if (args.length != 2) {
            System.out.println("Usage: java Collatz <N> <mode>");
            System.out.println("mode = 'v' for verbose, 'c' for concise");
            return;
        }

        int N = Integer.parseInt(args[0]);
        String mode = args[1];

        for (int seed = 1; seed <= N; seed++) {
            int counter = 1;
            int num = seed;

            if (mode.equals("v")) {
                System.out.print(num + " ");
            }
            while (num != 1) {
                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = 3 * num + 1;
                }
                counter++;

                if (mode.equals("v")) {
                    System.out.print(num + " ");
                }
            }

            if (mode.equals("v")) {
                System.out.println("(" + counter + ")");
            }
        }

        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}

	

