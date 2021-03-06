package echo.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException{

		Socket socket = new Socket();
		
		System.out.println("<클라이언트 시작>");
		System.out.println("=================================");
		
		System.out.println("[서버에 연결을 요청합니다.]");
		
		socket.connect(new InetSocketAddress("192.168.0.203",10001));
		                               //내가 접속할 서버의 ip, 포트번호
									   //집 ip172.30.1.43
	
	    System.out.println("[서버에 연결되었습니다.]");
	    
	    //메세지 보내기 스트림 1
	    OutputStream os = socket.getOutputStream();//주스트림
	    OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8"); //보조스트림. 보조스트림은 섞어쓰기 잘 안함
	    BufferedWriter bw = new BufferedWriter(osw);
	    
	    //메세지 받기용 스트림2
	    InputStream is = socket.getInputStream();
	    InputStreamReader isr = new InputStreamReader(is,"UTF-8");
	    BufferedReader br = new BufferedReader(isr);
	    
	    //메세지 보내기1
	    String str = "안녕하세요";
	    bw.write(str);
	    bw.newLine();
	    bw.flush();
	    
	    //메세지 받기2
	    String reMsg = br.readLine();
	    System.out.println("server:[" + reMsg + "]");
	    
	    
	    bw.close();
	    socket.close();
	}

}
