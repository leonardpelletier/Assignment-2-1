import java.util.Scanner;

class AreaToRadius {

    public static void main (String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        double r = 0;
        double area = 0;
        
        //get user input
        System.out.println("Circle Area Calculator");
        System.out.println("----------------------");
        System.out.println("");
        System.out.print("Enter the circle's radius: ");
        r = sc.nextDouble();
        
        //calculate and display area
        area = Math.PI * r * r;
        System.out.println("The circle with radius " + r + " units has an area of " + area + " units^2.");
    }
}
