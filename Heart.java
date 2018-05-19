import java.util.Random;
import java.util.Scanner;
class Heart
{
    protected static String ui="";
    protected static int ct = 0;
    protected static void add(int num)
    {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int n1,n2,s,c,r1,r2;
        String u;
        r1=rd.nextInt();
        r2=rd.nextInt();
        n1=rd.nextInt((int)Math.pow(10,num));
        if(r1<0)
        {
            n1*=-1;
        }
    
        n2=rd.nextInt((int)Math.pow(10,num));
        if(r2<0)
        {
            n2*=-1;
        }
        System.out.println("First number is "+n1);
        System.out.println("Second number is "+n2);
        System.out.print("Enter their sum = ");
        u=sc.next();
        ui=u;
        s=n1+n2;
        try
        {
            if(s==Integer.valueOf(u))
            {
                System.out.println("Correct!!!");
                ct++;
            }
            else 
                System.out.println("Incorrect!!!");
        }catch(NumberFormatException e){}
    }
    protected static void sub(int num)
    {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int n1,n2,s,c,r1,r2;
        String u;
        r1=rd.nextInt();
        r2=rd.nextInt();
        n1=rd.nextInt((int)Math.pow(10,num));
        if(r1<0)
        {
            n1*=-1;
        }
    
        n2=rd.nextInt((int)Math.pow(10,num));
        if(r2<0)
        {
            n2*=-1;
        }
        System.out.println("First number is "+n1);
        System.out.println("Second number is "+n2);
        System.out.print("Enter their difference = ");
        u=sc.next();
        ui=u;
        s=n1-n2;
        try
        {
            if(s==Integer.valueOf(u))
            {
                System.out.println("Correct!!!");
                ct++;
            }
            else 
                System.out.println("Incorrect!!!");
        }catch(NumberFormatException e){}
    }
}