package alpha;

public class SwapTwoNum {
	public static void main(String[] args) {
		float first = 10.23f;
		float second = 2.3f;
		System.out.println("----Before Swap----");
		System.out.println("First = "+first);
		System.out.println("Second = "+second);
		float tempo = first;
		first = second;
		second = tempo;
		System.out.println("----After Swap----");
		System.out.println("First = "+first);
		System.out.println("Second = "+second);
	
	}
}
