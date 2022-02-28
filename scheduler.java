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
			System.out.print("$ ");
			String cmd = sc.next();
			
			if(cmd.equals("addevent")) {
				String kindofEvent = sc.next();
				System.out.println("cmd : " + cmd + " kindofEvent : " + kindofEvent);
				
				if(kindofEvent.equals("oneday")) {
					System.out.println("add oneday event on list ");
					
					String Date;
					String Title;
					
					System.out.print("when : ");
					Date = sc.next();
					System.out.print("title : ");
					Title = sc.next();
					
					//addevent oneday when : user_input_date, title : user_input_title
					oneEvents[oneNum] = new OneDayEvent(Title, Date);
					oneNum++;
					
					
				}else if(kindofEvent.equals("duration")) {
					System.out.println("add duration event on list ");
					
					String beginDate;
					String endDate;
					String Title;
					
					System.out.print("begin date : ");
					beginDate = sc.next();
					System.out.print("end date : ");
					endDate = sc.next();
					System.out.print("title : ");
					Title = sc.next();
					
					//addevent duration begin : user_input_date, title : user_input_title
					durationEvents[durationNum] = new DurationEvent(Title, beginDate, endDate);
					
					durationNum++;
					
				}else if(kindofEvent.equals("deadline")) {
					System.out.println("add deadline event on list ");
					
					String untilDate;
					String Title;
					
					System.out.print("until : ");
					untilDate = sc.next();
					System.out.print("title : ");
					Title = sc.next();
					
					//About Until Date. 
					DeadlineEvents[deadlineNum] = new DeadlineEvent(Title, untilDate);
					deadlineNum++;
					
				}else {
					System.out.println("cannot find the kind of event..!");
				}
			}else if(cmd.equals("list")) {
				allList();
			}else if(cmd.equals("show")) {
				
			}else if(cmd.equals("exit")) {
				System.out.println("system exit.");
				System.exit(0);
			}else {
				System.out.println("something wrong..! try again..!");
			}
		}
		
	}
	
	public static void allList() {
		//print OnedayEvents array elements.
		for(int i = 0; i < oneNum; i++) {
			System.out.println(oneEvents[i].title + " , " + oneEvents[i].when);
		}
		
		for(int j = 0; j < durationNum; j++) {
			System.out.println(durationEvents[j].title + " , " + durationEvents[j].begin + " ~ " + durationEvents[j].end);
		}
		
		for(int k = 0; k < deadlineNum; k++) {
			System.out.println(DeadlineEvents[k].title + " , " + " ~ " + DeadlineEvents[k].until);
		}
	}
}
