public class SmallestElementinanArrayWithoutSwaping
{
public static void main(String args[])
{

int a[]={19,122,152,170,19,3,170};
int smallest=a[0];
for(int i=0;i<a.length;i++)
{
if(a[i]<smallest)
smallest=a[i];
}
System.out.println(smallest);

}
}
