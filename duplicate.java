class duplicate
{
public static void main(String args[])
{
int a[] ={1,2,3,4,5,6,7,8,1,8};

boolean flag=false;
for(int i=0;i<a.length;i++)
  {
     for(int j=i+1;j<a.length;j++)
      {
         if(a[i]==a[j])
         {
          System.out.println("the duplicate element is:"+a[i]);
            flag=true;
}}}

if(flag==false)
 {
     System.out.println("not found");
 }
}}