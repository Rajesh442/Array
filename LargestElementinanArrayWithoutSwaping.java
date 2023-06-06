public class LargestElementinanArrayWithoutSwaping
{
public static void main(String args[])
{

int a[]={19,122,152,170,19,3,170};
int max=0;
for(int i=0;i<a.length;i++)
{
if(a[i]>max)
max=a[i];
}
System.out.println(max);

}
}
