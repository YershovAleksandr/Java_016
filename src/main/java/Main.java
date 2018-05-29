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

        //String ss = "pйdor";
        String ss = "ABйCDF";
        for (int i = 0; i < ss.length(); i++) {
            pw.println("char at " + i + " = " + ss.charAt(i));
        }

        char cch[] = new char[6];
        ss.getChars(0, 2, cch, 0);

       // cch = ss.toCharArray();

        for (int i = 0; i < 6; i++) {
            pw.println("cch " + cch[i]);
        }

        byte btt[] = new byte[5];
        btt = ss.getBytes();

        for(byte a : btt) {
            pw.println("bt = " + a);
        }

        String ss1 = "Pidor";
        String ss2 = "PidoRaSS";

        pw.println("result = " + ss1.regionMatches(true, 2, ss2, 2, 3));


        String s = "Now is the time for all good men " +
                    "to come to the aid of their country.";

        pw.println(s);
        pw.println("Indexof(t) = " + s.indexOf('t'));
        pw.println("LastIndexof(t) = " + s.lastIndexOf('t'));
        pw.println("Indexof(t, 10) = " + s.indexOf('t', 10));
        pw.println("LastIndexof(t, 60) = " + s.lastIndexOf('t', 60));



    }
}
