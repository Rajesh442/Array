public class TwiceRightShiftAllElementsinanArray
{
public static void main(String args[])
{
int a[]={7,3,9,2,8,11};
int x=a[a.length-1];
int y=a[a.length-2];

for(int i=a.length-1;i>1;i--)
{
a[i]=a[i-2];
}
a[0]=y;
a[1]=x;

for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}

}
}
