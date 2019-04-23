package domain;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 진행 횟수를 입력받는 클래스
 * 
 * @author wschoi8640
 * @version 1.2
 */
public class TrialNumReceiver {

	private int trialNum = 0;
	private Scanner sc = null;

	/**
	 * 게임 진행 횟수를 입력 받는 메소드
	 * 
	 * @return 진행 횟수
	 */
	public int readTrialNum() {
		sc = new Scanner(System.in);
		Printer.println(Msgs.TrialNumReceive.getMsg());
		try {
			trialNum = sc.nextInt();
		} catch (InputMismatchException e) {
			Printer.println(Msgs.InputTypeErr.getMsg());
			readTrialNum();
		}

		checkValid(trialNum);
		return trialNum;
	}

	/**
	 * 진행횟수의 유효성을 확인하는 메소드 유효성 위반시 입력메소드 호출
	 * 
	 * @param 진행횟수
	 */
	public void checkValid(int trialNum) {
		if (!ValidChecker.isValidTrialNum(trialNum)) {
			readTrialNum();
		}
	}
}
