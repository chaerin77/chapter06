package echo.ex06;

public class DigitImpl implements Runnable {//이미 만들어져있는 runnable인터페이스

	@Override
	public void run() {//숫자출력
		
		for(int cnt=0; cnt<=10; cnt++){
			System.out.println(cnt);
		    try {
				Thread.sleep(1000);
		    }catch (InterruptedException e) {
		    	e.printStackTrace();
		    }
		}
	}
	
	

}
