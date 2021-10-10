package precource;

public class countdigit {
	public static void main(String [] args)
	{
		int num=4867443,count=0;
		do
		{
			num=num/10;
			count=count+1;			
		}while(num!=0);
		System.out.println("Total number of digits "+count);
	}
	
}
