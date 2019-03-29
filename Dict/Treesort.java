
/*
 * 
 * Jean Ramon Johnsen - jejoh16
 *
 * */
import java.util.Scanner;

public class Treesort {
	public static void main(String[] args)
	{
		Dict dictionary = new DictBinTree();
		int i;
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt())
		{
			i = sc.nextInt();
			dictionary.insert(i);
		}

		int[] arr = dictionary.orderedTraversal();

		for(int item : arr)
		{
			System.out.println(" " + item);
		}
	}
}
