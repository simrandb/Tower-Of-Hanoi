import java.util.*;

class tohh
{
    int cnt=0;
    void toh(int n,char f,char t,char a)
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
}
public class HelloWorld{


private static      final   Scanner s=new Scanner (System.in);

     public static void main(String []args){
         System.out.println("Enter no. of rings:");
        

         char f='f',t='t',a='a';
         tohh h =new tohh();
         
         h.toh(5,f,t,a);
     }
}