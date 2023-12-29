import java.sql.SQLOutput;

public class ClassesAndObjects {
    public static void main(String args[]){
        Circle C1 = new Circle();
        C1.radius = 10;
        System.out.println("Area of the circle with radius "+ C1.radius+" is "+C1.area());
        Rectangle R1 = new Rectangle();
        R1.length = 10;
        R1.breadth = 5;
        System.out.println("Area of the rectangle is "+R1.area()+" perimeter of the rectangle is "+ R1.perimeter());
        Cylinder cy = new Cylinder();
        cy.radius = 5;
        cy.height = 20;
        System.out.println("Area of the lid as well as the base of the cylinder is "+cy.lidArea()+" Total surface area of the cylinder is "+cy.totalSurfaceArea());
        Student S = new Student();
        S.rollno = 26;
        S.course = "Computer Science";
        S.name = "Anup";
        S.m1 = 35; S.m2 = 40; S.m3 = 40;
        System.out.println("Average of student "+S.name+ " is "+ S.average(S.m1, S.m2, S.m3)+
                " with roll no " + S.rollno + " enrolled in the course of "+S.course+".");
        S.grade(S.m1, S.m2, S.m3);

    }

}
class Circle{
    // these are the properties of the circle
    public double radius;

    // to find the area of the circle
    public double area(){
        return Math.PI*radius*radius;
    }

    // to find the perimeter of the circle
    public double perimeter(){
        return 2*Math.PI*radius;
    }

}

class Rectangle{
  // these are the properties of the rectangle;
    public double length;
    public double breadth;
 // behaviours of the rectangle or the functions which can be performed by the rectangle

 // area of the rectangle
    public double area(){
        return length * breadth;
    }
// perimeter of the rectangle
    public double perimeter(){
        return 2*(length+breadth);
    }

}
class Cylinder{
    public double radius;
    public double height;

    // functions for the cylinder
    public double circumference(){
        return 2*Math.PI*radius;
    }
    public double lidArea(){
        return Math.PI*radius*radius;
    }

    public double totalSurfaceArea(){
        return 2*lidArea()+(circumference()*height);
    }
    public double volume(){
        return lidArea()*height;
    }
}

class Student{
    public int rollno;
    public String name;
    public String course;
    public int m1; public int m2; public int m3;

    public int average(int m1, int m2, int m3){
        return m1+m2+m3/3;
    }
    public int total(int m1, int m2, int m3){
        return m1+m2+m3;
    }
    public void grade(int m1, int m2, int m3){
        if(m1+m2+m3>=75){
            System.out.println("A grade");
        }else if(m1+m2+m3>=55 && m1+m2+m3<75){
            System.out.println("B grade");
        }else{
            System.out.println("below average grade");
        }
    }


}