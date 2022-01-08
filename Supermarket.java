public class Supermarket {
static String name = "vellai supermarket";
int mrp;
public static void main(String[] args){
	System.out.println(name);
	name = "srithar supermarket";
	System.out.println(name);
Supermarket soap = new Supermarket();
soap.mrp = 10;
Supermarket rice = new Supermarket();
rice.mrp = 20;
Supermarket cake = new Supermarket();
cake.mrp = 30;
}
}
