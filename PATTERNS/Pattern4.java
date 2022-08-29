package ineuron;

public class Pattern4
{
	public static void main(String[] args) 
	{
	for(int i=1; i<=6; i++){
		for(int j=1; j<=7; j++){
			if(i==3 || i%3==0)
			{
				System.out.print("* ");
			}
			else if(j==1)
			{
				System.out.print("* ");
			}
		}
		System.out.println("\n");
	}
		
	}
}