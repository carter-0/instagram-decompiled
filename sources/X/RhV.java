package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

public abstract class RhV {
    public static final void A00(AnonymousClass1Px r9, String str, URI uri, 1Fn[] r12) {
        0qQ.A0B(r12, 2);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("curl ");
        A1A.append("-X ");
        A1A.append(str);
        A1A.append(" ");
        for (1Fn A10 : r12) {
            A1A.append("--header \"");
            String A0g = 00p.A0g(DbT.A10(A10), "\"", "\\\"", false);
            int length = A0g.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                boolean A13 = Dbc.A13(A0g, i2);
                if (z) {
                    if (!A13) {
                        break;
                    }
                    length--;
                } else if (!A13) {
                    z = true;
                } else {
                    i++;
                }
            }
            A1A.append(Dba.A0c(A0g, length, i));
            A1A.append("\" ");
        }
        A1A.append("\"");
        A1A.append(uri);
        A1A.append("\"");
        if (r9 != null) {
            long contentLength = r9.getContentLength();
            if (0 >= contentLength || contentLength >= 1024) {
                A1A.append(" [TOO MUCH DATA TO INCLUDE]");
            } else {
                ByteArrayOutputStream A0b = Pxe.A0b();
                try {
                    InputStream E15 = r9.E15();
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = E15.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        A0b.write(bArr, 0, read);
                    }
                    A0b.flush();
                } catch (IOException unused) {
                }
                Pxg.A1P(" --data-ascii \"", DbT.A10(A0b), "\"", A1A);
            }
        }
        0qQ.A07(A1A.toString());
    }
}
