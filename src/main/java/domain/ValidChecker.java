package domain;

/**
 * 유효성 검사를 목적으로 하는 클래스
 * 
 * @author wschoi8640
 * @version 1.0
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
				Printer.print(Msgs.CarNameLengthErr.getMsg());
				isValid = false;
				Printer.print(carName);
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
			Printer.print(Msgs.NotEnoughCarErr.getMsg());
			isValid = false;
			return isValid;
		}
		return isValid;
	}
}
