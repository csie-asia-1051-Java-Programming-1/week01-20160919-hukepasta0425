package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入體重單位 "公斤"，轉換成 "磅" (1磅 = 0.45359 公斤)
 * Date: 2016/09/19
 * Author: 1050210XX 周永振老師
 */
import java.util.*;
public class ex02_105021031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		double kg=src.nextInt();
		double sum=kg/0.45359;
		System.out.print(sum);
	}

}
