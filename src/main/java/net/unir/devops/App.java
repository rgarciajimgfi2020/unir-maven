package net.unir.devops;

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
}
