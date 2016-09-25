package hw;
import java.util.*;
public class hw02_105021031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner src=new Scanner(System.in);
			int n=src.nextInt();
			Random ran=new Random(n);
			System.out.print(ran.nextInt(n)+1);
	}

}
