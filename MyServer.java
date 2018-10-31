
import java.io.*;  
import java.net.*;  
public class MyServer {  
public static void main(String[] args){  
try{  
ServerSocket ss=new ServerSocket(6666);  
Socket s=ss.accept();//establishes connection   
DataInputStream dis=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  


Integer  a=dis.readInt();
Integer b=dis.readInt();  
System.out.println("A= "+a);
System.out.println("B= "+b);
int c=a*b;

dout.writeInt(c);
dout.flush();  
dout.close();

ss.close();  
}catch(Exception e){System.out.println(e);}  
}  
}  


