//split an array into 2 different arrays
public class SplitAnArrayintoTwoDifferentArray
{
public static void main(String args[])
{
int a[]={7,3,1,4,9};
if(a.length%2!=0)
{
    int x[]=new int[a.length/2];
    int y[]=new int[(a.length/2) +1];
for(int i=0; i<x.length;i=i+1)
    {
    x[i]=a[i];
    System.out.println("x[i] "+ x[i]);
    }
for(int i=0; i<y.length;i++)
    {
    y[i]=a[i+x.length];
    System.out.println("y[i] "+ y[i]);
    }
}
else
{
    int x[]=new int[a.length/2];
    int y[]=new int[(a.length/2)];
    for(int i=0; i<x.length;i=i+1)
    {
    x[i]=a[i];
    System.out.println("x[i] "+ x[i]);
    }
for(int i=0; i<y.length;i++)
    {
    y[i]=a[i+x.length];
    System.out.println("y[i] "+ y[i]);
    }
}

}//main method closing
}//main class closing
