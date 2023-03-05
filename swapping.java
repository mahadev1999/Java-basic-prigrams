class swap
{
public static void main(String args[])
{
int a=20;
int b=30;

System.out.println("before swapping:"+a+" "+b);
   b=a+b-(a=b);
System.out.println("after swapping:"+a+" "+b);
}}