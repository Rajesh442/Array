
public class DescendingSort
{
public static void main(String args[])
{

int a[]={7,21,65,32,12,4,6,9,8};
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]<a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}

for(int k=0;k<a.length;k++)
{
System.out.print(a[i]+" ");
}

}
}
