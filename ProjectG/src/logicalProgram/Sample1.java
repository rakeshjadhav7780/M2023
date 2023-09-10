package logicalProgram;

public class Sample1 {
	public static void main(String[] args) {
		int no=11;
		 int count=0;
		 System.out.println("hi");
		 System.out.println("all");
		for(int i=2;i<no-1;i++)
		{		if(no%i==0)
			{
				count=count+1;
			}
		}
		if(count>0)
		{
			System.out.println("no is not prime");
		}
		else
		{
			System.out.println("no is prime");
		}
		System.out.println("hi");
		System.out.println("all");
		System.out.println("how are u");
		
	}

}
