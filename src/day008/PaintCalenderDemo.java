package day008;
/**
 * 使用方法是实现月历的打印
 * 
 * */

import java.util.Scanner;
public class PaintCalenderDemo {
	public static int year = Integer.MIN_VALUE;
	public static int month = Integer.MIN_VALUE;
	private static int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static void main(String[] args){
		PrintCalender();
	}

	public static void PrintCalender() {
		// TODO Auto-generated method stub
		//1.让用户输入年份和月份
		InputYearAndMonth();
		//2.计算1900.1.1到今天的总天数
		int sum = getSumDayOfYears();
		sum += getSumDayOfMonth();
		sum++;
		//2-1 计算各年的总天数
		//2.2 计算各月的总天数
		//3.打印年份和月份
		PrintMonthTitle();
		//4.打印月份的标题
		PrintCalenderContent(sum %7);
		//5.根据某月1日是星期几，打印月历的内容
	}
	private static void PrintCalenderContent(int dayOfWeek){
		int sepCount = 0;
		if(dayOfWeek == 0){
			sepCount = 6;
		}else {
			sepCount = dayOfWeek - 1;
		}
		for(int i = 0; i < sepCount; i++){
			System.out.print("\t");
		}
		for(int i = 0; i < dayOfMonth[month - 1]; i++){
			System.out.print(i+1);
			if((dayOfWeek + i) % 7 == 0 ){
				System.out.print("\n");
			}else {
				System.out.print("\t");
			}
		}
	}
	
	
	private static void PrintMonthTitle(){
		String[] monthNames = {"一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", 
				"十一月", "十二月"
		};
		
		System.out.println("\t\t\t" + year + "\t" + monthNames[month - 1]);
		String[] weekdays = {"月曜日", "火曜日", "水曜日","木曜日","金曜日", "土曜日", "日曜日"};
		for(int i = 0; i < weekdays.length; i++){
			System.out.print(weekdays[i] + "\t");
		}
		System.out.println();
		
	}
	
	private static int getSumDayOfYears(){
		if(year == Integer.MIN_VALUE){
			System.out.println("年份错误，请重新输入年份和月份");
			InputYearAndMonth();
		}
		int sum = 0;
		for(int i = 1900; i < year; i++){
			sum += 365;
			if(isLeapYear(i)){
				sum++;
			}
		}
		
		return sum;
		
	}
	private static int getSumDayOfMonth(){
		int sum = 0;
		
		for(int i = 0; i < month - 1; i++){
			sum += dayOfMonth[i];
			
		}
		if(isLeapYear(year) && month >= 3){
			sum++;
		}
		return sum;
	}
	
	/**
	 * 判断是否是闰年
	 * */
	private static boolean isLeapYear(int year){
		return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
	}
	
	private static void InputYearAndMonth(){
		Scanner input = new Scanner(System.in) ;
		System.out.print("请输入年份:");
		year = input.nextInt();
		System.out.print("请输入月份:");
		month = input.nextInt();
		input.close();
		input = null;
	}
	
}
