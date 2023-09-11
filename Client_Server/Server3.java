import java.net.*;
import java.io.*;

public class Server3
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Server application is running...");

        ServerSocket ss = new ServerSocket(2100);  //java.net
        System.out.println("Server is running at port no 2100 and waiting for client request");

        Socket s = ss.accept(); //java.net
        System.out.println("Request of client gets accepted");

        PrintStream ps = new PrintStream(s.getOutputStream()); //java.io

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream())); //java.io
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));//java.io
        
        String str1, str2;

        while((str1 = br1.readLine()) != null)
        {
            System.out.println("Client says : "+str1);
            System.out.print("Enter message for client : ");
            str2 = br2.readLine();
            ps.println(str2);
        }
    }
}