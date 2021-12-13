package echo.ex03;

public class DigitThread extends Thread{//출장 보내려고 thread 상속함 thread안에 출장보내기 기능 있음//start


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
