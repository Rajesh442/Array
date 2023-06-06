public class TwiceLeftShiftAllElementsinanArray
{
public static void main(String args[])
{
int a[]={7,3,9,2,8,11};
int x=a[0];
int y=a[1];

for(int i=0;i<a.length-2;i++)
{
a[i]=a[i+2];
}
a[a.length-1]=y;
a[a.length-2]=x;

for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}

}
}
