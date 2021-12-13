package echo.ex05;

public class DigitRunableImpl implements Runnable {
	
	@Override
	public void run() {
		
		for(int cnt=0; cnt<=10; cnt++){//하나찍고 잠깐쉬도록 인위적으로 조작해보기
			System.out.println(cnt);
		    try {
				Thread.sleep(1000);//텀 있음
		    }catch (InterruptedException e) {
		    	e.printStackTrace();
		    }
		}
		
	}
	
}
