package day008;
/**
 * ʹ�÷�����ʵ�������Ĵ�ӡ
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
		//1.���û�������ݺ��·�
		InputYearAndMonth();
		//2.����1900.1.1�������������
		int sum = getSumDayOfYears();
		sum += getSumDayOfMonth();
		sum++;
		//2-1 ��������������
		//2.2 ������µ�������
		//3.��ӡ��ݺ��·�
		PrintMonthTitle();
		//4.��ӡ�·ݵı���
		PrintCalenderContent(sum %7);
		//5.����ĳ��1�������ڼ�����ӡ����������
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
		String[] monthNames = {"һ��", "����", "����", "����", "����", "����", "����", "����", "����", "ʮ��", 
				"ʮһ��", "ʮ����"
		};
		
		System.out.println("\t\t\t" + year + "\t" + monthNames[month - 1]);
		String[] weekdays = {"������", "������", "ˮ����","ľ����","������", "������", "������"};
		for(int i = 0; i < weekdays.length; i++){
			System.out.print(weekdays[i] + "\t");
		}
		System.out.println();
		
	}
	
	private static int getSumDayOfYears(){
		if(year == Integer.MIN_VALUE){
			System.out.println("��ݴ���������������ݺ��·�");
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
	 * �ж��Ƿ�������
	 * */
	private static boolean isLeapYear(int year){
		return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
	}
	
	private static void InputYearAndMonth(){
		Scanner input = new Scanner(System.in) ;
		System.out.print("���������:");
		year = input.nextInt();
		System.out.print("�������·�:");
		month = input.nextInt();
		input.close();
		input = null;
	}
	
}
