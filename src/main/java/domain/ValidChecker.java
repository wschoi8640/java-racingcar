package domain;

public class ValidChecker {
	
	/**
	 * 차 이름의 유효성을 확인하는 메소드
	 * 
	 * @param 차 이름 배열
	 * @return isValid
	 */
	public static boolean isValidCarName(String[] carNameArr) {
		boolean isValid = true;
		for (String carName : carNameArr) {
			if ((carName.length() > 5) || carName.equals("")) {
				fixAndPrint(Msgs.CarNameLengthErr.getMsg());
				isValid = false;
			}
		}
		return isValid;
	}
	
	
	/**
	 * 차 길이의 유효성을 확인하는 메소드
	 * 
	 * @param 차 이름 배열
	 * @return isValid
	 */
	public static boolean isValidCarNum(String[] carNameArr) {
		boolean isValid = true;
		if(carNameArr.length < 2) {
			fixAndPrint(Msgs.NotEnoughCarErr.getMsg());
			isValid = false;
		}
		return isValid;
	}
	
	public static void fixAndPrint(String msg) {
		System.out.println(msg);
	}
}
