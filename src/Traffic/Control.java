package Traffic;

import java.util.Scanner;
public class Control {

	public static void main(String[] args) {
		System.out.println("请依次分别输入出发地、目的地和距离");
		Scanner in=new Scanner(System.in);
		String departure=in.nextLine();
		String destination=in.nextLine();
		double distance=in.nextDouble();
		//System.out.println("请输入乘坐高铁需要的基本信息：");
		System.out.println("从"+departure+"到"+destination+"三种交通方式分别花费的总时间和金钱分别是：");
		highSpeedRail gt =new highSpeedRail(25.00, "高铁", 20.00,350.00,distance);
		Car car=new Car(10.00, "长途汽车", 15.00,80.00,distance);
		airplane fj=new airplane(35.00, "飞机", 30.00,850.00,distance);
		gt.getValue();
		car.getValue();
		fj.getValue();
		in.close();
		System.exit(0);
	}
}
