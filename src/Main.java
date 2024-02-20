import java.util.Scanner;
public class Main {
    public static void main(String[] args) {        //  declare the variables
        int a,b,c;
        double u,field;

        // get input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first side");
        a = input.nextInt();
        System.out.println("Enter the second side");
        b = input.nextInt();
        System.out.println("Enter the third side");
        c= input.nextInt();


        // Calculate the semi-perimeter
        u = (a+b+c)/ 2;
        field = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Area of the triangle: " + field);



    }
}