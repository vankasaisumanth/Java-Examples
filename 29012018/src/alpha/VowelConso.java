package alpha;

import java.util.Scanner;

public class VowelConso {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
        char ch = reader.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}
