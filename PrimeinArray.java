public class PrimeinArray
{
public static void main(String args[])
{
//to find prime number in an array
int a[]={4,17,9,8,5,7,14,26,67};
for(int j=0;j<a.length; j++)
{
boolean flag=false;
for(int i=2;i<a[j];i++)
{
if(a[j]%i==0)
{
flag=true;
}
}
//System.out.println(flag);


if(flag)
{
System.out.println(a[j]+" is not a prime number");
}
else
{
System.out.println(a[j]+" is prime number");
}



}

}
}
