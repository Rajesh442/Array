public class DuplicateArray{
public static void main(String[]args){
int a[]={7,5,4,5,3,6,5};
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
{
a[j]=0;
}
}
}
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}
