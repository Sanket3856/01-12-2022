package javapractical;

public class NegativeNumbersArray {
public static void main(String []args) {
	int j=0;
	int[] Neg_arr= {-10,10,-20,20,30,-30,40,-40};
	
	System.out.print("\nList of Negative numbers:");
	while(j<Neg_arr.length)
	{
		if(Neg_arr[j]<0) {
			System.out.format("%d",Neg_arr[j]);
		}
		j++;
	}
}
}
