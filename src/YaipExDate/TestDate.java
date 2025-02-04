package YaipExDate;

public class TestDate {
	public static void main(String[] args) {
		Date d1 = new Date(5, 8, 2014);
		System.out.println(d1);
		System.out.println(d1.getYear());
		d1.setMonth(12);
		System.out.println(d1.getMonth());
		d1.setDay(24, 2, 2005);
		System.out.println(d1);
	}
	

}
