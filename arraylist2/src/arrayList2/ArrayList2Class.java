package arrayList2;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
public class ArrayList2Class 
{
	private ArrayList <Integer> ListOfIntegers = new <Integer> ArrayList();
	Random randInt = new Random();
	
	public ArrayList2Class()
	{
		
		for(int i =0; i<1000; i++)
		{	
			int y = randInt.nextInt(90)+10;
			ListOfIntegers.add(y);
		}	
	}
	
	
	public ArrayList<Integer> generateList()
	{
		
		for(int i =0; i<1000; i++)
		{	
			int y = randInt.nextInt(90)+10;
			ListOfIntegers.set(i, y);
		}	
		return ListOfIntegers;
	}
	
	public String searchArray(int z)
	{
		String str1 = "";
		for(int i=0;i< ListOfIntegers.size()-1; i++)
		{
			if(ListOfIntegers.get(i) ==z)
			{
				str1 += i+" ";
			}
		}
		if(str1.equals(""))
		{
			return "No numbers in this array equals " + z;
		}
		else
		{
			return str1;
		}
	}
	
	public ArrayList<Integer> sortArray()
	{
		for (int i = 0; i < ListOfIntegers.size() - 1; i++)
	    {
	        for (int j = i + 1; j < ListOfIntegers.size(); j++)
	        {
	            if (ListOfIntegers.get(i) > ListOfIntegers.get(j)) {

	                int temp = ListOfIntegers.get(j);
	                ListOfIntegers.set(j, ListOfIntegers.get(i));
	                ListOfIntegers.set(i, temp);
	            }
	        }
	    }
	    return ListOfIntegers;
	}
	
	public ArrayList<Integer> sortArrayReverse()
	{
		 for(int i = 0; i < ListOfIntegers.size()-1; i++) 
		 {
		        ListOfIntegers.add(i, ListOfIntegers.remove(ListOfIntegers.size()-1));
		   }
		    return ListOfIntegers;
	}
	
	public String largestNumber()
	{
		int MaxNumb = ListOfIntegers.get(0); 
		for(int i = 0; i<ListOfIntegers.size()-1;i++)
		{
			if(ListOfIntegers.get(i)>MaxNumb)
			{
				MaxNumb = ListOfIntegers.get(i);
			}
		}
		
		int count = 0;
		for(int i = 0; i<ListOfIntegers.size()-1;i++)
		{
			if(ListOfIntegers.get(i)==MaxNumb)
			{
				count ++;
			}
		}
		return "Largest Number: "+ MaxNumb   + " Number of times on the list: " + count;
		
	}
	
	public String SmallestNumber()
	{
		int smallestNumb = ListOfIntegers.get(0); 
		for(int i = 0; i<ListOfIntegers.size()-1;i++)
		{
			if(ListOfIntegers.get(i)<smallestNumb)
			{
				smallestNumb = ListOfIntegers.get(i);
			}
		}
		
		int count = 0;
		for(int i = 0; i<ListOfIntegers.size()-1;i++)
		{
			if(ListOfIntegers.get(i)==smallestNumb)
			{
				count ++;
			}
		}
		return "Smallest Number: "+ smallestNumb   + " Number of times on the list: " + count;
		
	}
	
	public ArrayList<Integer> copyList()
	{
		ArrayList <Integer> copyOfList = (ArrayList<Integer>) ListOfIntegers.clone();
		return copyOfList;
	}
	
	public int sumOfList()
	{
		int sum = 0;
		for(int i = 0; i<ListOfIntegers.size()-1;i++)
		{
			sum += ListOfIntegers.get(i);
		}
		return sum;
	}
	
	public String Table(ArrayList<Integer> z)
	{
		String str1="";
		for (int line = 1; line <=20; line++){
			for(int column =1; column<=50; column++){
				str1+=String.format("%3d",z.get((line-1)*50+column-1));
			} // for column
		str1 += "\n";
		} //for line
		return str1;
	}
	public String toString()
	{
		String str1="";
		for (int line = 1; line <=20; line++){
			for(int column =1; column<=50; column++){
				str1+=String.format("%3d",ListOfIntegers.get((line-1)*50+column-1));
			} // for column
		str1 += "\n";
		} //for line
		return str1;
	}
}
