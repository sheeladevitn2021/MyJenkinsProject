

public class ReversingStringArray 
{
   public static void reversingStringArray(String[] arr, int n)
   {
	   for(int i=n-1; i>=0; i--)
	   {
		   System.out.println(arr[i]);
	   }
   }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String str="hello how are you";
		String arr[] = {"sheela", "uma", "devi"};
	String	words[] =str.split(" ");
	for (int i=0; i<words.length;i++)
	{
		System.out.println(words[i]);
	}
	
	
		
     reversingStringArray(arr,arr.length);
	}

}
