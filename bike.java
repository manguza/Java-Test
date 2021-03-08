import java.io.*;
import java.util.*;


public class bike {
	 
	public static void main (String args[]) throws IOException{
		 
		Scanner s = new Scanner(System.in);
	 	BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
	 	String[] a; //Array ชุดแรกไว้ใช้รัยค่า 7 ตัว
	 	a = new String[7]; //ขอพื้นที่ของ Array
		//เริ่มรับค่า
	 		System.out.println("Welcome The  Bike ");
	 		System.out.println("");
	 		System.out.print("How many add bike : ");
	 		int addBike = s.nextInt();
	 	for(int i=1; i<=addBike; i++) {
			System.out.print("\nBike number : ");
				a[0] = in.readLine(); //เช่าจักรยานคันที่เท่าไหร่
	 		System.out.print("Name :");
	 			a[1]= in.readLine();//ชื่อผู้เช่า
	 		System.out.print("Date Mont Year : ");
	 			a[2]= in.readLine();//วันเดือนปี
	 		System.out.println("Enter time in");
	 		System.out.print("Hours in is : ");
	 			a[3] = in.readLine(); //เก็บ ชม ที่เข้า
	 		System.out.print("Minitues in is : ");
	 			a[4] = in.readLine(); //เก็บนาทีต่อเลย
	 		System.out.println("");
	 		System.out.println("Enter time out");
	 		System.out.print("Hours out is : ");
	 			a[5] = in.readLine();//เก็บ ชม. ที่ออก
	 		System.out.print("Mimitues out is : ");
	 			a[6] = in.readLine();//เก็บนาทีต่อเลย
	 //จบช่วงของการรับค่า
	 			//Save ลง txt
	 		writeBike(a);
	 	}
	 
	 	int tih ; // tih = time in hours เก็บเวลาตอนเช่า แบบช.ม.จาก a[3]
	 	int tim ; // tim = time in minutue เก็บเวลาตอนเช่า จาก a[4]
	 	int toh ; // toh = time out hours เก็บเวลาคืนแบบช.ม.จากa[5]
	 	int tom ; // tom = time out minitue เก็บเวลาคืนเบบ นาทีจากa[6]
	 	int hou ; // hours คำนวณช.ม.
	 	int tth = 0; // total time hoursคิดเวลาเช่า
	 	int ttm = 0; // total time minitues คิดเวลาเช่า
	 	int mon = 0; // money คิดเงิน
	 	int tm = 0; // time to money ปัดเศษเวลา
		// แปลงตัวแปล
	 	tih = Integer.parseInt(a[3]); 
	 	tim = Integer.parseInt(a[4]);
	 	toh = Integer.parseInt(a[5]);
	 	tom = Integer.parseInt(a[6]);
	 
		InOutTime(tih, tim, tm, toh, tom, tth, ttm, mon);

	 	System.out.println("\nCar number is : "+a[0] );
	 	System.out.println("");
	 	System.out.println("Time In is : "+tih+"."+tim);
	 	System.out.println("");
	 	System.out.println("Time Out is : "+toh+"."+tom);
	 	System.out.println("");
	 	System.out.println("Total time is : "+tth+"."+ttm);
	 	System.out.println("");
	 	System.out.println("Money is : "+mon);
	 	System.out.println("");
	}

	static void writeBike(String[]a)throws IOException{
		FileWriter fw = new FileWriter("../java/bike01.txt",true);
		BufferedWriter r = new BufferedWriter(fw);

		r.write("Bike number :"+a[0]+"\n");
	 	r.write("Name :"+a[1]+"\n");
	 	r.write("Date Mont Year :"+a[2]+"\n");
	 	r.write("Hours out is :"+a[3]+"\n");
	 	r.write("Minitues in is :"+a[4]+"\n");
	 	r.write("Hours out is :"+a[5]+"\n");
	 	r.write("Mimitues out is :"+a[6]+"\n");
	 	r.close();
	}

