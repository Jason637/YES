package Code;

public class Runner
{
    public static void main(String[] args)
    {
        Fraction myFraction = new Fraction(2,8);
        Fraction otherFraction = new Fraction(5);
        Fraction a = new Fraction(myFraction);
        Fraction multiplied = myFraction.multiply(otherFraction);
        Fraction flip = myFraction.inverse(otherFraction);
        System.out.println(Fraction.lcm(7,5));
        System.out.println(myFraction);
        System.out.println(a.equals(myFraction));
        System.out.println(multiplied);
        System.out.println(flip);
      /*  Fraction f1 = null;
        try {
             f1 = new Fraction(3, 0);
        }
        catch (Exception e) {
            System.out.println("Fractions need a non-zero denominator");
        }*/
    }
}
