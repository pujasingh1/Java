import java.io.*;
class perfect
{
    public static void main(String args[])throws IOException
    {
        int n,i,s=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number:");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            s=s+i;
        }
        if(s==n)
        System.out.println("Is a perfect no");
        else
         System.out.println("Is not a perfect no");
        }
    }
