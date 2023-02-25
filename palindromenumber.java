class Palindrome
{
public static void main(String args[])
{
int num = 16461;
int rev = 0;
int orgnum = num;

while(num!=0)
{
 rev = rev*10 + num%10;
  num = num/10;
}

if(orgnum ==rev)
  {
  System.out.println("palindrome number");
 }
else
 {
System.out.println("not");
}
}}