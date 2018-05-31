import java.io.PrintWriter;

public class StrTo {
    public void run(){
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("Str 2");

        String result = String.join("~", "ЙAlpha", "Beta", "Gamma");
        pw.println("Result " + result);

        pw.println("Wtf " + result.codePointAt(0));

        StringBuffer sb = new StringBuffer(result);

        pw.println("Lenght = " + sb.length() + " Capacity = " + sb.capacity());
        sb.trimToSize();
        pw.println("Lenght = " + sb.length() + " Capacity = " + sb.capacity());
    }
}
