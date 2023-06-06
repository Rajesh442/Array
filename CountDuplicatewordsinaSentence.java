public class CountDuplicatewordsinaSentence
{
public static void main (String args [])
{
String s ="hey hi hello hey hello hi hello";
String a[]=s.split(" ");

for(int i=0; i<a.length;i++)
{
int count=0;
for(int j=i+1;j<a.length;j++)
{
if(a[i].equals(a[j]))
{
a[j]=" ";
count++;
}
}
if(!(a[i].equals(" ")))
System.out.println(a[i]+" has "+count+" duplicates.");
}

}
}
