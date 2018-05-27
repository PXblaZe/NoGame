import java.util.Random;

class Heart { 
  
  protected static String ui = "";
  protected static int ct = 0;
  
  protected static void add(int num) {
    Random rd = new Random();
    java.util.Scanner sc = new java.util.Scanner(System.in);
    

    int r1 = rd.nextInt();
    int r2 = rd.nextInt();
    int n1;
    int n2;
    do { n1 = rd.nextInt((int)Math.pow(10, num));
      if (r1 < 0)
      {
        n1 *= -1;
      }
      
      n2 = rd.nextInt((int)Math.pow(10, num));
      if (r2 < 0)
      {
        n2 *= -1;
      }
    } while (!(n1 >= (int)Math.pow(10, num - 1)) && !(n2 >= (int)Math.pow(10, num - 1)));
    System.out.println("First number is " + n1);
    System.out.println("Second number is " + n2);
    System.out.print("Enter their sum = ");
    String u = sc.next();
    ui = u;
    int s = n1 + n2;
    try
    {
      if (s == Integer.valueOf(u).intValue())
      {
        System.out.println("Correct!!!");
        ct += 1;
      }
      else {
        System.out.println("Incorrect!!!");
      }
    } catch (NumberFormatException localNumberFormatException) {}
  }
  
  protected static void sub(int num) { Random rd = new Random();
    java.util.Scanner sc = new java.util.Scanner(System.in);
    

    int r1 = rd.nextInt();
    int r2 = rd.nextInt();
	int n1,n2;
    do { n1 = rd.nextInt((int)Math.pow(10.0D, num));
      if (r1 < 0)
      {
        n1 *= -1;
      }
      
      n2 = rd.nextInt((int)Math.pow(10.0D, num));
      if (r2 < 0)
      {
        n2 *= -1;
      }
    } while (!(n1 >= (int)Math.pow(10.0D, num - 1)) && !(n2 >= (int)Math.pow(10.0D, num - 1)));
    System.out.println("First number is " + n1);
    System.out.println("Second number is " + n2);
    System.out.print("Enter their difference = ");
    String u = sc.next();
    ui = u;
    int s = n1 - n2;
    try
    {
      if (s == Integer.valueOf(u).intValue())
      {
        System.out.println("Correct!!!");
        ct += 1;
      }
      else {
        System.out.println("Incorrect!!!");
      }
    }
    catch (NumberFormatException localNumberFormatException) {}
  }
}
