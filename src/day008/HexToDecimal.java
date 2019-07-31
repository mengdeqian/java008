package day008;

import java.util.Scanner;

public class HexToDecimal {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整型数字:");
		int decNum = sc.nextInt();
		
		System.out.println(decToHex(decNum));
		System.out.println(hexToDec(decToHex(decNum)));
		
	}
	/**
	 * 十六进制转十进制
	 * @param hex 要转换的十六进制字符串
	 * */
	public static int hexToDec(String hex){
		int decNum = 0;
		
		for(int i = 0; i < hex.length(); i++){
			char tempChar = hex.charAt(i);
			//两种情况，0-9、A-F
			if(tempChar >= '0' && tempChar <= '9'){
				decNum += (tempChar - '0') * Math.pow(16, hex.length() - i - 1);
			}else if(tempChar >= 'A' && tempChar <= 'F'){
				decNum += (tempChar - 'A' + 10) * Math.pow(16, hex.length() - i - 1);
			}
		}
		return decNum;
	}
	
	/**
	 * 调用方法将10进制转换为16进制
	 * */
	public static String decToHex(int decNum){
		String hex = ""; //转换好的字符串
		while(decNum != 0){
			int temp = decNum % 16;
			if(temp >= 0 && temp <=9){
				hex = temp + hex;
			}else if(temp >=10 && temp <= 15){
				//把数字转换为字符在拼接
				hex = (char)(temp + 'A' - 10) + hex;
			}
			decNum /= 16;
		}
		return hex;
	}
	
}
