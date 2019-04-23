package domain;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;
/**
 * 게임 진행 및 진행 상황 출력하는 클래스
 * 
 * @author wschoi8640
 * @version 1.1
 */
public class GamePlayer {

	private ArrayList<Car> carList = new ArrayList<>();
	private int curTrial = 0;

	/**
	 * 게임 설정을 가져와 게임에 적용하는 메소드
	 * 자동차 객체를 생성하고 리스트에 저장
	 * 
	 * @param gameSetting 정보
	 */
	public void setGameSetting(String[] gameSetting) {
		for (int i = 0; i < gameSetting.length - 1; i++) {
			carList.add(new Car(gameSetting[i]));
		}
	}

	/**
	 * 각 자동차가 전진 혹은 정지할지 정하고 움직이는 메소드
	 * 생성해놓은 자동차 객체의 위치를 변경
	 */
	public void race() {
		for (Car curCar : carList) {
			int key = (int) (Math.random() * 9);
			if (key > 3) {
				curCar.move();
			}
		}
		printResult(carList);
		curTrial = curTrial + 1;
	}

	/**
	 * 게임 진행 상황을 출력하는 메소드
	 * 진행상황을 입력받아 진행이 끝날때 마다 실행됨
	 * 
	 * @param 진행상황
	 */
	private void printResult(ArrayList<Car> carList) {
		System.out.println();
		if (curTrial == 0)
			Printer.print(Msgs.ShowGameResult.getMsg());
		for (Car curCar : carList) {
			Printer.print(curCar.getName() + " : ");
			Printer.print(StringUtils.repeat("-", curCar.getPosition()));
		}
	}

	public ArrayList<Car> getCarList() {
		return carList;
	}
}