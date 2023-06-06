//split an array even numbers in one array and odd numbers in another array
public class SplitAnArrayEvenNumbersinOneArrayOddNumbersinAnotherArray
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
//transfer even element in evenArr[] and oddelement in oddArr[]
int o=0;
int e=0;
int evenArr[]= new int[evencounter];
int oddArr[]= new int[oddcounter];

for(int i=0; i<a.length;i++)
{
if(a[i]%2==0)
evenArr[e++]=a[i];
else
oddArr[o++]=a[i];
}

System.out.println("Even element array");

for(int i=0;i<evenArr.length;i++)
{
System.out.println(evenArr[i]);
}

System.out.println("odd element array");

for(int i=0;i<oddArr.length;i++)
{
System.out.println(oddArr[i]);
}

}
}

