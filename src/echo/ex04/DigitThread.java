package echo.ex04;

public class DigitThread extends Thread{
	
	@Override
	public void run() {//이거 꼭써야함 App파일에서 .start해줬을때 run메소드실행되도록

		for(char ch ='A'; ch<='Z'; ch++) {
			System.out.println(ch);
		}
	}
	
	
}

