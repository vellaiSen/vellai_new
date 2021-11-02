public class Backery {
        // this is a modified file
	static  String Backery_name = "vellai";
	int doornum = 4;
	int price;
	public static void main(String[] arg) {
	Backery cake = new Backery();
		cake.price = 10;
	Backery cooldrinks = new Backery();
		cooldrinks.price = 20;
	Backery vadai = new Backery();
		vadai.price = 30;
	Backery bonda = new Backery();
		System.out.println(Backery_name);
		System.out.println(cake.price);
		System.out.println(cooldrinks.price);
		System.out.println(vadai.price);
	}
}

