package Code;

public class Runner
{
    public static void main(String[] args)
    {
        Fraction myFraction = new Fraction(2,3);
        Fraction otherFraction = new Fraction(5);
        Fraction a = new Fraction(myFraction);
        Fraction multiplied = myFraction.multiply(otherFraction);
        Fraction flip = myFraction.inverse(otherFraction);
        System.out.println(myFraction);
        System.out.println(a.equals(myFraction));
        System.out.println(multiplied);
        System.out.println(flip);

    }
}
