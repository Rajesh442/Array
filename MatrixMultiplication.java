public class MatrixMultiplication
{
public static void main(String args[])
{
//matrix multiplication in an array
int a[][]={{1,2,3},{4,5,6},{7,8,9}};
int b[][]={{9,8,7},{6,5,4},{3,2,1}};
int c[][]=new int[a.length][a[0].length];
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
for(int x=0;x<a.length;x++)
{
c[i][j] =c[i][j]+ a[i][x]*b[x][j];
}
System.out.print(c[i][j]+" ");
}
System.out.println();
}

}
}
