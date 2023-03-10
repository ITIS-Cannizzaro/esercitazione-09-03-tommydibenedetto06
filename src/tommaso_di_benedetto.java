import java.util.Scanner;

public class tommaso_di_benedetto
{
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("primo esercizio");
		System.out.println("inserisci la grandezza dell'arrey, deve corrispondere ad un valore pari:");
		int n = in.nextInt();
		double[] array1 = new double[n];
		System.out.print("il primo array:");
		System.out.println();
		for (int i = 0; i < array1.length; i++)
		{
			array1 [i] = (Math.random()*20)-10;
			System.out.println("|" + array1[i] + "|");

		}
		System.out.println();
		double[] array2 = new double[array1.length/2];
		System.out.print("array finale:");
		System.out.println();
		int a = 0;
		int b = 1;
		for (int i = 0; i < array2.length; i++)
		{
			array2 [i] = array1[a] * array1[b];
			a += 2;
			b += 2;
			System.out.println("|" + array2[i] + "|");
		}
		es2 ();
	}
	public static void es2 ()
	{
		System.out.println("secondo esercizio");
		String[] array1 = new String[5];
		for (int i = 0; i < 5; i++)
		{
			System.out.println("inserisci una stringa 1:");
			array1 [i] = in.nextLine();
		}
		for (int i = 0; i < 5; i++)
		{
			System.out.println("|" + array1[i] + "|");
		}
//-------------------------------------------------------		
		String[] array2 = new String[5];
		for (int j = 0; j < 5; j++)
		{
			System.out.println("inserisci una stringa 2:");
			array2 [j] = in.nextLine();
		}
		for (int j = 0; j < 5; j++)
		{
			System.out.println("|" + array2[j] + "|");
		}
//-------------------------------------------------------
		for (int i = 0; i < 5; i++)
		{
			array1[i].equals(array2[i]);
			if (array1[i].equals(array2 [i]))
				System.out.println("ok");
			else
			System.out.println("no");
		}
			
	}
}
