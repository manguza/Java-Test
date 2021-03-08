import java.util.*;
import java.io.*;
public class ProjectAon {
	public static void main(String[]arge)throws IOException {
		double a,b,c,d,e,f,g,h,i;
		String name;
		Scanner s = new Scanner(System.in);
		System.out.println("กรุณาใส่ชื่อของคุณ : ");
		name = s.nextLine();
		System.out.println("--------------------*Depression survey*---------------------");
	 	System.out.println("Fill in the answers in number 1.None 2.Some day 3.Frequently 4.Everyday");
		// 1.ไม่มีเลย 2.เป็นบางวัน 3.เป็นบ่อย 4.เป็นทุกวัน
	  	do {
	  		System.out.print("1.Tired of not interested in doing anything : ");  
	  		a = s.nextDouble();
	  	}while ((a <=0) || (a >= 5));
	  
	 	do {
	  		System.out.print("2.Uneasy,depressed,discouraged : ");
	  		b = s.nextDouble();
	  	} while ((b <= 0) || (b >= 5));
	  
		do {
	  		System.out.print("3.Difficult or inactive sleep : ");
		   	c = s.nextDouble();
		} while ((c <= 0) || (c >= 5)); 

		do{
			System.out.print("4. : ");
			d = s.nextDouble();
		}while((d <= 0)||(d >=5));

		do{
			System.out.print("5.Loss of appetite or eating less : ");
	   		e = s.nextDouble();
		}while((e <= 0)||(e >=5));

		do{
			System.out.print("6.Feel bad about myself Think you have failed Disappoint the family : ");
			f = s.nextDouble();
		}while((f <= 0)||(f >=5));

		do{
			System.out.print("7.Poor concentration when doing thing such as watching television and listening to the radio : ");
	   		g = s.nextDouble();
		}while((g <= 0)||(g >=5));

		do{
			System.out.print("8.Speak slowly,do something more slowly until other people notice. Unable to remain to remain as still as it used to be : ");
	   		h = s.nextDouble();
		}while((h <= 0)||(h >=5));

		do{
			System.out.print("9.Thinking of hurting myself or think that if death would be good : ");
	   		i = s.nextDouble();
		}while((i <= 0)||(i >=5));
		
	  	System.out.println("---------------------------------------------------------------");
		ans(name,a,b,c,d,e,f,g,h,i);	   
	}

	static void ans(String name, double a, double b, double c, double d, double e, double f, double g, double h, double i) throws IOException{
		double result;
		FileWriter fw = new FileWriter("../java/data.txt" ,true);
		BufferedWriter bw = new BufferedWriter(fw);

		result = (a + b + c + d + e + f + g + h + i)/2;
	
		
			if (result == 18) {
				System.out.println("คุณเป็นโรคซึมเศร้า");
				bw.write(name + "\n");
				bw.write("คุณเป็นโรคซึมเศร้า");
			} else if(result == result/2) {
				System.out.println("คุณกำลังจะเป็นโรคซึมเศร้า");
				bw.write(name + "\n");
				bw.write("คุณกำลังจะเป็นโรคซึมเศร้า\n");
			} else {
				System.out.println("คุณไม่ได้เป็นโรคซึมเศร้า\n");
				bw.write(name + "\n");
				bw.write("คุณไม่ได้เป็นโรคซึมเศร้า\n");
			}		
		bw.close();

		return ;
	}
}
