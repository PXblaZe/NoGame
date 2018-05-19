import java.util.Random;
import java.util.Scanner;
class Mainu
{
    protected static void outnBgd()
    {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        System.out.println("''WelCome To The Quiz Game''");
        System.out.print("Enter the length of digit :");
        int ln = s.nextInt(),ch,t=0;
        do
        {
            ch=r.nextInt();
            if(ch>0)
                Heart.add(ln);
            else if(ch<0)
                Heart.sub(ln);
            if(!(Heart.ui.equalsIgnoreCase("exit")))
                t++;
            System.out.println();
        }while(!(Heart.ui.equalsIgnoreCase("exit")));
        System.out.println("Your score is: "+Heart.ct+"/"+t);
        System.out.println("''Thanks for playing my game!!!''");
        System.out.println("''Have a good day!!!''");
    }
}