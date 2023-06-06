public class LeftShiftAllElementsinanArray
{
public static void main(String args[])
{
int a[]={7,3,9,2,8,11};
int x=a[0];

for(int i=0;i<a.length-1;i++)
{
a[i]=a[i+1];
}
a[a.length-1]=x;

for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}

}
}
