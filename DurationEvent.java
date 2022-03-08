package ch3_2;

public class DurationEvent extends myEvent{

	public String title;
	public ownDate begin;
	public ownDate end;
	
	public DurationEvent(String title, String beginDate, String endDate) {
		super(beginDate);
		this.title = title;
		this.begin = new ownDate(beginDate);
		this.end = new ownDate(endDate);
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDate() {
		return begin.dateTostring() + " ~ " + end.dateTostring();
	}
	
	public boolean amI(ownDate date) {
		if(this.begin.year <= date.year && this.end.year >= date.year && this.begin.month <= date.month && 
				this.end.month >= date.month && this.begin.day <= date.day && this.end.day >= date.day){
			return true;
		}else {
			return false;
		}
	}

	
	
	
}
