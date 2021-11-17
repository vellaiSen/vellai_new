public class Rectangle
{
	int length,width;

public static void main(String[] args)
{
	Rectangle rec = new Rectangle();
	int result = rec.calculateRectangleArea(10,20);
	System.out.println("the rectangle area is" + result);
}
public int calculateRectangleArea(int length,int width)
{
int result = length*width;
return result;
}
}

