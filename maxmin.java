class maxmin
{
public static void main(String args[])
{
int a[] = {100,200,50,68,20};
int max=a[0];

for(int i=1;i<a.length;i++)
{
 if(max<a[i])
     {
        max=a[i];
   }}
System.out.println("the maximum element of array is:"+max);

int min=a[0];

for(int i=1;i<a.length;i++)
{
 if(min>a[i])
     {
        min=a[i];
   }}
System.out.println("the minimum element of array is:"+min);
}}