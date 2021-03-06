package domain;

import java.util.ArrayList;

/**
 * 게임 판정 및 결과 출력하는 클래스
 * 
 * @author wschoi8640
 * @version 1.1
 */
public class ResultProcessor {

	private int maxCnt = 0;
	private int maxPos = 0;
	private int curPos = 0;
	private String curName = "";

	/**
	 * 결과를 판정 한후 출력하는 메소드
	 * 진행 상황에서 가장 멀리 간 자동차를 구한 후 공동 우승 판별을 함
	 * 
	 * @param 현재 진행 상황
	 */
	public void showResult(ArrayList<Car> carList) {
		maxPos = getMax(carList);

		for (Car curCar : carList) {
			curPos = curCar.getPosition();
			curName = curCar.getName();
			if ((curPos == maxPos) && (maxCnt == 0)) {
				Printer.print(curName);
				maxCnt = maxCnt + 1;

			} else if ((curPos == maxPos) && (maxCnt != 0)) {
				Printer.print(", " + curName);
				maxCnt = maxCnt + 1;
			}
		}
		Printer.println(Msgs.ShowFinalResult.getMsg());
	}

	/**
	 * 가장 멀리 간 거리를 찾는 메소드
	 * 진행 상황에 저장된 자동차 객체 속성값을 비교
	 * 
	 * @param 현재 진행 상황
	 * @return 가장 먼 거리
	 */
	private int getMax(ArrayList<Car> carList) {
		for (Car curCar : carList) {
			curPos = curCar.getPosition();
			if (curPos > maxPos)
				maxPos = curPos;
		}
		return maxPos;
	}
}
