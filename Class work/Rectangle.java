/*
 *Implement a Java program to print the area of a rectangle by creating a class named
'Area' that has two methods. The first method, named 'setDim', takes the length and breadth
of the rectangle as parameters. The second method, named 'getArea', returns the area of the
rectangle. The length and breadth of the rectangle are entered through the keyboard.
 * */

 import java.util.Scanner;

 public class Rectangle{
     public static class Area{
         double length;
         double breadth;
 
         Area(){
             length = 0;
             breadth = 0;
         }
 
        
         void setDim(){
              System.out.println("---Fill the given Details----");
 
              System.out.print("Length: ");
              length = scanner.nextDouble();
 
              System.out.print("Breadth: ");
              breadth = scanner.nextDouble();
 
         }
         
         double getArea(){
             return(length * breadth);
         }
 
         void display(){
             System.out.println("--------Info---------");
 
             System.out.println("Length: " + length);
             System.out.println("Breadth: " + breadth);
         }
 
         }
     
     static Scanner scanner = new Scanner(System.in);
     public static void main(String[] args){
             Area area = new Area();
             area.setDim();
             area.display();
             System.out.println("Area of The Rectangle is : " + area.getArea());
             scanner.close();
     }
 
 }
  