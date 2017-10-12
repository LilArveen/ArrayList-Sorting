package arrayList2;
import java.util.Scanner;

public class ArrayList2 
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int userInput, z;
		
		ArrayList2Class ALVIN = new ArrayList2Class();
		String x = "";
		do
		{

			System.out.println(ALVIN);
			System.out.println("Enter in what you want to perform: 1 for new list, "
					+ "2 for searching a particular number, 3 for sorting an array, 4 for sorting it in"
					+ " reverse order, 5 for largest array, 6 for smallest array value, 7 for new arraylist copy"
					+ " and 8 for adding up all the numbers");
			userInput = input.nextInt();
			
			switch(userInput)
			{
			case 1:
				System.out.println(ALVIN.Table(ALVIN.generateList()));
				break;
			case 2:
				System.out.println("Enter in number: ");
				z = input.nextInt();
				System.out.println(ALVIN.searchArray(z));
				break;
			case 3:
				System.out.println(ALVIN.Table(ALVIN.sortArray()));
				break;
			case 4:
				System.out.println(ALVIN.Table(ALVIN.sortArrayReverse()));
				break;
			case 5:
				System.out.println(ALVIN.largestNumber());
				break;
			case 6:
				System.out.println(ALVIN.SmallestNumber());
				break;
			case 7:
				System.out.println(ALVIN.Table(ALVIN.copyList()));
				System.out.println("");
				System.out.println(ALVIN.Table(ALVIN.copyList()));
				break;
			case 8:
				System.out.println(ALVIN.sumOfList());
				break;
			}
			System.out.println("Continue? Enter in y/n");
			x= input.next();
		}
		while (x.equals("y")|| x.equals("Y"));
	}
}
