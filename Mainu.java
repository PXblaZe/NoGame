import java.awt.Robot;
import java.util.Random;
import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.BufferedReader;
class Mainu
{
    protected static void outnBgd()
    {
        byte cs = Byte.valueOf(insis("UserApp.csv"));
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        if(cs==-1)
        {
            String nst = null;
            System.out.println("''WelCome To The Quiz Game''");
            do
            {
                Scanner ns = new Scanner(System.in);
                System.out.print("Are you using this program in Bluej? (Y/n):~");
                nst = ns.next();
                if(nst.equalsIgnoreCase("Y"))
                {
                    outsis("1","UserApp.csv");
                    clearTML();
                }
                else if(nst.equalsIgnoreCase("n"))
                    outsis("0","UserApp.csv");
                ns.close();
            }while(!(nst.equalsIgnoreCase("Y")||nst.equalsIgnoreCase("n")));
        }
        if(cs==-1)
            cs = Byte.valueOf(insis("UserApp.csv"));
        if(cs!=-1)
            System.out.println("''WelCome To The Quiz Game''");
        System.out.print("Enter the length of digit (1-10) :");
        int ln = s.nextInt(),ch,t=0;
        System.out.println();
        if(ln<11&&ln>0)
        {
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
        else
        {
            s.close();
            Scanner sc = new Scanner(System.in);
            System.out.print("''Invalid Input!!!''\nTry again (Y/n):~");
            String op = sc.next();
            if(op.equalsIgnoreCase("Y"))
            {
                if(cs==1)
                    clearTML();
                outnBgd();
            }
            if(op.equalsIgnoreCase("n"))
                System.out.println("''Game End''");
            sc.close();
        }
    }
    private static void clearTML()
    {
        try
        {
            Robot r = new Robot();
            r.keyPress(17);
            r.keyPress((int)'K');
            r.keyRelease(17);
            r.keyRelease((int)'K');
        }catch(Exception e){}
    }
    private static void outsis(String text, String fileName)
    {
        try {
            PrintWriter out = new PrintWriter(fileName);
            out.print(text);
            out.close();
        } catch (java.io.FileNotFoundException e) { 
            System.out.println("Error: " + e);
        }
    }
    private static String insis(String fileName) 
    {
        String pr=null;
        try
        {
            BufferedReader in = new java.io.BufferedReader(new FileReader(fileName));
            String str = null;
            if((str = in.readLine()) != null)
                pr=str;
        } catch (java.io.IOException e) { System.out.println("Error: " + e); }
        return pr;
    }
}