public class Triangle
{
int height,base;
public static void main(String[] args)
{
Triangle tr = new Triangle();
int result = tr.calculateTriangleArea(15,10);
System.out.println("the triangle area is " + result);
}

public int calculateTriangleArea(int height,int base)
{
int result = height*base/2;
return result;
}
}
