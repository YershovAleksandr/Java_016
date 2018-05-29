import java.io.PrintWriter;

public class Main {
    public static void main(String[] args){
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("Hello world ПИДОР Bitch!!");


        char ch[] = {'a', 'b', 'c', 'd', 'e', 'f'};

        String str = new String(ch, 2, 2);

        pw.println("My fucking string equals ~" + str + "~ length " + str.length());

        byte bt[] = {65, 66, 67, 68, 69, 70};

        String str1 = new String(bt);
        pw.println("Str byte = " + str1 + " length " + str1.length());

        String str2 = new String(bt, 2,3);
        pw.println("Str byte = " + str2 + " length " + str2.length());

        String str3 = "wtf";
        pw.println("Str = " + str3 + " length " + str3.length());

        pw.println("WWWW " + "pidor".length());

        String ss = "pidor";
        for (int i = 0; i < ss.length(); i++) {
            pw.println("char at " + i + " = " + ss.charAt(i));
        }

        char cch[] = new char[5];
        ss.getChars(0, 2, cch, 0);

        for (int i = 0; i < 2; i++) {
            pw.println("cch " + cch[i]);
        }


    }
}
