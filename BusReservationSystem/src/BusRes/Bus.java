package BusRes;

//import java.security.DrbgParameters.Capability;

public class Bus {
	private int BusNo;
	private boolean ac;
	private int capacity;
 
  Bus(int no, boolean ac, int cap) {
		
		this.BusNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
  
  public int getBusNo() {
	  return BusNo;
  }
  
  public boolean isAc() {
	  return ac;
  }
  
 public int getCapacity(){//accessor to method
	  return capacity;
  }
 
 public void setBusNo(int no) {
	 BusNo = no;
 }
 
 public void setAc(boolean val) {
	 ac = val;
 }
 
 public void setCapacity(int cap) { //mutator
		capacity = cap;
	}
 
 public void displayBusInfo() {
	 System.out.println("Bus No:" + BusNo + "Total capacity:" + capacity + "AC:" + ac);
 }
}
