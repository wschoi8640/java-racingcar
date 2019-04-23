package domain;

/**
 * 유효성 검사를 목적으로 하는 클래스
 * 
 * @author wschoi8640
 * @version 1.2
 */
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
				Printer.println(Msgs.CarNameLengthErr.getMsg());
				isValid = false;
				return isValid;
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
			Printer.println(Msgs.NotEnoughCarErr.getMsg());
			isValid = false;
			return isValid;
		}
		return isValid;
	}
	
	public static boolean isValidTrialNum(int trialNum) {
		boolean isValid = true;
		if (trialNum <= 0) {
			isValid = false;
			return isValid;
		}
		return isValid;
	}
}
