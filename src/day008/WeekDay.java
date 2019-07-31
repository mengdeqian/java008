package day008;

import java.util.Scanner;


public class WeekDay {

	public static void main(String[] args){
		System.out.println("��������������ڼ�");
		
		int dayOfWeek = new Scanner(System.in).nextInt();
		ShowWeekDayByChinese(dayOfWeek -1);
		ShowWeekDayByJapanese(dayOfWeek -1);
		ShoeWeekDayByEnglish(dayOfWeek -1);
		
	}
	/**
	 * �ж�����������Ƿ�Ϸ�
	 * */
	private static boolean isRight(int dayOfWeek){
		if(dayOfWeek < 0|| dayOfWeek > 6){
			return false;
		}
		return true;
	}
	/**
	 * �����ĵķ�ʽ��ӡ���ڼ���1-7֮����������֣���ʾ���ڼ�
	 * */
	public static void ShowWeekDayByChinese(int dayOfWeek){
		if(!isRight(dayOfWeek)){
			System.out.println("��������1-7֮�������");
			return;
		}
		String[] weekdays = {"����һ", "���ڶ�","������","������","������","������","������"};
		System.out.println(weekdays[dayOfWeek]);
	}
	
	public static void ShowWeekDayByJapanese(int dayOfWeek){		
		if(!isRight(dayOfWeek)){
			System.out.println("��������1-7֮�������");
			return;
		}
		String[] weekdays = {"������", "������", "ˮ����","ľ����","������", "������", "������"};
		System.out.println(weekdays[dayOfWeek]);
	}
	
	public static void ShoeWeekDayByEnglish(int dayOfWeek){
		if(!isRight(dayOfWeek)){
			System.out.println("��������1-7֮�������");
			return;
		}
		String[] weekdays = {"Monday", "Tuesday", "Wenesday","Thursday","Friday","Saturday", "Sunday"  };
		System.out.println(weekdays[dayOfWeek]);
	}
}
