package domain;
/**
 * 메시지 상수를 보관하는 Enum 클래스
 * 
 * @author wschoi8640
 * @version 1.1
 */
public enum Msgs {
	
	InputTypeErr("자연수를 입력해야 합니다"),
	TrialNumReceive("시도할 횟수는 몇회인가요?"),
	ShowFinalResult("가 최종 우승했습니다."),
	ShowGameResult("실행 결과"),
	CarNameReceive("경주할 자동차 이름을 입력하세요. (이름은 쉼표 (,)로 구분, 띄어쓰기 인정안함)"),
	NotEnoughCarErr("자동차 이름을 한 대 이상 입력해야 합니다."),
	CarNameLengthErr("자동차 이름은 5자 이하로 입력해야 합니다.");
	
	String msg = "";
	Msgs(String msg){
		this.msg = msg;
	}
	
	String getMsg(){
		return msg; 
	}
}
