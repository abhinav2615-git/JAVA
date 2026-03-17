abstract class Shape{
    abstract void area();
    public Shape(){
        System.out.println("Shape Created");
    }
}
class Circle extends Shape{
    int rad;
    public Circle(int r)
    {
        rad =r;
    }
    @Override
    public void area(){
        System.out.println("Area of circle:"+(3.14f*rad*rad));
    }
}
class Triangle extends Shape{
    int height,base;
    public Triangle(int h,int b)
    {
        height =h;
        base = b;
    }
    @Override
    public void area(){
        System.out.println("Area of Triangle:"+(.5f*height*base));
    }
}

class Rectangle extends Shape{
    int height,width;
    public Rectangle(int h,int b)
    {
        height =h;
        width = b;
    }
    @Override
    public void area(){
        System.out.println("Area of Rectangle:"+(height*width));
    }
}


public class AbstractTester {
    public static void main(String[] args) {
        Shape []shapes = {
            new Circle(4), 
            new Rectangle(23, 3),
            new Triangle(4, 8),
            new Circle(14), 
            new Rectangle(2, 33),
            new Triangle(24, 80)
        };
        for(Shape s:shapes)
            s.area();
    }
}