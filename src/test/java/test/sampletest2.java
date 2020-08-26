package test;

import java.util.Scanner;

public class sampletest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		String withoutVo = "";
		
		for(int i=0; i<name.length(); i++) {
		
		int count = 0; 
			
		if(name.substring(i, i+1).contentEquals("A")) {
			count++;
		}
		
		if(name.substring(i, i+1).contentEquals("E")) {
			count++;
		}
		
		if(name.substring(i, i+1).contentEquals("I")) {
			count++;
		}
		if(name.substring(i, i+1).contentEquals("O")) {
			count++;
		}
		if(name.substring(i, i+1).contentEquals("U")) {
			count++;
		}
		if(name.substring(i, i+1).contentEquals("a")) {
			count++;
		}
		if(name.substring(i, i+1).contentEquals("e")) {
			count++;
		}
		if(name.substring(i, i+1).contentEquals("i")) {
			count++;
		}
		if(name.substring(i, i+1).contentEquals("o")) {
			count++;
		}
		if(name.substring(i, i+1).contentEquals("u")) {
			count++;
		}
		if(count==0) {
			withoutVo = withoutVo+name.substring(i, i+1);
		}
		
			
		}
		
		System.out.println(withoutVo);

	}

}
