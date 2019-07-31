package day008;

import java.util.Scanner;

public class HexToDecimal {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����������:");
		int decNum = sc.nextInt();
		
		System.out.println(decToHex(decNum));
		System.out.println(hexToDec(decToHex(decNum)));
		
	}
	/**
	 * ʮ������תʮ����
	 * @param hex Ҫת����ʮ�������ַ���
	 * */
	public static int hexToDec(String hex){
		int decNum = 0;
		
		for(int i = 0; i < hex.length(); i++){
			char tempChar = hex.charAt(i);
			//���������0-9��A-F
			if(tempChar >= '0' && tempChar <= '9'){
				decNum += (tempChar - '0') * Math.pow(16, hex.length() - i - 1);
			}else if(tempChar >= 'A' && tempChar <= 'F'){
				decNum += (tempChar - 'A' + 10) * Math.pow(16, hex.length() - i - 1);
			}
		}
		return decNum;
	}
	
	/**
	 * ���÷�����10����ת��Ϊ16����
	 * */
	public static String decToHex(int decNum){
		String hex = ""; //ת���õ��ַ���
		while(decNum != 0){
			int temp = decNum % 16;
			if(temp >= 0 && temp <=9){
				hex = temp + hex;
			}else if(temp >=10 && temp <= 15){
				//������ת��Ϊ�ַ���ƴ��
				hex = (char)(temp + 'A' - 10) + hex;
			}
			decNum /= 16;
		}
		return hex;
	}
	
}
