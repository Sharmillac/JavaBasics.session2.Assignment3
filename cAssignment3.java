package assignment2;

public class cAssignment3 {
	public static void main(String[] args) {
		String lPrintStr = "";
		for(int i = 1; i < 6; i++)
		{
			lPrintStr = lPrintStr + i;
			System.out.println(lPrintStr);
		}
		
		
		for(int i = 4; i >=1; i--)
		{
			for(int j = 1; j <= i ; j++)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}
