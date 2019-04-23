package domain;

import java.util.Scanner;

/**
 * 자동차들의 이름들을 입력받는 클래스
 * 
 * @author wschoi8640
 * @version 1.2
 */
public class CarNameReceiver {

	private Scanner sc = null;
	private String carNames = "";
	private String[] carNameArr = null;
	
	/**
	 * 차 이름을 한꺼번에 입력 받는 메소드
	 * 
	 * @return 차 이름 배열
	 */
	public String[] readCarNames() {
		sc = new Scanner(System.in);
		System.out.println(Msgs.CarNameReceive.getMsg());
		carNames = sc.nextLine();

		return namesToArr(carNames);
	}

	/**
	 * 문자열을 잘라 배열로 만드는 메소드
	 * 
	 * @param 입력받은 차 이름 문자열
	 * @return 차 이름 배열
	 */
	public String[] namesToArr(String carNames) {
		carNameArr = carNames.split(",");
		carNameArr = closeEmptySpace(carNameArr);
		if(!ValidChecker.isValidCarName(carNameArr) || !ValidChecker.isValidCarNum(carNameArr)) {
			readCarNames();
		}
		return carNameArr;
	}

	/**
	 * 띄어쓰기 지워주는 메소드
	 * 
	 * @param nameArr
	 * @return nameArr
	 */
	private String[] closeEmptySpace(String[] nameArr) {
		for(int i = 0; i < nameArr.length; i++) {
			nameArr[i] = nameArr[i].replaceAll(" ", "");
		}
		return nameArr;
	}
}
