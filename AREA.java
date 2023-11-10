abstract class Figure
{

      abstract void area();

}

class Rectangle extends Figure
{

      double ar;
      double l=10.0,b=5.0;

      void area()
      {
       
            ar=l*b;
            System.out.println("area of rectangle:"+ar);
      }
}

class Triangle extends Figure
{

      double ar;
      double b=5.0,h=10.0; 
      void area()
      {
       
            ar=0.5*b*h;
            System.out.println("area of circle:"+ar);
      }
}

class Square extends Figure
{

      double ar;
      double s=4.0;

      void area()
      {
       
            ar=s*s;
            System.out.println("area of square:"+ar);
      }
}

class AREA
{

      public static void main(String[] args)
      {
             
             System.out.println("Name:Tiyash Saha     Enrollment no:A354145023052");
           
             Figure o1=new Rectangle();
             Figure o2=new Triangle();
             Figure o3=new Square();

             o1.area();
             o2.area();
             o3.area();
      }


}