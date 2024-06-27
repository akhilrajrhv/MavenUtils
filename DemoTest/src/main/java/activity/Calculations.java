package activity;

public class Calculations {
	
	int a=40,b=15;
	int sum,sub;
	
	public void addition() 
	{
		sum=a+b;
		System.out.println("Addition result is"+sum);
	}
	public void substrcation() {
		sub=a-b;
		System.out.println("Substrcation result is"+sub);
		
	}

	public static void main(String[] args) {
		Calculations obj=new Calculations();
		obj.addition();
		obj.substrcation();
	}

}
