package day008;

import java.util.Scanner;


public class WeekDay {

	public static void main(String[] args){
		System.out.println("请输入今天是星期几");
		
		int dayOfWeek = new Scanner(System.in).nextInt();
		ShowWeekDayByChinese(dayOfWeek -1);
		ShowWeekDayByJapanese(dayOfWeek -1);
		ShoeWeekDayByEnglish(dayOfWeek -1);
		
	}
	/**
	 * 判断输入的数据是否合法
	 * */
	private static boolean isRight(int dayOfWeek){
		if(dayOfWeek < 0|| dayOfWeek > 6){
			return false;
		}
		return true;
	}
	/**
	 * 以中文的方式打印星期几，1-7之间的整形数字，表示星期几
	 * */
	public static void ShowWeekDayByChinese(int dayOfWeek){
		if(!isRight(dayOfWeek)){
			System.out.println("必须输入1-7之间的数字");
			return;
		}
		String[] weekdays = {"星期一", "星期二","星期三","星期四","星期五","星期六","星期日"};
		System.out.println(weekdays[dayOfWeek]);
	}
	
	public static void ShowWeekDayByJapanese(int dayOfWeek){		
		if(!isRight(dayOfWeek)){
			System.out.println("必须输入1-7之间的数字");
			return;
		}
		String[] weekdays = {"月曜日", "火曜日", "水曜日","木曜日","金曜日", "土曜日", "日曜日"};
		System.out.println(weekdays[dayOfWeek]);
	}
	
	public static void ShoeWeekDayByEnglish(int dayOfWeek){
		if(!isRight(dayOfWeek)){
			System.out.println("必须输入1-7之间的数字");
			return;
		}
		String[] weekdays = {"Monday", "Tuesday", "Wenesday","Thursday","Friday","Saturday", "Sunday"  };
		System.out.println(weekdays[dayOfWeek]);
	}
}
