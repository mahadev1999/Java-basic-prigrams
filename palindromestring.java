class palindrome
{
public static void main(String args[])
{
String str = "madam";
String rev ="";
String orgstr = str;

int len = str.length();

for(int i=len-1;i>=0;i--)
  {
     rev = rev+str.charAt(i);
  }

if(orgstr.equals(rev))
  {
  System.out.println("palindrome string");
}
else
{
 System.out.println("not palindrome string");
}
}}