import java.util.Scanner;

//** Outputs for users to select the computation they want to carryout
public class GeometricalCalculations {
    public static void main(String[]args){
        System.out.println("***CHOOSE THE SHAPE TO BE CALCULATED BELOW***");
        System.out.println("1. Calculate the area and circumference of Circle");
        System.out.println("2. Calculate the area and perimeter of Rectangle");
        System.out.println("3. Calculate the volume and surfaceArea of a box");
        System.out.println("4. Calculate the volume of a sphere ");
        System.out.println("5. Quit");
        System.out.println();
        System.out.println("Enter your choice(1-5):");

//** If the user chooses a choice outside whats offered
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        while(choice < 0||choice> 5){
            System.out.println("Error: negative numbers are not valid");
            System.out.println();
            System.out.println("1. Calculate the area and circumference of Circle");
            System.out.println("2. Calculate the area and perimeter of Rectangle");
            System.out.println("3. Calculate the volume and surfaceArea of a box");
            System.out.println("4. Calculate the volume of a sphere");
            System.out.println("5. Quit");
            System.out.println();
            System.out.println("Enter your choice(1-5):");


            choice = sc.nextInt();


        }

        //** Output for each choice the user selects
        switch (choice){
            case 1:
                System.out.println("Enter the radius of the circle:");
                int radius = sc.nextInt();
                System.out.println("The area of the circle is:" +getAreaOfCircle(radius));
                System.out.println("The circumference of the circle is:" +getCircumferenceOfCircle(radius));
                break;
            case 2:
                System.out.println("Enter the length of the rectangle:");
                int length = sc.nextInt();
                System.out.println("Enter the width of the rectangle:");
                int width = sc.nextInt();
                System.out.println("The area of the Rectangle is:" +getAreaOfRectangle(length,width));
                System.out.println("The Perimeter of the Rectangle is:" +getPerimeterOfRectangle(length, width));
                break;
            case 3:
                System.out.println("Enter the length of the box:");
                int Length = sc.nextInt();
                System.out.println("Enter the width of the box:");
                int Width = sc.nextInt();
                System.out.println("Enter the height of the box:");
                int height = sc.nextInt();
                System.out.println("The volume of the box is:" +getVolumeOfBox(Length,Width,height));
                System.out.println("The surface area of the box is:" +getSurfaceAreaOfBox(Length, Width,height));
                break;
            case 4:
                System.out.println("Enter the radius of the sphere:");
                int Radius = sc.nextInt();
                System.out.println("The volume of the sphere is:" +getVolumeOfSphere(Radius));
                break;
        }
    }
    
    //** The computation
    public static double getAreaOfCircle(int radius){
        if (radius <0){
            System.out.println("Error: negative numbers are not valid");
        }
        return Math.round(Math.PI * Math.pow(radius,2));
    }
    public static double getAreaOfRectangle(int l, int w){
        if (l <0||w<0){
            System.out.println("Error: negative numbers are not valid");
        }
        return Math.round(l*w);
    }
    public static double getPerimeterOfRectangle(int l, int w){
        if (l <0||w<0){
            System.out.println("Error: negative numbers are not valid");
        }
        return Math.round((l+w)*2);
    }
    public static double getCircumferenceOfCircle(int radius){
        if (radius <0){
            System.out.println("Error: negative numbers are not valid");
        }
        return Math.round(Math.PI * (radius*2));
    }
    public static double getVolumeOfBox(int l, int w, int h){
        if (l <0||w<0||h<0){
            System.out.println("Error: negative numbers are not valid");
        }
        return Math.round(l*w*h);
    }
    public static double getSurfaceAreaOfBox(int l, int w, int h){
        if (l <0||w<0||h<0){
            System.out.println("Error: negative numbers are not valid");
        }
        return Math.round(2*(l*w+l*h+h*w));
    }
    public static double getVolumeOfSphere(int radius){
        if (radius <0){
            System.out.println("Error: negative numbers are not valid");
        }
        return Math.round(Math.PI * Math.pow(radius,3)*1.3333333333);
    }

}