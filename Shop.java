public class Shop
{
int price,discount;//non-static
String brand;
	//constructor used for initiate the object specific value
	//will have same as class name
	//will not have any return datatype
	//whenever we creat object it will cal   constructor
	public Shop(String b, int p, int d)
	{
		//global var = local var
		this.price = price;
		this.discount = discount;
		this.brand = brand;
		
	}
public static void main(String[] args)
{
	Shop prod1 = new Shop("abcd",100,10);
	System.out.println(prod1.price);
	System.out.println(prod1.discount);
	//prod1.brand = "abcd";
	//prod1.price = 100;
	//prod1.discount = 10;
	Shop prod2 = new Shop("pqrs",50,8);
	//prod2.brand "pqrs"
		//prod2.price = 50;
	//prod2.discount = 8;
	
}
}