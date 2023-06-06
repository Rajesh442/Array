public class EvenPresentinOddIndex
{
public static void main(String args[])
{
int a[]={7,12,2,9,11,4,5};
for(int i=0; i<a.length;i++)
{
if(i%2!=0)
{
if(a[i]%2==0)
{
System.out.println(a[i]);
}
}

}

}
}
