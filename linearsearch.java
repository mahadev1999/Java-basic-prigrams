class linear
{
public static void main(String args[])
{
int a[] = {1,2,3,4,5};
int search_element = 10;

boolean flag = false;
for(int i=0;i<a.length;i++)
 {
     if(search_element==a[i])
      {
        System.out.println("the searching element is:"+i);
          flag=true;
           break;
   }}

if(flag==false)
{
 System.out.println("not found");
}
}}