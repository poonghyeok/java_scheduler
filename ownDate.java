package ch3_2;

public class ownDate {
	public int year;
	public int month;
	public int day;
	
	public ownDate(String draftDate) {
		this.year = Integer.parseInt(draftDate.split("/")[0]);
		this.month = Integer.parseInt(draftDate.split("/")[1]);
		this.day = Integer.parseInt(draftDate.split("/")[2]); //여기 또한 method로 분리해서 할 수 있지 않을을까
	}
	
	public String dateTostring() {
		return this.year + "/" + this.month + "/" + this.day;
	}
	
	
}
