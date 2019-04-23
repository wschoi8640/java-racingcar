package domain;

public enum Msgs {
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
