class Factorial
{
public static void main(String[] args)
{
int num = 12;
int fact = 1;
if (num<=1)
System.out.println("Error!!");
for(int i =1; i<=num; i++)
{
fact*=i;
}
System.out.println("Factorial of " + num +" is " +  fact);
}
}
