package Practicequestions;

import java.util.*;

public class BMi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input weight in pounds: ");
        double weight = sc.nextDouble();

        System.out.print("Input height in inches: ");
        double height = sc.nextDouble();

        double BMI = weight / (height * height);

        System.out.println("Your BMI is: " + BMI);

        if (BMI < 18.5) {
            System.out.print("Underweight");
        } else if (BMI < 25) {
            System.out.print("Normal");

        } else if (BMI < 30) {
            System.out.print("Overweight");

        } else {
            System.out.print("Obese");

        }
    }

}
