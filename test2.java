import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class test2 {
	static Scanner s = new Scanner(System.in);
	public static void main (String[]args) throws IOException {
		int c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, count = 0, number = 0;

		System.out.println("             <==***====**="+"Question"+"=**====***==>");
		FileWriter A = new FileWriter("D:/WorkJava/Member" ,true);
		Scanner a = new Scanner(System.in);
		BufferedWriter AB = new BufferedWriter(A);
		System.out.println("                <=*===*=Reggister=*=*===>");
		System.out.print("Enter You Name : ");
		String name = a.nextLine();
		AB.write(name + "\n");
		System.out.print("Enter you Facebook : ");
		String facebook = a.nextLine();
		AB.write(facebook + "\n");
		System.out.print("Enter you Email : ");
		String email = a.nextLine();
		
		System.out.println("       <==*==*==*==*==*==*==**Strat**==*==*==*==*==*==*==>");
		//ข้อ 1
		
		do{
			System.out.println("What chosse is incorrect");
			System.out.println("Pree 1 : Thailand county is Bangkok");
			System.out.println("Pree 2 : Laos county is Vietiane");
			System.out.println("Pree 3 : Malaysian county is Kuala Lumpur");
			System.out.println("Pree 4 : Myanmar county is Manila");
			System.out.print("Pree : ");
			c1 = s.nextInt();
		}while((c1 <= 0) || (c1 >= 5));
		Ans1(c1);
		System.out.println("------------------------------------------------------------------------------------");
		
		//ข้อ 2
		do{
			System.out.println("What choose is incorrect");
			System.out.println("Pree 1 : java");
			System.out.println("Pree 2 : html");
			System.out.println("Pree 3 : c");
			System.out.println("Pree 4 : python");
			System.out.print("Pree : ");
 			c2 = s.nextInt();
		}while(c2 <= 0 || c2 >= 5);
		Ans2(c2);
		System.out.println("------------------------------------------------------------------------------------");
		
		//ข้อ 3
		do{
			System.out.println("How many symbol Compoud Statement?");
			System.out.println("Pree 1 : 2 symbol");
			System.out.println("Pree 2 : 3 symbol");
			System.out.println("Pree 3 : 4 symbol");
			System.out.println("Pree 4 : 5 symbol");
			System.out.print("Pree : ");
			c3 = s.nextInt();
		}while(c3 <= 0 || c3 >= 5);
		Ans3(c3);
		System.out.println("------------------------------------------------------------------------------------");
		
		//ข้อ 4
		do{
			System.out.println("What is a ISO");
			System.out.println("Pree 1 : Information Security Management System");
			System.out.println("Pree 2 : Internet Security Oprator System");
			System.out.println("Pree 3 : Information System Oprator System");
			System.out.println("Pree 4 : Internet Service Option System");
			System.out.print("Pree : ");
			c4 = s.nextInt();
		}while(c2 <= 0 || c2 >= 5);
		Ans4(c4);
		System.out.println("------------------------------------------------------------------------------------");
		
		//ข้อ 5
		do{
			System.out.println("How many Trademark kind?");
			System.out.println("Pree 1 : 5 kind");
			System.out.println("Pree 2 : 3 kind");
			System.out.println("Pree 3 : 6 kind");
			System.out.println("Pree 4 : 4 kind");
			System.out.print("Pree : ");
			c5 = s.nextInt();
		}while(c2 <= 0 || c2 >= 5);
		Ans5(c5);
		System.out.println("------------------------------------------------------------------------------------");
		
		//ข้อ 6
		do{
			System.out.println("1G Birth Year A.D.?");
			System.out.println("Pree 1 : A.D. 1979");
			System.out.println("Pree 2 : A.D. 1945");
			System.out.println("Pree 3 : A.D. 1990");
			System.out.println("Pree 4 : A.D. 2002");
			System.out.print("Pree : ");
			c6 = s.nextInt();
		}while(c2 <= 0 || c2 >= 5);
		Ans6(c6);
		System.out.println("------------------------------------------------------------------------------------");
		
		//ข้อ 7
		do{
			System.out.println("Internet Birth Year A.D.?");
			System.out.println("Pree 1 : A.D. 1979");
			System.out.println("Pree 2 : A.D. 1989");
			System.out.println("Pree 3 : A.D. 1969");
			System.out.println("Pree 4 : A.D. 1944");
			System.out.print("Pree : ");
			c7 = s.nextInt();
		}while(c2 <= 0 || c2 >= 5);
		Ans2(c7);
		System.out.println("------------------------------------------------------------------------------------");
		
		//ข้อ 8
		System.out.println("How do you Message input?");
		System.out.println("Pree 1 : String");
		System.out.println("Pree 2 : Double");
		System.out.println("Pree 3 : Int");
		System.out.println("Pree 4 : Float");
		System.out.print("Pree : ");
		int c8 = s.nextInt();
		int ans8 = Ans8(c8);
		System.out.println("------------------------------------------------------------------------------------");
		
		//ข้อ 9
		System.out.println("Int a = 90;" + "\n" 
						 + "Int b = 56;" + "\n"
						 + "Int c = a + d;" + "\n"
						 + "System.out.print" + "(" + "Total : " + " .......);");
		System.out.println("Pree 1 : 134");
		System.out.println("Pree 2 : 152");
		System.out.println("Pree 3 : 146");
		System.out.println("Pree 4 : 122");
		System.out.print("Pree : ");
		int c9 = s.nextInt();
		int ans9 = Ans9(c9);
		System.out.println("------------------------------------------------------------------------------------");
		
		//ข้อ 10
		System.out.println("Who is First Programmer");
		System.out.println("Pree 1 : John Napier");
		System.out.println("Pree 2 : Gottfried Wilhelm Leibniz");
		System.out.println("Pree 3 : Willam Ota");
		System.out.println("Pree 4 : Lady Ada Augusta Lovelace");
		System.out.print("Pree : ");
		int c10 = s.nextInt();
		int ans10 = Ans10(c10);
		System.out.print("Answer is " + ans10);
		System.out.println("------------------------------------------------------------------------------------");
		
		//ข้อ 11
		System.out.println("1 TB = ?");
		System.out.println("Pree 1 : 1000 GB");
		System.out.println("Pree 2 : 1 GB");
		System.out.println("Pree 3 : 8 Bit");
		System.out.println("Pree 4 : 1024 KB");
		System.out.print("Pree : ");
		int c11 = s.nextInt();
		int ans11 = Ans11(c11);
		System.out.print("Answer is " + "");
		System.out.println("------------------------------------------------------------------------------------");
		
		//ข้อ 12
		System.out.println("Who crated Microsotf?");
		System.out.println("Pree 1 : Elon Reeve Musk");
		System.out.println("Pree 2 : Bill Gates");
		System.out.println("Pree 3 : Mark zuckerberg");
		System.out.println("Pree 4 : Steve jobs");
		System.out.print("Pree : ");
		int c12 = s.nextInt();
		int ans12 = Ans12(c12);
		System.out.print("Answer is " + ans12);
		System.out.println("------------------------------------------------------------------------------------");
		
		//ข้อ 13
		System.out.println("Which is one is the software presentation?");
		System.out.println("Pree 1 : Microsoft Execl");
		System.out.println("Pree 2 : Microsoft Access");
		System.out.println("Pree 3 : Microsoft PowerPoint");
		System.out.println("Pree 4 : Microsoft Outlook");
		System.out.print("Pree : ");
		int c13 = s.nextInt();
		int ans13 = Ans13(c13);
		System.out.print("Answer is " + ans13);
		System.out.println("------------------------------------------------------------------------------------");
		
		//ข้อ 14
		System.out.println("Domain Name" + "=>UK<=" + "is" +" Country");
		System.out.println("Pree 1 : United States");
		System.out.println("Pree 2 : United Kingdom");
		System.out.println("Pree 3 : Ukraine");
		System.out.println("Pree 4 : Uzbekistan");
		System.out.print("Pree : ");
		int c14 = s.nextInt();
		int ans14 = Ans14(c14);
		System.out.print("Answer is " + ans14);
		System.out.println("------------------------------------------------------------------------------------");
		
		//ข้อ 15
		System.out.println("What is about Domain name =>.gov<=?");
		System.out.println("Pree 1 : Government");
		System.out.println("Pree 2 : Non-profit organization");
		System.out.println("Pree 3 : Commercial");
		System.out.println("Pree 4 : Network");
		System.out.print("Pree : ");
		int c15 = s.nextInt();
		int ans15 = Ans15(c15);
		System.out.print("Answer is " + ans15);
		System.out.println("------------------------------------------------------------------------------------");
		
		//ข้อ 16
		System.out.println("Which continent has 90% of the world's ice?");
		System.out.println("Pree 1 : Antarctica");
		System.out.println("Pree 2 : Greeland");
		System.out.println("Pree 3 : Arctic");
		System.out.println("Pree 4 : North America");
		System.out.print("Pree : ");
		int c16 = s.nextInt();
		int ans16 = Ans16(c16);
		System.out.print("Answer is " + ans16);
		System.out.println("------------------------------------------------------------------------------------");
		
		//ข้อ 17
		System.out.println("What is the highest mountain in Tibet?");
		System.out.println("Pree 1 : Mount Manaslu");
		System.out.println("Pree 2 : Mount Annapurna");
		System.out.println("Pree 3 : Mount Everest");
		System.out.println("Pree 4 : Mount Daulagiri");
		System.out.print("Pree : ");
		int c17 = s.nextInt();
		int ans17 = Ans17(c17);
		System.out.print("Answer is " + ans17);
		System.out.println("------------------------------------------------------------------------------------");
		
		//ข้อ 18
		System.out.println("Who proposes to use X as a multiplication symbol?");
		System.out.println("Pree 1 : Isaac Newton");
		System.out.println("Pree 2 : Johann Carl Friedrich Gauss");
		System.out.println("Pree 3 : Leonhard Euler");
		System.out.println("Pree 4 : William Octred");
		System.out.print("Pree : ");
		int c18 = s.nextInt();
		int ans18 = Ans18(c18);
		System.out.print("Answer is " + ans18);
		System.out.println("------------------------------------------------------------------------------------");
		
		//ข้อ 19
		System.out.println("What brand of soft drinks did Joseph Bidenharn give?");
		System.out.println("Pree 1 : Coca-Cola");
		System.out.println("Pree 2 : Pepsi");
		System.out.println("Pree 3 : A&W");
		System.out.println("Pree 4 : Sprite");
		System.out.print("Pree : ");
		int c19 = s.nextInt();
		int ans19 = Ans19(c19);
		System.out.print("Answer is " + ans19);
		System.out.println("------------------------------------------------------------------------------------");
		
		//ข้อ 20
		System.out.println("What produce makes Venezuela the richest in the South American country?");
		System.out.println("Pree 1 : Gold");
		System.out.println("Pree 2 : Oil");
		System.out.println("Pree 3 : Coffee");
		System.out.println("Pree 4 : Cocoa");
		System.out.print("Pree : ");
		int c20 = s.nextInt();
		int ans20 = Ans20(c20);
		System.out.print("Answer is " + ans20);
		System.out.println("------------------------------------------------------------------------------------");
		
		นับข้อที่ถูกต้องตั้งแต่ c1 ถึง c20
		
		AB.write(name + "\n");
		AB.write(email + "\n");
		AB.write(facebook + "\n");
		AB.close();
		}
			public static int Ans1(int c1) {
			
				if (c1 == 4) {
					System.out.println("              =>It's Correct<=");
					System.out.print("==>Answer is " + "4 : Myanmar county is Manila<==" + "\n");
				}
				else {
					System.out.println("                  =>Wrong<=");
					System.out.print("==>Answer is " + "4 : Myanmar county is Manila<==" + "\n");
				}
				return c1;
			
			}
			public static int Ans2(int c2) {
				if (c2 == 2) {
					System.out.println("              =>It's Correct<=");
					System.out.print("==>Answer is " + "2 : html<==" + "\n");
				}
				else {
					System.out.println("                  =>Wrong<=");
					System.out.print("==>Answer is " + "2 : html<==" + "\n");
				}
				return c2;
			}
			public static int Ans3(int c3) {
				if (c3 == 4) {
					System.out.println("              =>It's Correct<=");
					System.out.print("Answer is " + "4 : 5 symbol" + "\n");
				}else {
					System.out.println("                  =>Wrong<=");
					System.out.print("Answer is " + "4 : 5 symbol" + "\n");
				}
				return c3;
			}
			public static int Ans4(int c4) {
				if (c4 == 1) {
					System.out.println("              =>It's Correct<=");
					System.out.print("Answer is " + "1 : Information Security Management System" + "\n");
				}else 	{
					System.out.println("Wrong");
					System.out.print("Answer is " + "1 : Information Security Management System" + "\n");
				}
				return c4;
			}
			public static int Ans5(int c5) {
				if (c5 == 4) {
					System.out.println("              =>It's Correct<=");
					System.out.print("==>Answer is " + "4 kind<==" + "\n");
				}
				else {
					System.out.println("                  =>Wrong<=");
					System.out.print("==>Answer is " + "4 kind<==" + "\n");
				}
				return c5;
			}
			public static int Ans6(int c6) {
				if (c6 == 1) {
					System.out.println("              =>It's Correct<=");
					System.out.print("Answer is " + "1 : A.D. 1979" + "\n");
				}
				else {
					System.out.println("                  =>Wrong<=");
					System.out.print("Answer is " + "1 : A.D. 1979" + "\n");
				}
				return c6;
			}
			public static int Ans7(int c7) {
				if (c7 == 3) {
					System.out.println("              =>It's Correct<=");
					System.out.print("Answer is " + "3 : A.D. 1969" + "\n");
				}
				else {
					System.out.println("                  =>Wrong<=");
					System.out.print("Answer is " + "3 : A.D. 1969" + "\n");
				}
				return c7;
			}
			public static int Ans8(int c8) {
				if (c8 == 1) {
					System.out.println("              =>It's Correct<=");
					System.out.print("Answer is " + "1 : String");
				}
				else {
					System.out.println("                  =>Wrong<=");
					System.out.print("Answer is " + "1 : String");
				}
				return c8;
			}
			public static int Ans9(int c9) {
				if (c9 == 3) {
					System.out.println("              =>It's Correct<=");
					System.out.print("Answer is " + "3 : 146");
				}
				else {
					System.out.println("                  =>Wrong<=");
					System.out.print("Answer is " + "3 : 146");
				}
				return c9;
			}
			public static int Ans10(int c10) {
				if (c10 == 4) {
					System.out.println("              =>It's Correct<=");
					System.out.print("Answer is " + "4 : Lady Ada Augusta Lovelace");
				}
				else {
					System.out.println("                  =>Wrong<=");
					System.out.print("Answer is " + "4 : Lady Ada Augusta Lovelace");
				}
				return c10;
			}
			public static int Ans11(int c11) {
				if (c11 == 1) {
					System.out.println("              =>It's Correct<=");
					System.out.print("Answer is " + "1 : 1000 GB");
				}
				else {
					System.out.println("                  =>Wrong<=");
					System.out.print("Answer is " + "1 : 1000 GB");
				}
				return c11;
			}
			public static int Ans12(int c12) {
				if (c12 == 1) {
					System.out.println("              =>It's Correct<=");
					System.out.print("Answer is " + "1 : 1000 GB");
				}
				else  {
					System.out.println("                  =>Wrong<=");
					System.out.print("Answer is " + "1 : 1000 GB");
				}
				return c12;
			}
			public static int Ans13(int c13) {
				if (c13 == 3) {
					System.out.println("              =>It's Correct<=");
					System.out.print("Answer is " + "3 : Microsoft PowerPoint");
				}
				else if (c13 == 4){
					System.out.println("                  =>Wrong<=");
					System.out.print("Answer is " + "3 : Microsoft PowerPoint");
				}
				return c13;
			}
			public static int Ans14(int c14) {
				if (c14 == 2) {
					System.out.println("              =>It's Correct<=");
					System.out.print("Answer is " + "2 : United Kingdom" + "\n");
				}
				else {
					System.out.println("                  =>Wrong<=");
					System.out.print("Answer is " + "2 : United Kingdom" + "\n");
				}
				return c14;
			}
			public static int Ans15(int c15) {
				if (c15 == 1) {
					System.out.println("              =>It's Correct<=");
					System.out.print("Answer is " + "1 : Government" + "\n");
				}
				else {
					System.out.println("                  =>Wrong<=");
					System.out.print("Answer is " + "1 : Government" + "\n");
				}
				return c15;
			}
			public static int Ans16(int c16) {
				if (c16 == 1) {
					System.out.println("              =>It's Correct<=");
					System.out.print("Answer is " + "1 : Antarctica" + "\n");
				}
				else {
					System.out.println("                  =>Wrong<=");
					System.out.print("Answer is " + "1 : Antarctica" + "\n");
				}
				return c16;
			}
			public static int Ans17(int c17) {
				if (c17 == 1) {
					System.out.println("              =>It's Correct<=");
					System.out.print("Answer is " + "1 : Mount Everest" + "\n");
				}
				else {
					System.out.println("                  =>Wrong<=");
					System.out.print("Answer is " + "1 : Mount Everest" + "\n");
				}
				return c17;
			}
			public static int Ans18(int c18) {
				if (c18 == 4) {
					System.out.println("              =>It's Correct<=");
					System.out.print("Answer is " + "4 : William Octred" + "\n");
				}
				else {
					System.out.println("                  =>Wrong<=");
					System.out.print("Answer is " + "4 : William Octred" + "\n");
				}
				return c18;
			}
			public static int Ans19(int c19) {
				if (c19 == 1) {
					System.out.println("              =>It's Correct<=");
					System.out.print("Answer is " + "1 : Coca-Cola" + "\n");
				}
				else {
					System.out.println("                  =>Wrong<=");
					System.out.print("Answer is " + "1 : Coca-Cola" + "\n");
				}
				return c19;
			}
			public static int Ans20(int c20) {
				if (c20 == 2) {
					System.out.println("              =>It's Correct<=");
					System.out.print("Answer is " + "2 : Oil" + "\n");
				}
				else {
					System.out.println("                  =>Wrong<=");
					System.out.print("Answer is " + "2 : Oil" + "\n");
				}
				return c20;
			}
		}