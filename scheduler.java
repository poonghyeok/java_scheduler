package ch3_2;

import java.util.Scanner;

public class scheduler {
	public static OneDayEvent[] oneEvents = new OneDayEvent[100];
	public static int oneNum = 0;
	public static DurationEvent[] durationEvents = new DurationEvent[100];
	public static int durationNum = 0;
	public static DeadlineEvent[] DeadlineEvents = new DeadlineEvent[100];
	public static int deadlineNum = 0;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("$ ");
			String cmd = sc.next();
			String kindofEvent = sc.next();
			
			if(cmd.equals("addevent")) {
				if(kindofEvent.equals("oneday")) {
					String Date;
					String Title;
					
					System.out.println("when : ");
					Date = sc.next();
					System.out.println("title : ");
					Title = sc.next();
					
					//addevent oneday when : user_input_date, title : user_input_title
					oneEvents[oneNum] = new OneDayEvent(Title, Date);
					oneNum++;
					
				}else if(kindofEvent.equals("duration")) {
					String beginDate;
					String endDate;
					String Title;
					
					System.out.println("begin date : ");
					beginDate = sc.next();
					System.out.println("end date : ");
					endDate = sc.next();
					System.out.println("title : ");
					Title = sc.next();
					
					//addevent duration begin : user_input_date, title : user_input_title
					durationEvents[durationNum] = new DurationEvent(Title, beginDate, endDate);
					
					durationNum++;
					
				}else if(kindofEvent.equals("deadline")) {
					String untilDate;
					String Title;
					
					System.out.println("until : ");
					untilDate = sc.next();
					System.out.println("title : ");
					Title = sc.next();
					
					//About Until Date. 
					DeadlineEvents[deadlineNum] = new DeadlineEvent(Title, untilDate);
					deadlineNum++;
					
				}
			}else if(cmd.equals("list")) {
				allList();
			}else if(cmd.equals("show")) {
				
			}else if(cmd.equals("exit")) {
				System.out.println("system exit.");
				System.exit(0);
			}
			
			
		}
		
	}
	
	public static void allList() {
		//print OnedayEvents array elements.
		for(int i = 0; i < oneNum; i++) {
			System.out.println(oneEvents[i].title + " , " + oneEvents[i].when);
		}
		
		for(int i = 0; i < durationNum; i++) {
			System.out.println(durationEvents[i].title + " , " + durationEvents[i].begin + " ~ " + durationEvents[i].end);
		}
		
		for(int i = 0; i < oneNum; i++) {
			System.out.println(DeadlineEvents[i].title + " , " + " ~ " + DeadlineEvents[i].until);
		}
		
	}
	

}
