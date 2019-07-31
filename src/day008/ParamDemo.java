package day008;

public class ParamDemo {

	public static void main(String[] args){
		paramTest("参数测试",1,2);
		
	}
	
	public static void paramTest(String str, int... nums){
		System.out.println("第一个参数" + str);
		for(int i = 0; i < nums.length; i++){
			System.out.println(nums[i]);
			System.out.printf("%.4f", 5.0);
		}
		
	}
	
}

