package acm.a;

import org.junit.Test;

import java.util.Calendar;

/**
 * @author:liwang
 * @date: 2022/3/22 8:53
 * @Description:TODO
 * @Algorithm Design：TODO
 */
public class 世纪末的星期 {

	int age;

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		//使用限制在1970年
		//获取当前年、月、日、时、分、毫秒、秒
		System.out.println(calendar.get(Calendar.YEAR));//2022 当前年
		System.out.println(calendar.get(Calendar.MONTH));//2 表示3月
		System.out.println(calendar.get(Calendar.DATE));//22 获取当前22号
		System.out.println(calendar.get(Calendar.HOUR));//22
		System.out.println(calendar.get(Calendar.MINUTE));//22  获取当前22号
		System.out.println(calendar.get(Calendar.MILLISECOND));//22  获取当前22号
		System.out.println(calendar.get(Calendar.SECOND));//22  获取当前22号

		for (int year = 1999; year < 10000; year += 100) {
			calendar.set(year,11,31);
			if (calendar.get(Calendar.DAY_OF_WEEK)==1){
				System.out.println("year:"+year);

			}
		}
	}

	@Test
	public void test01(){
		Calendar calendar = Calendar.getInstance();
		for (int year = 1999; year < 10000; year+=100) {
			calendar.set(year,11,31);
			if (calendar.get(Calendar.DAY_OF_WEEK)==1){
				System.out.println(year);
			}
		}
	}
}
