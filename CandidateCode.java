/*
PROBLEM STATEMENT

Virus Outbreak (100 Marks)

In the Martian land faraway, a new virus has evolved and is attacking the individuals at a fast pace. The scientists have figured out the virus composition, V. The big task is to identify the people who are infected. The sample of N people is taken to check if they are POSITIVE or NEGATIVE. A report is generated which provides the current blood composition B of the person. 


POSITIVE or NEGATIVE ?

If the blood composition of the person is a subsequence of the virus composition V, then the person is identified as POSITIVE otherwise NEGATIVE.


Example:

Virus Composition, V = coronavirus

Blood Composition of the person , B = ravus


The person in question is POSITIVE as B is the subsequence of the V. 

 

The scientists are busy with their research for medicine and request you to build a program which can quickly figure out if the person is POSITIVE or NEGATIVE. They will provide you with the virus composition V and all the people’s current blood composition. Can you help them?


Note: The virus and blood compositions are lowercase alphabet strings.

Constraints
1<= N <=10

1<= |B|<= |V|<= 10^5


Input Format
The first line of the input consists of the virus composition, V

The second line of he input consists of the number of people, N

Next N lines each consist of the blood composition of the ith person, Bi


Output Format
For each person, print POSITIVE or NEGATIVE in a separate line

Sample TestCase 1

Input

coronavirus
3
abcde
crnas
onarous

Output

NEGATIVE
POSITIVE
NEGATIVE
*/

// VIRUS OUTBREAK CODE
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
