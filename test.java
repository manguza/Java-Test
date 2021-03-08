import java.io.*;
import java.util.*;
import java.util.jar.Attributes.Name;
public class test {
	public static void main(String[] args) throws IOException {
		String a,b,c,k;
		String Name, NoB, DMY;
		int get;
		Scanner si = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		System.out.print("Test : ");
		get = si.nextInt();
		switch (get) {
			case 1: 
				System.out.print("How many add book: ");
				int addBook = si.nextInt();
				for(int i=1; i<=addBook; i++) {
					System.out.print("Name of book : ");
					b = s.nextLine(); 
					System.out.print("Enter book price :");
					k = s.nextLine();
					WriterEBook(b,k);
				}
				break;
			case 2:
				FileReader fr = new FileReader("../java/book2.txt");
				BufferedReader br = new BufferedReader(fr);
				Scanner sr = new Scanner(fr); 
				
				System.out.print("Enter You Name : ");
				Name = s.nextLine();
				NoB = sr.next();
				System.out.println("Name of Book : "+ NoB);
				System.out.print("D/M/Y : ");
				DMY = s.nextLine();
				System.out.print(" Thank You Very Much \n");
				WriterCus(Name, NoB, DMY);
				break;
		}
	}

	static void WriterEBook(String b, String k) throws IOException {
		FileWriter fw = new FileWriter("../java/book2.txt",false);
		BufferedWriter w = new BufferedWriter(fw);
			w.write( b +"\n");
			w.write( k + " \n " );
			w.close();
	}

	static void WriterCus(String Name, String NoB, String DMY) throws IOException{
		FileWriter fw = new FileWriter("../java/cus.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		

		bw.write(Name + "\n");
		bw.write(NoB + "\n");
		bw.write(DMY + "\n");
		bw.close();

	}

	static void ReaderEBook() throws IOException {
		FileReader fr = new FileReader("../java/book2.txt");
		String N,NoB,DMY,PR;
		Scanner s = new Scanner(fr);
        
        while (s.hasNext()){
            N = s.next();
            System.out.println("Name : "+N);
            NoB = s.next();
            System.out.println("Name of book : "+NoB);
            DMY = s.next();
            System.out.println("D/M/Y : "+DMY);
            PR = s.next();
            System.out.println("Price : "+PR);
            System.out.println("\n");

        }
        s.close();
			
	}
}