	static void InOutTime(int tih,int tim, int tm, int toh, int tom, int tth, int ttm, int mon){
		if(tih > 24 || toh > 24){
	 		System.out.println("Error please enter Hours time 0 - 24 only");
	 		return;
	 	}
	 	else if (tih < 0 || toh < 0){
	 		System.out.println("Error please enter Hours time 0 - 24 only");
	 		return;
	 	}
	 	//ใช้ if check ค่าให้ค่าช.ม.ทั้งเข้าและออกอยู่ในช่วง 0-24 เท่านั้น
	 	if(tim > 60 || tom > 60){
	 		System.out.println("Error please enter Minitues time 0 - 60 only");
	 		return;
	 	}
	 	else if(tim < 0 || tom < 0){
	 		System.out.println("Error please enter Minitues time 0 - 60 only");
	 		return;
	 	}
	 	if(tih > toh){
	 		System.out.println("You park your car over the limit time(1 day)");
	 		return;
	 	}
	 	// check ไม่ให้ เวลาเข้ามากกว่าเวลาออก
	 	//ใช้ if check ค่าให้ค่านาทีทั้งเข้าและออกอยู่ในช่วง 0-24 เท่านั้น
	 	//ที่กำหนดค่าเวลานาทีให้เป็นขอบเขตเพื่อง่ายแก่การคำนสณไม่มีปัญหาเลขเกิน60ในหน่วยนาที


	 	if (tim == 0 && tom == 0){
	 		ttm = 0;
	 		tth = (toh-tih);
	 	}// ถ้า นาทีลง00ทั้งเข้าออกเอาช.ม.มาลบเลยโดยเอาออกลบเข้า
	 	else if ( tim != 0 && tom == 0){
	 		ttm = (60-tim);
	 		tth = ((toh-1)-tih);
	 	}//ถ้า นาทีเข้าไม่ใช่00 ให้เอา 60-ด้วยนาทีเข้า และลบช.ม.ออกด้วย1
	 	else if ( tim == 0 && tom != 0 ){
	 		ttm = tom;
	 		tth = (toh-tih);
	 	}//ถ้านาทีออกไม่เท่ากับ00 ยอดนาทีรวมจะเท่ากับยอดนาทีออก และช.ม.ลบกันธรรมดา
	 	else if (tim != 0 && tom != 0){
	 		if (tim > tom){
	 			ttm = ((tom+60) - tim);
	 			if ((toh-1) == tih){
	 				tth = 0;
	 			}//check กันไม่ให้ค่าช.ม.ติด-
	 			else if ((toh-1) > tih){
	 				tth = ((toh-1)-tih);
	 			}//check กันไม่ให้ค่าช.ม.ติด-
	 		}//ในกรณี นาทีออกน้อยกว่านาทีเข้า จะลบช.ม.ออกไป1แล้ว+นาทีออกด้วย 60 แล้วค่อยลบกัน
	 		else if (tim < tom){
	 			ttm = (tom - tim);
	 			tth = (toh - tih);
	 		}//ลบกันธรรมดาๆเลย
	 		else if (tim == tom){
	 			ttm = 0;
	 			tth = (toh - tih);
	 		}// ถ้านาทีเท่ากัน เอาช.ม.ลบเลย นาที = 0
	 	}//จบการคำนวณเวลา

	 	if (ttm == 0){
	 		tm = tth;
	 	}
	 	else if (ttm > 0){
	 		tm = (tth + 1);
	 	}//ปัดเศษเวลา

	 	if (tm == 1){
	 		mon = 0;
	 	}//ช.ท.แรกฟรี
	 	else if (tm >1 && tm <= 3){
	 		mon = ((tm - 1)*30);
	 	}// ลบ1ช.ม.ฟรีไปไง ต่อไปช.ม.ละ 30
	 	else if (tm > 3){
	 		mon = (((tm - 3)*20)+40);
	 	} //ลบ3ช.ม.แรกก่อน ช.ม.ละ20บาทก่อน +40จาก2ช.ม.และฟรี1ช.ม.
	 		// จบการคิดเงิน
	}
}
	 

