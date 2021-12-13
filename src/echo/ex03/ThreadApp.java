package echo.ex03;

public class ThreadApp {

	public static void main(String[] args) throws InterruptedException{

		Thread thread = new DigitThread();//시야 Thread
		thread.start();//start는 준비가 다 되면 DigitThread안의 run을 실행시킴
	    //출장보내고 여기서는 여기서 할일 시작함 A부터찍기
		for(char ch='A'; ch<='Z'; ch++) {//코드값 갖고있어서 가능
			System.out.println(ch);
			Thread.sleep(1000);//스태틱으로 올라가있음
		    //같은 컴이라도 그때그때 찍히는 순서 달라질 수 있다
		}
	}

}
