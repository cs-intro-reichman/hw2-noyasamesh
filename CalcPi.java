// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	   int n= Integer.parseInt(args[0]);
	   double sum= 1.0;
	   boolean isplus = false;
	   double j=3;
	   for (int i=1; i<n; i++ ){
		if(isplus)
		{
			sum= sum + (1/j);
		}
		else {
			sum= sum- (1/j);
		}
		isplus= !isplus;
		j=j+2;
	   }
	   sum= 4*sum;
	   System.out.println("pi according to Java: "+ Math.PI);
	   System.out.println("pi, approximated: " + sum);

	}
}
