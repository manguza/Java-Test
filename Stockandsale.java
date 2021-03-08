import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Stockandsale {
	public static void main (String [] arge) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Please select a program to use.");
		System.out.println("Enter 1 is Stock");
		System.out.println("Enter 2 is sale");
		System.out.print("You choose : ");
		int user = s.nextInt();
		int total = 0;
		switch(user){
			case 1 : System.out.println("edit Stock");
					 FileWriter  fw = new FileWriter("../java/Stockadd.txt",false);
					 BufferedWriter w = new BufferedWriter(fw);
					 Scanner s1 = new Scanner(System.in);
					 int count = 0;
					 while(count < 6 ) {
						 System.out.print("Enter Many color: ");
						 String color = s1.nextLine();
						 System.out.print("Enter piece color : ");
						 String piece = s1.nextLine();
						 w.write(color +"\n");
						 w.write(piece+"\n");
						 count++;
					}
					 w.close();
					 System.out.print("Successfully saved data!!");
					 break;
			case 2 : FileReader fr1 = new FileReader("../java/Productpricenew.txt");
					 BufferedReader r = new BufferedReader(fr1);
					 String message = r.readLine();
					 s.nextLine();
					 System.out.print("What do you want? ");
					 String name = s.nextLine();
					 System.out.print("How many pieces do you need ?");
					 int slice = s.nextInt();
					 System.out.println();
					 while(message != null) {
							if(message.equals(name)) {
								message = r.readLine();
								total = slice * (Integer.parseInt(message));
							}
							message = r.readLine();
					 }
					 System.out.println("Enter 1 you are member");
					 System.out.println("Enter 2 you are not member");
					 System.out.print("You choose : ");
					 int sell = s.nextInt();
					 if(sell==1){
						FileReader fl = new FileReader("../java/usernew.txt");
						BufferedReader l = new BufferedReader(fl);
						String message1 = l.readLine();
						System.out.print("NamberMember : ");
						String namber = s.nextLine();
						while(message1 != null) {
							if(message1.equals(namber)) {
								message1 = l.readLine();
								System.out.println("Name : "+message1);
							}
							message1 = r.readLine();
						}
						int totalnew = Member(total);
						System.out.println("You get 5% discout for member!");
						System.out.print("From total"+total+" Baht. "+"You pay = "+totalnew+" Baht.");
						
						}else if(sell==2) {
							System.out.print("Enter 1 Do not apply for mambership");
							System.out.print("Enter 2 Apply for mambership");
							int user2 = s.nextInt();
							notMember(user2,total);
							
						}
					 break;
					 }
	
}
	private static int notMember(int sell,int total) {
		switch(sell) {
			case 1 : System.out.println("You are not a mrmber");
					 System.out.print("You pay : "+total);
					 break;
			case 2 : try {
					FileWriter fw = new FileWriter("../java/usernew.txt",true);
					BufferedWriter w = new BufferedWriter(fw);
					Scanner s = new Scanner(System.in);
					int codeuser = (int)(Math.random()*1000);
					FileReader fr = new FileReader("../java/Productpricenew.txt");
					BufferedReader r = new BufferedReader(fr);
					String message = r.readLine();
					while(message != null) {
						if(message.equals(codeuser)) {
							codeuser = (int)(Math.random()*1000);
						}
						message = r.readLine();
					}
					System.out.println("Member ID is "+codeuser);
					System.out.print("Enter your firstname : ");
					String name = s.nextLine();
					System.out.print("Enter your lastname: ");
					String lastname = s.nextLine();
					System.out.print("Enter your ID Card: ");
					String IDCard = s.nextLine();
					System.out.print("Enter your Date of Birth : ");
					String Date = s.nextLine();
					System.out.print("Enter your age : ");
					String age = s.nextLine();
					System.out.print("Enter your Mobilephone: ");
					String Mobilephone = s.nextLine();
					w.write(codeuser +"\n");
					w.write(name+"\n");
					w.write(lastname+"\n");
					w.write(IDCard+"\n");
					w.write(Date+"\n");
					w.write(age+"\n");
					w.write(Mobilephone+"\n");
				w.close();
				System.out.print("NamberMember : ");
				int namber = s.nextInt();
				int totalnew = Member(total);
				System.out.println("You get 5% discout for member!");
				System.out.print("From total"+total+" Baht. "+"You pay = "+totalnew+" Baht.");
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		}
		return total;
	}
	public static  int Member(int slice ) throws IOException {
		 	slice =  (int) (slice * 0.95);
		return slice;
	}	
	}	