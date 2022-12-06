//sum of 2 element in an array corresponding to 10
public class Sumof2Element
{
public static void main(String args[])
{
int A[]={2,7,6,9,11,3,5,8,4};
for(int i=0;i<A.length;i++)
{
for(int j=i+1;j<A.length;j++)
{
if(A[i]+A[j]==10)
{
System.out.println(A[i]+"  "+ A[j]);
}
}
}


}
}
