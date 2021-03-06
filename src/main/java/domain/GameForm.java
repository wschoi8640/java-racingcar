package domain;

import java.util.ArrayList;

/**
 * 게임 진행 단계를 포함하는 클래스
 * 
 * @author wschoi8640
 * @version 1.1
 */
public class GameForm {

	private int totalTrial = 0;
	private int curTrial = 0;
	private GamePlayer gamePlay = new GamePlayer();
	private ResultProcessor resultProcesser = new ResultProcessor();
	private ArrayList<Car> carList = null;

	/**
	 * 게임 정보를  게임에 적용하고 게임을 실행 하는 메소드
	 * 
	 * @param gameSetting 정보
	 */
	public GameForm(String[] gameSetting) {
		totalTrial = Integer.parseInt(gameSetting[gameSetting.length - 1]);
		gamePlay.setGameSetting(gameSetting);

		initGame();
		endGame();
	}

	/**
	 * 게임을 시작하는 메소드
	 * 정해진 횟수만큼 진행을 반복
	 */
	public void initGame() {
		while (curTrial < totalTrial) {
			gamePlay.race(curTrial);
			curTrial = curTrial + 1;
		}
	}

	/**
	 * 종료 후 진행 상황을 판단하는 메소드
	 */
	public void endGame() {
		carList = gamePlay.getCarList();
		resultProcesser.showResult(carList);
	}
}
