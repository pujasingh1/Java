import java.io.*;
class prime
{
    int n;
    void accept()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter any no.=");
        n=Integer.parseInt(br.readLine());
    }
    void prime()
    {
        int i,f=0;
        for(i=2;i<=n/2;i++)
        {
            if(n%2==0)
            {
                f=1;
                break;
            }
        }
        if(f==0)
        System.out.println("the no. is prime=");
        else
        System.out.println("the no.is not prime=");
    }
    public void main(String args[])throws IOException
    {
        p1 m=new p1();
        m.accept();
        m.prime();
    }
}
        
