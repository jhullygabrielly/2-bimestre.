import java.io.File;
import javax.swing.JOptionPane;

public class FileDemonstration
{
    public static void main( String[] args)
    {
        String input = JOptionPane.showInputDialog("Enter file or directory name");
        analyzePath(input);
    }
    
    public static void analyzePath( String path)
    {
        File name = new File(path);
        if (name.exists())
        {
            JOptionPane.showMessageDialog(null,
                String.format("%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
                name.getName(), "exists",
                (name.isFile()? "is a file" : "is not a file"),
                (name.isDirectory()? "is a directory" :
                    "is not a directory"),
                (name.isAbsolute() ? "is absolute path" :
                    "is not absolute path"), "Last modifield:",
                name.lastModified(), "Length:", name.length(),
                "Path:", name.getPath(), "Absolute path",
                name.getAbsolutePath(), "Parent:", name.getParent()),
                "Olá",
                JOptionPane.PLAIN_MESSAGE
            );
                
            if (name.isDirectory())
            {
                String[] directory = name.list();
                JOptionPane.showMessageDialog(null,directory, "Directory contents:", JOptionPane.PLAIN_MESSAGE);
            }         
        }
        else
        {
            JOptionPane.showMessageDialog(null, String.format("%s %s", path, "does not exist."), "Path", JOptionPane.PLAIN_MESSAGE);
        }
    }        
}