class Palindrome
{
public static void main(String args[])
{
String str = "M A D A M";
String rev ="";
String orgstr = str;

int len =str.length();

for(int i = len-1;i>=0;i--)
     {
         rev = rev+str.charAt(i);
     }

if(orgstr.equals(rev))
{
 System.out.println("palindrome");
}
else
{
System.out.println("not");
}}}