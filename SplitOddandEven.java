//split an array even numbers in one array and odd numbers in another array
public class SplitOddandEven
{
public  static void main(String args[])
{
int a[]={7,9,4,6,5,2};
int oddcounter=0;
int evencounter=0;
//to count odd and even element
for(int i=0; i<a.length;i++)
{
if(a[i]%2==0)
evencounter=evencounter+1;
else
oddcounter=oddcounter+1;
}
//transfer even element in x[] and oddelement in y[]
int p=0;
int v=0;
int x[]= new int[evencounter];
int y[]= new int[oddcounter];
for(int i=0; i<a.length;i++)
{
if(a[i]%2==0)
x[v++]=a[i];
else
y[p++]=a[i];
}
System.out.println("Even element array");
for(int i=0;i<x.length;i++)
{
System.out.println(x[i]);
}
System.out.println("odd element array");
for(int i=0;i<y.length;i++)
{
System.out.println(y[i]);
}

}
}

