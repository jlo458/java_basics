// Basic java program calculating roots of quadratic equations (only real roots for now)

import java.util.Scanner;

public class Main {
    public static double[] quadFormula(int a, int b, int c) {
        double[] roots = new double[2];
        
        double posRoot = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        double negRoot = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);

        roots[0] = posRoot; 
        roots[1] = negRoot;
        return roots;
    }



    public static void main(String[] args) {
        System.out.println("Enter x^2 term: ");
        Scanner sc = new Scanner(System.in); 
        int varA = sc.nextInt(); 
        
        System.out.println("Enter x term: ");
        //Scanner sc = new Scanner(System.in); 
        int varB = sc.nextInt(); 

        System.out.println("Enter constant term: ");
        //Scanner sc = new Scanner(System.in); 
        int varC = sc.nextInt(); 

        //System.out.println(varA + " " + varB + " " + varC);

        double[] roots = quadFormula(varA, varB, varC);

        System.out.println("Roots are:");
        for (Double i : roots) {
            System.out.println(i);
        }



        sc.close();
    }
}
