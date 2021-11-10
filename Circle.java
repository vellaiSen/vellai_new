public class Circle
{
	double radius,Area;
	public static void main(String[] args)
	{
		Circle cr = new Circle();
		double Area = cr.circleArea(3.14,10);
		System.out.println("total circle is " + Area);
	}
	
	public double circleArea(double pi,double radius)
	{
			double Area = pi*radius*radius;

		return Area;
	}

}
