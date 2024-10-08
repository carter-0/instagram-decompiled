package X;

import java.io.RandomAccessFile;
import java.util.LinkedList;
import java.util.regex.Pattern;

public abstract class SCK {
    public static final Pattern A00 = Pattern.compile("<rdf:li>\\d{10,}</rdf:li>");

    public static void A00(String str) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(AnonymousClass7TE.A0t(str), "r");
            LinkedList<SEK> A1A = Pxe.A1A();
            randomAccessFile.seek(0);
            for (SEK A002 = SEK.A00(randomAccessFile); A002 != null; A002 = SEK.A00(randomAccessFile)) {
                if (new String(A002.A01).equals("moov") || new String(A002.A01).equals("uuid")) {
                    A1A.add(A002);
                }
            }
            for (SEK sek : A1A) {
                randomAccessFile.seek(sek.A00 + 8);
            }
        } catch (Exception unused) {
        }
    }
}
