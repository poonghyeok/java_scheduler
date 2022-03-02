package ch3_2;

public class DeadlineEvent implements myEvent {
	
	public String title;
	public ownDate until;
	
	public DeadlineEvent(String title, String date) {
	
		this.title = title;
		this.until = new ownDate(date);
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDate() {
		return " ~ " + until.dateTostring();
	}
	
	public boolean amI(ownDate date) {
		if(this.until.year >= date.year && this.until.month >= date.month && this.until.day >= date.day){
			return true;
		}else {
			return false;
		}
	}

}
