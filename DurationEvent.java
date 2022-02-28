package ch3_2;

public class DurationEvent{

	public String title;
	public String begin;
	public String end;
	
	public String strBeginYear;
	public String strBeginMonth;
	public String strBeginDay;
	
	public String strEndYear;
	public String strEndMonth;
	public String strEndDay;
	
	public int beginYear;
	public int beginMonth;
	public int beginDay;
	
	public int endYear;
	public int endMonth;
	public int endDay;
	
	public DurationEvent(String title, String beginDate, String endDate) {
		this.title = title;
		this.begin = beginDate;
		this.end = endDate;
		
		strBeginYear = beginDate.split("/")[0];
		strBeginMonth = beginDate.split("/")[1];
		strBeginDay = beginDate.split("/")[2];
		
		strEndYear = endDate.split("/")[0];
		strEndMonth = endDate.split("/")[1];
		strEndDay = endDate.split("/")[2];
			
		beginYear = Integer.parseInt(strBeginYear);
		beginMonth = Integer.parseInt(strBeginMonth);
		beginDay = Integer.parseInt(strBeginDay);
		
		endYear = Integer.parseInt(strEndYear);
		endMonth = Integer.parseInt(strEndMonth);
		endDay = Integer.parseInt(strEndDay);
		
	}
	
}
