package acm.a;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author:liwang
 * @date: 2022/3/23 0:49
 * @Description:TODO
 * @Algorithm Design：TODO
 */
public class 梅森素数 {

	public static void main(String[] args) {

		BigInteger x = BigInteger.valueOf(2).pow(11213).subtract(BigInteger.ONE);//改为这个也可以BigInteger.valueOf(1)

//		x.add();
//		x.subtract()
//				x.multiply()  x.divide()  x.mod()  x.pow()

		String string = x.toString();
		System.out.println(string);
		System.out.println(string.substring(string.length() - 100, string.length()));


//		nextLine()读取后 会换行
		Scanner sc = new Scanner(System.in);//输入23
		int a = sc.nextInt();
		String str = sc.nextLine();
		System.out.println(a);//23
//		System.out.println(str);//""

	}

	@Test
	public void test01() {//测试单元中不能运行 Scanner类，需要在main方法中运行才行
/*		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str = in.nextLine();
		System.out.println(n);
		System.out.println(str);*/
	}

}
