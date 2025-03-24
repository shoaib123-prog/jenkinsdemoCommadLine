class CommandLineDemo1
{
public static void main(String args[])
{
int n1=Integer.parseInt(args[0]);
int n2=Integer.parseInt(args[1]);

int r1,r2,r3,r4;
r1=n1+n2;
r2=n1-n2;
r3=n1*n2;
r4=n1/n2;
System.out.println("Addition:"+r1);
System.out.println("subraction:"+r2);
System.out.println("Multipication:"+r3);
System.out.println("division:"+r4);
}
}
