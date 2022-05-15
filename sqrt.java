public class Challenge
{
    public static void main( String[] args )
    {
        double a;

    a = triangleArea(3, 3, 3);
    System.out.println("A triangle with sides 3,3,3 has an area of:" + a);

    a = triangleArea(3, 4, 5);
    System.out.println("A triangle with sides 3,4,5 has an area of:" + a);

    a = triangleArea(9, 9, 9);
    System.out.println("A triangle with sides 9,9,9 has an area of:" + a );

    }

    public static double triangleArea( int a, int b, int c )
    {
    double d=(((a+b+c)/2)*((a+b+c)/2-a)*((a+b+c)/2-b)*((a+b+c)/2-c));
    return Math.sqrt(d);
    }
}
