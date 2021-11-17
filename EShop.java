public class EShop
{
	int price;
private String profit = "30% profit";
private EShop()
{
	System.out.println("offer Rs.500-dec31");
}
public EShop(int price)
{
	this();//explicit call
	this.price = price;
	System.out.println("bill is "+ price);
}

public static void main(String[] args)
{
	EShop tv = new EShop(10000);
	EShop fridge = new EShop(15000);
	EShop enguiry = new EShop();
	tv.purchase(1000);
	fridge.purchase();
	tv.profit();
	
}//method overloading - compile time polymorphism
	//same method name with diff args or type of arg of current class
public void purchase(int discount)
{
	System.out.println(discount);
}
	public void purchase()
	{
	System.out.println("no discounts");
	}
	private void profit()
	{
		System.out.println(profit);
	}
}
