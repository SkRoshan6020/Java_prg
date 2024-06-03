import java.io.*;

class FOS
{
      public static void main(String[] args) {
            
            try
            {
                  Writer w = new FileWriter("File.txt");
                  String content = "Roshan Shreekumar";

                  w.write(content);
                  w.close();
                  System.out.println("Done");
            }

            catch(IOException e)
            {
                  e.printStackTrace();
            }
      }
}