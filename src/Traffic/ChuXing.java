package Traffic;
 interface ChuXing {
	
	public static final double checkTime=1.50;
	public static final double waitTime=25.50;
	
   public abstract double[] calculate(); 
}
 
 abstract class traffic implements ChuXing{
	 public double ticketTime;
	 public String trafficMethod;
	 public double distance;
	 public double goTime;
	 public double backTime;
	 public double speed;
	 public double price;
	 
//	 public traffic(String trafficMethod,double goTime,double backTime,
//			 double ticketTime,double speed,double price,double distance)
//		 {
//		 this.backTime=backTime; this.ticketTime=ticketTime; this.speed=speed;
//		 this.trafficMethod=trafficMethod; this.goTime=goTime; 
//		 this.price=price; this.distance=distance;
//		 }
	 
	 public void getValue(){
		 System.out.println("选择坐"+trafficMethod+"出行（从出发地到目的地）所需要花费的总时间"
		 		+ "和总费用分别大约是"+calculate()[0]+"\t\t"+calculate()[1]);
	 } 
 }

class highSpeedRail extends traffic{
	public final  double ticketTime=8.50;
	public final  double price=0.45;
	
	public highSpeedRail(double backTime, String trafficMethod, double goTime,
			double speed, double distance) {
		super();
		this.backTime=backTime; //this.ticketTime=ticketTime; this.speed=speed;
		 this.trafficMethod=trafficMethod; this.goTime=goTime; 
		 this.speed=speed; this.distance=distance;
	}

	public double[] calculate() {
	double []values=new double[2];
	double time;double money;
	
	time=this.goTime+this.backTime+this.ticketTime+checkTime+waitTime+
		distance/this.speed;
	money=distance*price;
	values[0]=time; values[1]=money;
	return values;
	}
	
	public void getValue(){
		 System.out.println("选择坐"+trafficMethod+"出行（从出发地到目的地）所需要花费的总时间"
			 		+ "和总费用分别大约是"+calculate()[0]+"\t\t"+calculate()[1]);
	 } 
}

class Car extends traffic{
	public final double ticketTime=3.50;
	public final double price=0.32;
	
//	public Car()
//	{
//		super(trafficMethod,goTime,backTime,ticketTime,checkTime,waitTime,speed,
//				price);
//	}
//	

	public Car(double backTime, String trafficMethod, double goTime,
			double speed, double distance) {
		super();
		this.backTime=backTime; //this.ticketTime=ticketTime; this.speed=speed;
		 this.trafficMethod=trafficMethod; this.goTime=goTime; 
		 this.speed=speed; this.distance=distance;
	}
	
	public double[] calculate() {
		double []values=new double[2];
		double time;double money;
		time=this.goTime+this.backTime+this.ticketTime+checkTime+waitTime+
			distance/this.speed;
		money=distance*price;
		values[0]=time; values[1]=money;
		return values;
		}
	
	public void getValue(){
		 System.out.println("选择坐"+trafficMethod+"出行（从出发地到目的地）所需要花费的总时间"
			 		+ "和总费用分别大约是"+calculate()[0]+"\t\t"+calculate()[1]);
	 } 
	}
	

class airplane extends traffic{
	public final double ticketTime=6.50;
	public final double price=0.75; 
	
	public airplane(double backTime, String trafficMethod, double goTime,
			double speed, double distance) {
		super();
		this.backTime=backTime; //this.ticketTime=ticketTime; this.speed=speed;
		 this.trafficMethod=trafficMethod; this.goTime=goTime; 
		 this.speed=speed; this.distance=distance;
	}
	
	public double[] calculate() {
		double []values=new double[2];
		double time;double money;
		time=this.goTime+this.backTime+this.ticketTime+checkTime+waitTime+
			distance/this.speed;
		money=distance*price;
		values[0]=time;values[1]=money;
		return values;
		}
	
	public void getValue(){
		 System.out.println("选择坐"+trafficMethod+"出行（从出发地到目的地）所需要花费的总时间"
			 		+ "和总费用分别大约是"+calculate()[0]+"\t\t"+calculate()[1]);
	 } 
	}
	

