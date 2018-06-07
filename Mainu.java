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
            cs = Byte.valueOf(insis("UserApp.csv"));
        }    
        if(cs!=-1)
            System.out.println("''WelCome To The Quiz Game''");
        Scanner pos = new Scanner(System.in);
        System.out.println("Playing Option         Press Key");
        System.out.println("Demo Game                      1");
        System.out.println("Levels Game                    2");
        System.out.print("Enter the Key :-");
        byte po = pos.nextByte();
        if(po==1)
        {
            if(cs==1)
                clearTML();
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
                System.out.print("''Have a good day!!!''");
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
                {
                    clearTML();
                    System.out.print("''Game End''");
                }
                sc.close();
            }
        }
        else if(po==2)
        {
            String[] lth = {"First","Second","Third","Fourth","Fifth",
                            "Sixth","Seventh","Eighth","Nineth","Tenth"};
            byte[] scr = new byte[10];
            if(cs==1)
                clearTML();
            System.out.println("''There will be 10 levels''\n''Each will have 5 questions''");
            byte lv=1;
            for(String ath : lth)
            {
                System.out.println(ath+" Level--->>>");
                byte q=1;
                do
                {
                    int ch=r.nextInt();
                    if(ch>0)
                        Heart.add(lv);
                    else if(ch<0)
                        Heart.sub(lv);
                    System.out.println();
                    q++;
                }while(q<6);
                System.out.println("Your score of "+ath+" level is: "+Heart.ct+"/"+(q-1));
                System.out.println();
                scr[lv-1]=(byte)Heart.ct;
                Heart.ct=0;
                lv++;
            }
            System.out.println("''Summary''");
            int si=0;
            for(String ath : lth)
            {
                System.out.println(ath+" Level--->>>");
                System.out.println("Your score "+ath+"level is: "+scr[si]+"/10");
                si++;
            }
            System.out.println("''Thanks for playing my game!!!''");
            System.out.print("''Have a good day!!!''");
        }
        pos.close();
    }
    private static void clearTML()
    {
        try
        {
            Thread.sleep(200);
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