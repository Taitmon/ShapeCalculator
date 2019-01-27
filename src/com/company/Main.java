package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("===============================================");
        System.out.println("Please choose and enter one of the following.");
        System.out.println("-----------------------------------------------");
        System.out.println("           \"c\" for Circle.");
        System.out.println("           \"s\" for Square.");
        System.out.println("           \"r\" for rectangle.");
        System.out.println("===============================================");
        java.util.Scanner input = new java.util.Scanner(System.in);
        String shape = input.nextLine();

        switch (shape)
        {
            case "c":
                System.out.println("Please select enter area or perimeter.");
                circle();
                break;
            case "s":
                System.out.println("Please select enter area or perimeter.");
                square();
                break;
            case "r":
                System.out.println("Please select enter area or perimeter.");
                rectangle();
                break;

        }
    }

    private static void circle()
    {
        System.out.println("Please enter \"a\" for area or \"p\" for perimeter.");
        java.util.Scanner input = new java.util.Scanner(System.in);
        String calculationChoice = input.nextLine();
        switch (calculationChoice)
        {
            case "a":
                circleArea();
                break;
            case "p":
                circlePerimeter();
                break;
        }
    }
    // area =π(r * r)
    private static double circleArea()
    {
        System.out.println("Please enter the radius.");
        java.util.Scanner input = new java.util.Scanner(System.in);
        double radius = input.nextDouble();

        double area = 3.14 * (radius * radius);

        System.out.println("The area of your circle is: " + area + "!");

        return area;
    }
    // circumference =2πr
    private static double circlePerimeter()
    {
        System.out.println("Please enter the radius.");
        java.util.Scanner input = new java.util.Scanner(System.in);
         double radius = input.nextDouble();

        double area =2 * 3.14 * (radius);

        System.out.println("The area of your circle is: " + area + "!");

        return area;
    }


    private static void square()
    {
        System.out.println("Please enter \"a\" for area or \"p\" for perimeter.");
        java.util.Scanner input = new java.util.Scanner(System.in);
        String calculationChoice = input.nextLine();
        switch (calculationChoice)
        {
            case "a":
                squareArea();
                break;
            case "p":
                squarePerimeter();
                break;
        }
    }

    //area = length * length
    private static double squareArea()
    {
        System.out.println("Please enter the length of one side.");
        java.util.Scanner input = new java.util.Scanner(System.in);
        double length = input.nextDouble();

        double area = length * length;

        System.out.println("The area of your square is: " + area + "!");

        return area;
    }
    //perimeter = 4 * length
    private static double squarePerimeter()
    {
        System.out.println("Please enter the length of one side.");
        java.util.Scanner input = new java.util.Scanner(System.in);
        double length = input.nextDouble();

        double perimeter = 4 * length;

        System.out.println("The perimeter of your square is: " + perimeter + "!");

        return perimeter;
    }

    private static void rectangle()
    {
        System.out.println("Please enter \"a\" for area or \"p\" for perimeter.");
        java.util.Scanner input = new java.util.Scanner(System.in);
        String calculationChoice = input.nextLine();
        switch (calculationChoice)
        {
            case "a":
                rectangleArea();
                break;
            case "p":
                rectanglePerimeter();
                break;
        }
    }
    // area = Length * Width
    private static double rectangleArea()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Please enter the length of one side.");
        double length = input.nextDouble();
        System.out.println("Please enter the width of one side.");
        double width = input.nextDouble();

        double area = length * width;

        System.out.println("The area of your rectangle is: " + area + "!");

        return area;
    }
    // perimeter = 2(length + width)
    private static double rectanglePerimeter()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Please enter the length of one side.");
        double length = input.nextDouble();
        System.out.println("Please enter the width of one side.");
        double width = input.nextDouble();

        double perimeter = 2 * (length + width);

        System.out.println("The perimeter of your square is: " + perimeter + "!");

        return perimeter;
    }





}
