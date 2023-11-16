
public class PowerOfTwo {
	public static void main(String[] args) {
		boolean result = checkIsIntPowerOfTwo(31);
		System.out.print(result);
	}
	
	static boolean checkIsIntPowerOfTwo(int value) {
		int absValue = Math.abs(value);

		return (absValue & absValue - 1) == 0 ? true: false;
	}
}
