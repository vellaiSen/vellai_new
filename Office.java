package tamilnadu.chennai;

 public class Office//default package level access
{
int ta = 100;//default package level access
public static void main(String[] args)
{
	Office employee1 = new Office();
	System.out.println("check");
	employee1.giveSnacks();
	employee1.work();
}
			void giveSnacks()//default package level access
{	
		System.out.println("snacks");
}
	
	public void work()
	{
		 System.out.println("work");	
	}	
}
