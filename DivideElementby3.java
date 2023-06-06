public class DivideElementby3
{
public static void main(String args[])
{
int a[]={12,15,21,31,6,19};
for(int i=0; i<a.length;i++)
{
if(a[i]%3==0)
{
a[i]=a[i]/3;
//System.out.println(a[i]);
}
System.out.println(a[i]);
}

}
}
