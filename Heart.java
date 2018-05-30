import java.util.Random;
import java.util.Scanner;
class Heart { 
      
      protected static String ui = "";
      protected static int ct = 0;
      
    protected static void add(int num) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int r1 = rd.nextInt();
        int r2 = rd.nextInt();
        int n1=0,c1=0;
        int n2=0,c2=0;
        do { 
            if(c1==0)
                n1 = rd.nextInt((int)Math.pow(10, num));
            if(n1 > (int)Math.pow(10, num - 1))
            {
                if (r1 < 0)
                {
                    n1 *= -1;
                }
                c1=1;
            }
            if(c2==0)
                n2 = rd.nextInt((int)Math.pow(10, num));
            if(n2 > (int)Math.pow(10, num - 1))
            {
                if (r2 < 0)
                {
                    n2 *= -1;
                }
                c2=1;
            }
        } while (!(c1==1&&c2==1));
        if(n1<0&&n2>=0)
        {
            System.out.println("First number is " + n1);
            System.out.println("Second number is " + n2);
        }
        else if((n1<0&&n2<0)||(n1>-1&&n2>=0))
        {
            System.out.println("First number is  " + n1);
            System.out.println("Second number is " + n2);
        }
        else if(n2<0&&n1>=0)
        {
            System.out.println("First number is   " + n1);
            System.out.println("Second number is " + n2);
        }
        System.out.print("Enter their sum = ");
        String u = sc.next();
        ui = u;
        int s = n1 + n2;
        try
        {
            if (s == Integer.valueOf(u))
            {
                System.out.println("Correct!!!");
                ct += 1;
            }
            else
            {
                System.out.println("Incorrect!!!");
            }
        } catch (NumberFormatException localNumberFormatException) {}
        sc.close();
    }
      
    protected static void sub(int num) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int r1 = rd.nextInt();
        int r2 = rd.nextInt();
        int n1=0,c1=0;
        int n2=0,c2=0;
        do { 
            if(c1==0)
                n1 = rd.nextInt((int)Math.pow(10, num));
            if(n1 > (int)Math.pow(10, num - 1))
            {
                if (r1 < 0)
                {
                    n1 *= -1;
                }
                c1=1;
            }
            if(c2==0)
                n2 = rd.nextInt((int)Math.pow(10, num));
            if(n2 > (int)Math.pow(10, num - 1))
            {
                if (r2 < 0)
                {
                    n2 *= -1;
                }
                c2=1;
            }
        } while (!(c1==1&&c2==1));
        if(n1<0&&n2>=0)
        {
            System.out.println("First number is " + n1);
            System.out.println("Second number is " + n2);
        }
        else if((n1<0&&n2<0)||(n1>-1&&n2>=0))
        {
            System.out.println("First number is  " + n1);
            System.out.println("Second number is " + n2);
        }
        else if(n2<0&&n1>=0)
        {
            System.out.println("First number is   " + n1);
            System.out.println("Second number is " + n2);
        }
        System.out.print("Enter their difference = ");
        String u = sc.next();
        ui = u;
        int s = n1 - n2;
        try
        {
            if (s == Integer.valueOf(u))
            {
                System.out.println("Correct!!!");
                ct += 1;
            }
            else
            {
                System.out.println("Incorrect!!!");
            }
        } catch (NumberFormatException localNumberFormatException) {}
        sc.close();
    }
}
