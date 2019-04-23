package domain;

public enum Msgs {
	CarNameLengthErr("자동차 이름은 5자 이하로 입력해야 합니다.");
	
	String msg = "";
	Msgs(String msg){
		this.msg = msg;
	}
	
	String getMsg(){
		return msg; 
	}
}
