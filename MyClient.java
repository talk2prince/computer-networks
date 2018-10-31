import java.io.*;  
import java.net.*;  
import java.util.*;
public class MyClient {  
public static void main(String[] args) {  
try{      
Socket s=new Socket("localhost",6666);  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
DataInputStream dis=new DataInputStream(s.getInputStream());

Scanner s1=new Scanner(System.in);

System.out.println("Enter the first number:");
int a=s1.nextInt();

System.out.println("Enter the second number:");
int b=s1.nextInt();

dout.writeInt(a);
dout.writeInt(b);



 int mul=dis.readInt();
 System.out.println("Multiplication is is:"+mul);

 dout.flush();  

 dout.close();
 s.close();  
}catch(Exception e){System.out.println(e);}  
}  
}  

