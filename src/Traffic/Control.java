package Traffic;

import java.util.Scanner;
public class Control {

	public static void main(String[] args) {
		System.out.println("�����ηֱ���������ء�Ŀ�ĵغ;���");
		Scanner in=new Scanner(System.in);
		String departure=in.nextLine();
		String destination=in.nextLine();
		double distance=in.nextDouble();
		//System.out.println("���������������Ҫ�Ļ�����Ϣ��");
		System.out.println("��"+departure+"��"+destination+"���ֽ�ͨ��ʽ�ֱ𻨷ѵ���ʱ��ͽ�Ǯ�ֱ��ǣ�");
		highSpeedRail gt =new highSpeedRail(25.00, "����", 20.00,350.00,distance);
		Car car=new Car(10.00, "��;����", 15.00,80.00,distance);
		airplane fj=new airplane(35.00, "�ɻ�", 30.00,850.00,distance);
		gt.getValue();
		car.getValue();
		fj.getValue();
		in.close();
		System.exit(0);
	}
}
