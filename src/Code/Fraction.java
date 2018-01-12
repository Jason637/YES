package Code;
public class Fraction
{
    private int num,denom;
    public Fraction (int num, int denom) {
        this.num = num;
        this.denom = denom;
        if (denom==0)
        {
            throw new IllegalArgumentException("Fractions can't have a 0 denominator");
        }
        else
        {
            this.num=num;
            this.denom=denom;
            simplify();
        }
    }
    public Fraction (int num)
   {
       this.num=num;
       denom = 1;
   }
    public Fraction(Fraction other)
    {
        num= other.num;
        denom= other.denom;
    }
    @Override
    public String toString()
    {
        return num + "/"+ denom;
    }

    public Fraction multiply(Fraction f)
    {
        return new Fraction(num*f.num,denom*f.denom);
    }
    public Fraction inverse(Fraction f)
    {
        if (num==0)
        {
            return null;
        }
        else
        {
            return new Fraction(denom,num);
        }
    }
    public Fraction divide(Fraction f)
    {
        return new Fraction(num*f.denom,denom*f.num);
    }
    public static int gcf(int a,int b)
    {
     int min = Math.min(a,b);
     for (int i = min ; i >0;i--)
     {
         if (a%i== 0 &&b%i==0)return i;
     }
     return 1;
    }

    private void simplify() {

    }
    }