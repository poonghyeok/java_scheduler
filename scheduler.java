package ch3_2;

import java.util.Scanner;

interface myEvent{
	String getTitle();
	String getDate();
	boolean amI(ownDate date);
}


public class scheduler {

	public void mainProcess() {

		myEvent[] myEvents = new myEvent[100];
		int eventNum = 0;

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
					myEvents[eventNum] = new OneDayEvent(Title, Date);
					eventNum++;
					
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
					myEvents[eventNum] = new DurationEvent(Title, beginDate, endDate);
					eventNum++;
					
				}else if(kindofEvent.equals("deadline")) {
					System.out.println("add deadline event on list ");
					
					String untilDate;
					String Title;
					
					System.out.print("until : ");
					untilDate = sc.next();
					System.out.print("title : ");
					Title = sc.next();
					
					//About Until Date. 
					myEvents[eventNum] = new DeadlineEvent(Title, untilDate);
					eventNum++;
					
				}else if(kindofEvent.equals("periodic")) {
					System.out.println("add periodic event on list ");
					
					String startDate;
					String title;
					String period;
					
					System.out.print("start Date : ");
					startDate = sc.next();
					System.out.println("period : ");
					period = sc.next();
					System.out.print("title : ");
					title = sc.next();
					
					//About Until Date. 
					myEvents[eventNum] = new PeriodicEvent(startDate, period, title);
					eventNum++;
					
				}else {
					System.out.println("cannot find the kind of event..!");
				}
			}else if(cmd.equals("list")) {
				allList(eventNum, myEvents);
			}else if(cmd.equals("show")) {
				
				ownDate showDate = new ownDate(sc.next());
				
				for(int i = 0; i < eventNum; i++) {
					if(myEvents[i].amI(showDate)) {
						System.out.println(myEvents[i].getTitle() + "," + myEvents[i].getDate());
					}
				}
				
			}else if(cmd.equals("exit")) {
				System.out.println("system exit.");
				sc.close();
				System.exit(0);
			}else {
				System.out.println("something wrong..! try again..!");
			}
		}
	
	}
	
	public void allList(int eventNum, myEvent[] myEvents) {
		//print OnedayEvents array elements.
		for(int i = 0; i < eventNum; i++) {
			System.out.println(myEvents[i].getTitle() + " , " + myEvents[i].getDate());
		}
	}
	public static void main(String[] args) {

		scheduler schedule = new scheduler();
		schedule.mainProcess();
		
	}
	


}
