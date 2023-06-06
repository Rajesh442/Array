public class SecondLargestElementinanArray
{
public static void main(String args[])
{

int a[]={19,122,-4,152,170,19,3,170};
int largest=0;
int sec_largest=0;

for(int i=0;i<a.length;i++)
{
    if(a[i]>largest)
    {
    sec_largest=largest;
    largest=a[i];
    }
if(a[i]<largest && a[i]>sec_largest)
    {
    sec_largest=a[i];
    }
}
System.out.println(sec_largest);

}
}
