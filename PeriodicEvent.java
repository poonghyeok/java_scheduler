package ch3_2;

public class PeriodicEvent implements myEvent{
	ownDate startDate;
	String period;
	String title;
	
	public PeriodicEvent(String Date, String period, String title) {
		this.startDate = new ownDate(Date);
		this.period = period;
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDate() {
		return startDate.dateTostring();
	}
	
	public boolean amI(ownDate date) {
		if(this.startDate.year >= date.year && this.startDate.month >= date.month && this.startDate.day >= date.day){
			return true;
		}else {
			return false;
		}
	}

	
}
