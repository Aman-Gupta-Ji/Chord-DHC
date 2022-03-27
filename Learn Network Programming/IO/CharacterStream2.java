import java.io.*;
public class CharacterStream2 {
    
    public static void main(String [] args)
    {
        try
        {
            OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("example4.txt"), "ASCII");
            InputStreamReader in = new InputStreamReader(new FileInputStream("example4.txt"));

			System.out.println(out.getEncoding());
            
            //out.write("reading using InputStreamReader");
			
			out.write("こんにちは");
            
            //out.flush(); 
            
            //out.close(); //calls the flush method
            
            //out.write("another string");
            
            out.flush();
            out.close();
            in.close();
           
           
        }
        catch(Exception e)
        {
            System.err.println(e.toString());
        }
    }
}
