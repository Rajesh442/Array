public class FindPerfectNumberInAnArray
{
public static void main (String args [])
{
int a[]={9,3,28,8,6,10};

for(int i=0;i<a.length;i++)
{
int sum=0;
for(int j=1;j<a[i];j++)
{
if(a[i]%j==0)
sum=sum+j;
}

if(sum==a[i])
System.out.println(a[i]+" is perfect number");
else
System.out.println(a[i]+" is not a perfect number");

}

}
}
