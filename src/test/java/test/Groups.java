package test;

import org.testng.annotations.Test;

public class Groups {
  @Test(groups= {"Sandy"})
  public void Sandy1() {
	    System.out.println("Sandy1");
  }
  @Test(groups= {"Sandy"})
  public void Sandy2() {
	  
	  System.out.println("Sandy2");
  }
  @Test(groups= {"Mava"})
  public void Ashok1() {
	  
	  System.out.println("Ashok1");
  }
  @Test(groups= {"Mava"})
  public void Ashok2() {
	  
	  System.out.println("Ashok2");  
  }
  @Test(groups= {"Yesh"})
  public void Yeshwanth1() {
	  
	  System.out.println("Yeshwanth1"); 
  }
  @Test(groups= {"Yesh"})
  public void Yeshwanth2() {
	  
	  System.out.println("Yeshwanth2");
  }
}
