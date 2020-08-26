package test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Sampletest {
	static int Maincount=0;
	static int count = 0;

	public static void main(String[] args) {
		
		System.out.println(new Date());
		System.out.println(Instant.now());
		
		System.out.println(LocalDate.now().plusDays(0).format(DateTimeFormatter.ofPattern("MM-dd-uuuu")));

		/*
		 * // TODO Auto-generated method stub
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * String value = sc.nextLine();
		 * 
		 * 
		 * for(int i=0; i<value.length(); i++) {
		 * 
		 * String singlecharvalue = value.substring(i, i+1);
		 * 
		 * count =0;
		 * 
		 * for(int j=0; j<value.length(); j++) {
		 * 
		 * 
		 * if(value.substring(j, j+1).contentEquals(singlecharvalue)) { count++; }
		 * 
		 * if(count>1) { break; }
		 * 
		 * }
		 * 
		 * if (count ==1) { Maincount++; }
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 * System.out.println(Maincount);
		 * 
		 */}

}
