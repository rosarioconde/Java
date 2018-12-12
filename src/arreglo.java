import java.io.*;
public class arreglo{
	
	public static void main (String[] args) {
		
		int A[]={2,4,6,8,10,12,14,16,18,20};
		int i;
		
		for (i=0; i<10; i++)
		{
			System.out.print("pos"+i+"="+A[i]);
			System.out.print("\n");
			
	}
	
	System.out.print("\n");
		
			for (i=9; i>=0; i--)
			{
		
		System.out.print("pos"+i+"="+A[i]);
			System.out.print("\n");
		}
	
	}
}