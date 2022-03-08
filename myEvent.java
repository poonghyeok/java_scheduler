package ch3_2;

public abstract class myEvent implements MyDistance{
	
	public abstract String getTitle();
	public abstract String getDate();
	public abstract boolean amI(ownDate date);
	
	public ownDate comparedDate;
	
	public myEvent(String initialDate) {
		comparedDate = new ownDate(initialDate);
	}
	
	public int farFrom(Object other) {
		int result = -2;
		myEvent otherEvent = (myEvent)other;
		if(this.comparedDate.year < otherEvent.comparedDate.year) {
			result = -1;
		}else if(this.comparedDate.year == otherEvent.comparedDate.year) {
			if(this.comparedDate.month < otherEvent.comparedDate.month) {
				result = -1;
			}else if(this.comparedDate.month == otherEvent.comparedDate.month) {
				if(this.comparedDate.day < otherEvent.comparedDate.day) {
					result = -1;
				}else if(this.comparedDate.day < otherEvent.comparedDate.day) {
					result = 0;
				}else if(this.comparedDate.day < otherEvent.comparedDate.day) {
					result = 1;
				}
			}else if(this.comparedDate.month > otherEvent.comparedDate.month) {
				result = 1;
			}
		}else if(this.comparedDate.year > otherEvent.comparedDate.year) {
			result = 1;
		}
		
		return result;
	}
	
	
}
