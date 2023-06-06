public class SecondSmallestElementinanArray
{
public static void main(String args[])
{

int a[]={19,122,-4,152,170,19,3,170};
int smallest=a[0];
int sec_smallest=0;
for(int i=0;i<a.length;i++)
{
    if(a[i]<smallest)
    {
    sec_smallest=smallest;
    smallest=a[i];
    }
if(a[i]>smallest && a[i]<sec_smallest)
    {
    sec_smallest=a[i];
    }
}
System.out.println(sec_smallest);

}
}
