class fib
{
    public static void main(String args[]) {
        
        int i;

        int a=0,b=1;

        int n = Integer.parseInt(args[0]);

        System.out.println("Fibbonacci series are : "+ a +" "+b);
        int c=0;
        for(i = 1; i<=n; i++)
        {
            System.out.println(c);
            a = b;
            b = c;
            c = a+b;
        }
    }
}
 