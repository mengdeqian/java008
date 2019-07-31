package day008;
/**
 * 游戏喊话
 * */
public class SeedMessageDemo {

	public static void main(String[] args){
		SendMessage("王二", "世界频道", "集合准备团战", 10, 1);
		SendMessage("zhangsan");
	}
	/**
	 * 重载的方法，只有姓名
	 * */
	public static void SendMessage(String nicName){
		String[] contents = {
				"你吃了吗",
				"hello world"
		};
		SendMessage(nicName, "默认频道", contents[(int)Math.random() * 2],10,1);
	}
	public static void SendMessage(String name, String channelname, String message, int count, int interval){
		if(interval > 5) interval = 5;
		String value = String.format("【%s】%s：%s",
					channelname, name,message
					);
		for(int i = 0; i < count; i++){
			System.out.println(value);
			try{
				Thread.sleep(interval * 1000);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
