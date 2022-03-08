package ch3_2;

public class OneDayEvent extends myEvent {
	
	public String title;
	public ownDate when;
	
	public OneDayEvent(String title, String date) {
		super(date);
		this.title = title;
		this.when = new ownDate(date);
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDate() {
		return when.dateTostring();
	}
	
	public boolean amI(ownDate date) {
		if(this.when.year == date.year && this.when.month == date.month && this.when.day == date.day){
			return true;
		}else {
			return false;
		}
	}
	
	
	
	

}
