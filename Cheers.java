
public class Cheers {
    public static void main(String[] args) {
        String name = args[0].toUpperCase();
        int num = Integer.parseInt(args[1]);
        String an = "AEFHILMNORSX";

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (an.indexOf(c) != -1) {
                System.out.println("Give me an " + c + ": " + c + "!");
            } else {
                System.out.println("Give me a  " + c + ": " + c + "!"); // שני רווחים אחרי a
            }
        }

        System.out.println("What does that spell?");
        for (int i = 1; i <= num; i++) {
            System.out.println(name + "!!!");
        }
    }
}

    


        

