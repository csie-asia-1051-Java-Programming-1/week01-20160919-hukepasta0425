package hw;
import java.util.*;
import java.lang.Math;
public class hw03_105021031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner src=new Scanner(System.in);
			int b[]=new int[6];
			for(int i=0;i<6;i++)
			{
				b[i]=src.nextInt();
			}
			int min=b[0];
			for(int x=0;x<6;x++) 
			{ 
			if(b[x]<min) min=b[x]; 
			} 			
			System.out.printf("最小值 %d\n",min); 
			
	}

}
