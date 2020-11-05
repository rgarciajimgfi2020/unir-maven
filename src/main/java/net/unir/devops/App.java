package net.unir.devops;

import org.apache.commons.math3.fraction.Fraction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "2+3="+App.sum(2, 3));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(int a, int b, int c, int d) {
        Fraction f1 = new Fraction(a, b);
        Fraction f2 = new Fraction(c, d);
        return f1.add(f2).doubleValue();
    }
}
