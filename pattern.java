package pack1;
import java.util.Scanner;

public class pattern 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements for pattern printing");
		int n=sc.nextInt();
		int ar[][]=new int[n][n];
		int k=1, c1=0, c2=n-1, r1=0, r2=n-1;
		while(k<=n*n)
		{
			for(int i=c1;i<=c2;i++)
			{
				ar[r1][i]=k++;
			}
			for(int j=r1+1;j<=r2;j++)
			{
				ar[j][c2]=k++;
			}
			for(int i=c2-1;i>=c1;i--)
			{
				ar[r2][i]=k++;
			}
			for(int j=r2-1;j>=r1+1;j--)
			{
				ar[j][c1]=k++;
			}
			c1++;
			c2--;
			r1++;
			r2--;
		}
		System.out.println("pattern is");
		for(int x=0;x<n;x++)
		{
			for(int y=0;y<n;y++)
			{
				System.out.print(ar[x][y]+"\t");
			}
			System.out.println();
		}
	}
}

