package test1;

import java.util.Scanner;

public class dummmy {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("elements");
		Scanner scan = new Scanner(System.in);
		
		int length = scan.nextInt();
		int[] arr= new int[length];
		
		for(int i=0;i<=length-1;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		int n = arr.length;
		
		String maxDiff = maxIndexDiff(arr,n);
		System.out.println(maxDiff);
		scan.close();

	}
	
	private static String maxIndexDiff(int arr[],int n)
	{
		int maxDiffs = -1;
        int i, j;
 
        for (i = 0; i < n; ++i) {
            for (j = n - 1; j > i; --j) {
                if (arr[j] > arr[i] && maxDiffs < (j - i))
                    maxDiffs = j - i;
                	
            }
        }
 
        return "NO";
		
	}

}
