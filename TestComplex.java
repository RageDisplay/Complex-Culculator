import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class TestComplex
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yourself or want an example? 0 - yourself, just press any number- example");
        int ch = sc.nextInt();
        double re,im;
        if (ch==0)
        {
            System.out.println("Enter the Re: ");
            re = sc.nextDouble();
            System.out.println("Enter the Im: ");
            im = sc.nextDouble();
        }
        else
        {
            re = 5;
            im = 4;
        }
        ComplexNum num = new ComplexNum(re, im);
        ComplexNum num2 = new ComplexNum(0, 0);
        Complex md=new Complex();
        System.out.println("Enter the Method: ");
        System.out.println("1 - ADD;");
        System.out.println("2 - REDUCE;");
        System.out.println("3 - MOD;");
        System.out.println("4 - ARGUMENT;");
        int selectedNum = sc.nextInt();

        if (selectedNum == 1 || selectedNum == 2) 
        {
            if(ch==0)
            {
                System.out.println("Enter the RE and IM of the second Complex: ");
                num2 = new ComplexNum(sc.nextDouble(), sc.nextDouble());
            }
            else
            {
                num2 = new ComplexNum(6,3);
            }
        }
        switch (selectedNum) 
        {
            case 1: 
            {
                num.printResult(num.Add(num2));
                break;
            }
            case 2: 
            {
                num.printResult(num.Reduce(num2));
                break;
            }
            case 3:
            {
                md.mod(num);
                break;
            }

            case 4: 
            {
                md.argument(num);
                break;
            }

            default: 
            {
                System.out.println("ERROR");
            }
        }
    }        
}