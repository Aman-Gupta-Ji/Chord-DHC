
import java.io.*;

public class CharacterStream3 {
    
    public static void main(String [] args)
    {
        try
        {
            OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("example5.txt"));
            InputStreamReader inp = new InputStreamReader(new FileInputStream("example5.txt"));

            
            out.write("reading using InputStreamReader");
            
            //out.flush(); 
            
            //out.close(); //calls the flush method
            
            //out.write("another string");
            
            out.flush();
            out.close();
            
            int data = inp.read();
             while(data != -1)
            {
                System.out.print((char)data);
                data = inp.read();
            }
            inp.close();
        }
        catch(Exception e)
        {
            System.err.println(e.toString());
        }
    }
}
