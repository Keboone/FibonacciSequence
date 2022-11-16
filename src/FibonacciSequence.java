
public class FibonacciSequence 
{
	public static void main(String[] args) 
	{
		fibonacci();
	}
	public static void fibonacci() 
	{
		int x = 0;
		int y = 1;
		
		System.out.println("Fibbonaci sequence of length 30: ");
		System.out.print(x + ", " + y + ", ");
		
		for(int i=0; i<28; i++)
		{
			int z = x + y;
			System.out.print(z + ", ");
			x = y;
			y = z;
		}
	}
}
