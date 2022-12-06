//merging 2 arrays
public class Merging
{
public static void main (String args[])
{
int a[]={7,3};
int b[]={1,4,9};
int x[]=new int[a.length + b.length];
//transfer values from 'a' to 'x'
for(int i=0; i<a.length; i=i+1)
{
x[i]=a[i];
}
for(int i=0; i<b.length; i++)
{
x[a.length + i]= b[i];
}

for(int i=0; i<x.length;i++)
{
System.out.println(x[i]);
}

}
}
