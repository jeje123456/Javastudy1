package custom_exception;

import custom_exception.exceptions.TempOutOfRangeException;
import custom_exception.exceptions.TempTooHighException;
import custom_exception.exceptions.TempTooLowException;

public class Thermostat {
	
	//예외처리 throws는 해당 예외처리를 이 메소드를 호출할 때 처리하도록 함
	public void setTemperature(double temperature) throws TempOutOfRangeException {
		
		setMachinTemperature(temperature);
		//오류눌러서 메소드문 작성
		
		System.out.println("온도세팅 : " + temperature);
	}

	private void setMachinTemperature(double temperature) throws TempOutOfRangeException {
/*		if(temperature < 0 || temperature > 35) {
			throw new TempOutOfRangeException("온도가 비정상 입니다.");
			//Exception을 TempOutOfRangeException으로 바꾸고
			//오류 눌러서 모두 throws TempOutOfRangeException로 변경
		} */
		if(temperature < 0) {
			throw new TempTooLowException("온도가 너무 낮습니다.");
		}
		else if(temperature >35) {
			throw new TempTooHighException("온도가 너무 높습니다.");
		}
	}
}