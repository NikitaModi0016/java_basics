
public class Enumerated {
	Month month;
	public enum Month{
		JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER;
		
	}
	public Enumerated(Month month) {
		this.month=month;
	}
	public void chooseBirthdayMonth() {
		switch(month) {
		case OCTOBER:
			System.out.println("October is your birthday month");
			break;
		default:
			System.out.println("The typed month is not your birthday month");
		}
	}
	public static void main(String[] args) {
		//traverse enum
		for(Month m:Month.values()) {
			System.out.println(m);
		}
		System.out.println("My birthday month is:"+Month.valueOf("OCTOBER"));
		System.out.println("My birthday month index value :"+Month.valueOf("OCTOBER").ordinal());
		Enumerated nikita=new Enumerated(Month.OCTOBER);
		nikita.chooseBirthdayMonth();
		
		Enumerated newmonth=new Enumerated(Month.NOVEMBER);
		newmonth.chooseBirthdayMonth();
		
		
	}

}
