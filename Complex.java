public class Complex 
{
     void mod(ComplexNum num1)
    {
        System.out.println(num1.module());
    }
    void argument(ComplexNum num1)
    {
        System.out.println(num1.argument());
    }
}
class ComplexNum 
{
    private double a;
    private double b;
    private ComplexNum result;
 
    ComplexNum(double a1, double b1) 
    {
        a = a1;
        b = b1;
    }
    ComplexNum Add(ComplexNum additive) 
    {
        a = a + additive.a;
        b = b + additive.b;
        return this;
    }
    ComplexNum Reduce(ComplexNum reduction)
    {
        a=a-reduction.a;
        b=b-reduction.b;
        return this;
    }
    double module()
    {
        return Math.sqrt(a*a+b*b);
    }
    double argument()
    {
        return Math.atan(b/a);
    }
    public double getA() 
    {
        return a;
    }
 
    public double getB() 
    {
        return b;
    }
    public ComplexNum getResult() 
    {
        return result;
    }

    void printResult(ComplexNum arg) 
    {
        System.out.println(arg.getA()+"+"+arg.getB()+"i");
    }
}