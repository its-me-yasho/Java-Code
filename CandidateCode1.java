import java.util.Scanner;

public class CandidateCode1
{
	public int primeR(int l,int r)
	{   
		for (int i = r; i >= l; i--)
		{
			int m = 0, flag = 0;
			int n = i;
			m = n/2;      
			
			if(n == 0 || n == 1)
			{  
   				continue;
			}
			else
			{  
				for(int j = 2; j <= m; j++)
				{      
					if(n%j == 0)
					{      
						flag = 1;      
						break;      
					}      
				}      
				
				if(flag == 0)  
				{ 
					return n;
				}  
			}
		}
		return -1;
	}
	public int primeL(int l, int r)
	{          
		for (int i = l; i <= r; i++)
		{
			int m = 0, flag = 0;
			int n = i;
			m = n/2;      
			
			if(n == 0 || n == 1)
			{  
   				continue;
			}
			else
			{  
				for(int j = 2; j <= m; j++)
				{      
					if(n%j == 0)
					{      
						flag = 1;      
						break;      
					}      
				}      
				
				if(flag == 0)  
				{ 
					return n;
				}  
			}
		}
		return -1;
	}
	
	public void primeGame(int l, int r)
	{
		CandidateCode obj1 = new CandidateCode();
		int pL = obj1.primeL(l, r);
		int pR = obj1.primeR(l, r);
		
		if(pL == -1 && pR == -1)
		{
			System.out.println("-1");
		}
		else
		{
			System.out.println(pR-pL);
		}
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String [] input = new String[n];
		sc.nextLine();
		
		for (int i = 0; i < n; i++)   
		{  
			input[i] = sc.nextLine();			
		}
		
		CandidateCode obj = new CandidateCode();
		
		for (String str : input)
		{
			String [] num = str.split(" ");
			int l = Integer.parseInt(num[0]);
			int r = Integer.parseInt(num[1]);
			obj.primeGame(l, r);
		}
		
	}
}