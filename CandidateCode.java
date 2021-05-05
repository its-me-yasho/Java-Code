import java.util.Scanner;

public class CandidateCode
{
	public void subsequence(String str, String virusComp)
	{
		int k = 0,count = 0;
		
		for(int i = 0; i < str.length(); i++)
		{
			for(int j = k; j < virusComp.length(); j++)
			{
				if(str.charAt(i) == virusComp.charAt(j))
				{
					count++;
					k = j++;
					break;
				}
			}
		}
		
		if (count == str.length())
		{
			System.out.println("POSITIVE");
		}
		else
		{
			System.out.println("NEGATIVE");
		}
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String virusComp = sc.nextLine();
		
		int n = sc.nextInt();
		if(n < 1 || n > 10)
		{
			System.out.println("ENTER NUMBER BETEWEEN 1 TO 10");
			System.exit(0);
		}
		
		String [] bloodComp = new String [n];
		
		sc.nextLine();
		
		for (int i = 0; i < n; i++)   
		{  
			bloodComp[i] = sc.nextLine();  
		} 
		
		CandidateCode obj = new CandidateCode(); 
		
		for (String str : bloodComp)
		{
			obj.subsequence(str, virusComp);
		}
	}
}