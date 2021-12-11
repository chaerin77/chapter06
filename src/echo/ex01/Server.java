package echo.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("172.30.1.43",10001));//( )안에 객체 생성해서 넣어야함
		//172.30.1.43(본인컴 ip)   10001--포트번호는 개발하는입장에서 정해주는거. 숫자임
	
		System.out.println("<서버시작>");
		System.out.println("===================================");
		System.out.println("[연결을 기다리고 있습니다.]");
		//누가 오기를 기다리는중
		
		Socket socket = serverSocket.accept(); //누가 오면 new socket안해도 소켓이 생김
		
		System.out.println("[클라이언트가 연결되었습니다.]");
		
		//메세지 받기용 스트림1
		InputStream is = socket.getInputStream();//socket이 inputStream갖고있어서 new안해도됨
		InputStreamReader isr = new InputStreamReader(is,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		//메세지 보내기용 스트림2
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		//메세지 받기1
		String msg = br.readLine();
		System.out.println("받은메시지:" + msg);
		
		//메세지 보내기2
		bw.write(msg);//bw의메소드사용
		bw.newLine();
		bw.flush();//공간이 꽉 차지 않아도 보내는것
		
		socket.close();
		serverSocket.close();
		
	}

}
