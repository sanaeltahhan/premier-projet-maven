package main.java.dev;
import com.github.lalyos.jfiglet.FigletFont;
import java.io.IOException;


/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) throws IOException
    {
        //System.out.println( "Hello World!" );

        // using default font standard.flf, obtained from maven artifact
        String asciiArt1 = FigletFont.convertOneLine("Hello World");
        System.out.println(asciiArt1);
    }
}
