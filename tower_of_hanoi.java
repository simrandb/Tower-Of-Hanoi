import java.util.Scanner;

public class TowerOfHanoi
    {
    
    static int cnt=0;
    static Scanner scan= new Scanner(System.in);
    static void toh(int n,char f,char t,char a)
        {
            if (n==1)
            {
                System.out.println("Step no "+(++cnt)+": Move disc 1 from "+f+" to "+t+".");
                return ;
            }
            else
            {
                toh(n-1,f,a,t);
                System.out.println("Step no "+(++cnt)+": Move disc "+n+" from "+f+" to "+t+".");
                toh(n-1,a,t,f);
            }
        }


        public static void main(String []args)
        {
            int n=0;
            System.out.println("Enter no. of rings:");
            n=scan.nextInt();
            char f='A',t='C',a='B';
            toh(n,f,t,a);
        }
    }
