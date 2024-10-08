package X;

import android.content.res.Resources;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.Rin  reason: case insensitive filesystem */
public abstract class C9874Rin {
    public static final String A00(Resources resources, int i) {
        0qQ.A0B(resources, 0);
        InputStream openRawResource = resources.openRawResource(i);
        0qQ.A07(openRawResource);
        BufferedReader A0X = Pxg.A0X(openRawResource);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        while (true) {
            try {
                String readLine = A0X.readLine();
                if (readLine != null) {
                    A1A.append(readLine);
                    A1A.append("\n");
                } else {
                    A0X.close();
                    return DbT.A10(A1A);
                }
            } catch (IOException unused) {
                throw AnonymousClass7TE.A15("failed to read raw resource");
            }
        }
    }
}
