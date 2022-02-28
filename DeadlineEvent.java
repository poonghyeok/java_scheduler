package ch3_2;

public class DeadlineEvent {
	
	public String title;
	public String until;
	
	
	public String strYear;
	public String strMonth;
	public String strDay;
	
	public int year;
	public int month;
	public int day;
	
	
	public DeadlineEvent(String title, String date) {
		this.title = title;
		this.until = date;
		
		strYear = date.split("/")[0];
		strMonth = date.split("/")[1];
		strDay = date.split("/")[2];
		
		year = Integer.parseInt(strYear);
		month = Integer.parseInt(strMonth);
		day = Integer.parseInt(strDay);
		
	}
	
}
