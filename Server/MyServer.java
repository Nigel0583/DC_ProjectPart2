// myServer.java
import com.distinct.rpc.*; // RPC libraries

import java.io.*;

import static javax.swing.JOptionPane.*;

public class MyServer extends LOGPROGServer
{
	public static void main(String[] args)
	{
		try 
		{	new MyServer(); // creates an instance of the Server stub
 	   } 
    	catch (RPCError e) 
		{	System.out.println(e.getMessage()); 
    	} 
	}
 
	public MyServer() throws RPCError 
	{	super(); 
	}
 	// override the echo_1 method from the stub – where it does nothing
	public String Login1(String a) {
        System.out.println(a +" has logged in");
        try (PrintWriter out = new PrintWriter(a+".txt")) {
            out.println(a);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return a;
    }
}
