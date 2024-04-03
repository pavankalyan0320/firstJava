
class factorial
{
public static void main(String args[])
{	
	int a;
	if (a<0)
	{
		System.out.println("Wrong input");
		System.exit(0);
	}
	int i; long fact=1;
	for(i=1;i<=a;i++)
	{
		fact=fact*i;
	}
	System.out.println("Factorial of "+a+"  is "+fact);
}
}
