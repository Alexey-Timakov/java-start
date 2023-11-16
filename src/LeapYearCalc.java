public class LeapYearCalc {
	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);
		System.out.println(year);
		System.out.println(calcYear(year));
	}	
	
	static int calcYear(int year) {
		int result = year / 4 - year / 100 + year / 400;
		return result;
	}
}