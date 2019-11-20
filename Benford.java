import java.io.FileInputStream;
import java.util.Scanner;

public class Benford {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4BenfordLinear.txt
		Scanner console = new Scanner(System.in);
		String filepath = console.nextLine();
		System.out.println("Let us count those leading digits...");
		
		
		try(Scanner scan = new Scanner(new FileInputStream(filepath))){
			 String content = "";
			 double index = 0.0;
			 int[] myArry = new int[10];
			 int startWith0 = 0;
			 int startWith1 = 0;
			 int startWith2 = 0;
			 int startWith3 = 0;
			 int startWith4 = 0;
			 int startWith5 = 0;
			 int startWith6 = 0;
			 int startWith7 = 0;
			 int startWith8 = 0;
			 int startWith9 = 0;
			 
			 while(scan.hasNext()){
				 String data = scan.next();
				 if(data.length()>0) {
					 content += data+"\n";
					 String startWith = data.substring(0,1);
					// System.out.println(startWith);
					 index++;
					 
					 if(startWith.equals("0")) {
						 startWith0++;
						 index--;
						 myArry[0] = startWith0;
					 }else if(startWith.equals("1")) {
						 startWith1++;
						 myArry[1] = startWith1;
						 //System.out.println(data+" "+startWith1+" "+myArry[1]);
					 }else if(startWith.equals("2")) {
						 startWith2++;
						 myArry[2] = startWith2;
					 }else if(startWith.equals("3")) {
						 startWith3++;
						 myArry[3] = startWith3;
					 }else if(startWith.equals("4")) {
						 startWith4++;
						 myArry[4] = startWith4;
					 }else if(startWith.equals("5")) {
						 startWith5++;
						 myArry[5] = startWith5;
					 }else if(startWith.equals("6")) {
						 startWith6++;
						 myArry[6] = startWith6;
					 }else if(startWith.equals("7")) {
						 startWith7++;
						 myArry[7] = startWith7;
					 }else if(startWith.equals("8")) {
						 startWith8++;
						 myArry[8] = startWith8;
					 }else if(startWith.equals("9")) {
						 startWith9++;
						 myArry[9] = startWith9;
					 }         
				 }
			  	
			 }
			 
			 //System.out.println((myArry[1] * 100)/index);
			 //System.out.println(index);
			 
			 if(myArry[0] > 0) {
				 System.out.println("input file name? "+"excluding "+myArry[0]+" zeros");
				 System.out.println("Digit"+" "+"Count"+" "+"Percent");
			 }else {
				 System.out.println("input file name? "+"Digit"+" "+"Count"+" "+"Percent");
			 }
	         
	         for(int m = 1;m<myArry.length; m++) {
	        	 double percent = (myArry[m] * 100)/index;
	        	 System.out.println(String.format("%5s", m)+" "+String.format("%5s", myArry[m])+" "+String.format("%6.2f", percent));
	         }
	         System.out.println("Total"+" "+String.format("%5.0f", index)+" "+"100.00");
	         
	         //System.out.println(content);
	         
	         
	         scan.close();    
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		console.close();
	}

}
