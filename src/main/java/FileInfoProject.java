
import java.io.*;
import java.util.Date;

public class FileInfoProject {
    
    public static void main(String[] args)
    {
        String str;
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter filename: ");
            str =br.readLine();
            
            File f;
            f = new File(str);
            if(f.exists())
            {
                String dname = f.getParent();
                System.out.println("Directory name: "+ dname);
                String fname = f.getName();
                System.out.println("File name: "+ fname);
                String abspath = f.getAbsolutePath();
                System.out.println("Full name: "+ abspath);
                
                long size = f.length();
                System.out.println("Size: "+ size);
                String ext;
                int dot = str.lastIndexOf(" . ");
                ext= str.substring(dot);
                System.out.println("Extension= "+ ext);
                System.out.println("Last Modified= "+ new Date(f.lastModified()));
            }
        }
            catch(IOException e)
                    {
                    System.out.println("Error in input");
                    }
        
    }
}
