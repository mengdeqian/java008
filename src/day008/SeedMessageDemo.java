package day008;
/**
 * ��Ϸ����
 * */
public class SeedMessageDemo {

	public static void main(String[] args){
		SendMessage("����", "����Ƶ��", "����׼����ս", 10, 1);
		SendMessage("zhangsan");
	}
	/**
	 * ���صķ�����ֻ������
	 * */
	public static void SendMessage(String nicName){
		String[] contents = {
				"�������",
				"hello world"
		};
		SendMessage(nicName, "Ĭ��Ƶ��", contents[(int)Math.random() * 2],10,1);
	}
	public static void SendMessage(String name, String channelname, String message, int count, int interval){
		if(interval > 5) interval = 5;
		String value = String.format("��%s��%s��%s",
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
