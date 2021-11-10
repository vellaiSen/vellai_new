public class Customer
{
int amount = 500;
public static void main(String[] args)
{
Customer customer1 = new Customer();
int balance = customer1.purchase(200);
	customer1.pay(balance);
	System.out.println(customer1.amount);
	Customer customer2 =  new Customer();
	System.out.println(customer2.amount);
	
}
	public void pay(int balance)
	{
		System.out.println("my balance is " + balance);
	}
public int purchase(int ip)
{
amount = amount -ip;
	System.out.println(amount);
	return amount;
}
}