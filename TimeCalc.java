public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0)+ args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3)+ args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalMinutes = (hours * 60) + minutes + minutesToAdd ; 
        int totalhours = totalMinutes / 60 ;
        int newhours = totalhours % 24 ;
        int newMinutes = totalMinutes - (totalhours * 60);
        if (newhours < 10){ 
            String newhours1 = "0" + String.valueOf(newhours); 
            System.out.print(newhours1);
        }
        else System.out.print(newhours);
            if (newMinutes < 10) {
                String newMinutes1 = "0" + String.valueOf(newMinutes);
                System.out.print(":" + newMinutes1);
            }
            else System.out.print(":" + newMinutes);
        
    }
}
