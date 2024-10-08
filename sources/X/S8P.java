package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;

public abstract class S8P {
    public static void A01(StringBuilder sb, Object obj) {
        char[] charArray = obj.toString().toCharArray();
        sb.append(charArray, 0, Math.min(charArray.length, 100 - sb.length()));
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Throwable, X.1bF, java.io.IOException] */
    public static void A00(16F r6, Class cls, Exception exc) {
        String str;
        try {
            Object A1M = r6.A1M();
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("current token: ");
            A1A.append(r6.A1P());
            A1A.append("\n");
            if (A1M instanceof InputStream) {
                ByteArrayOutputStream A0b = Pxe.A0b();
                r6.A1G(A0b);
                A0b.flush();
                A01(A1A, A0b);
                A0b.close();
                InputStream inputStream = (InputStream) A1M;
                while (true) {
                    int read = inputStream.read();
                    if (read == -1 || A1A.length() >= 100) {
                        break;
                    }
                    A1A.append((char) read);
                }
            } else if (A1M instanceof Reader) {
                StringWriter stringWriter = new StringWriter();
                r6.A0f(stringWriter);
                stringWriter.flush();
                A01(A1A, stringWriter);
                stringWriter.close();
                Reader reader = (Reader) A1M;
                while (true) {
                    int read2 = reader.read();
                    if (read2 == -1 || A1A.length() >= 100) {
                        reader.close();
                    } else {
                        A1A.append((char) read2);
                    }
                }
                reader.close();
            } else if (A1M == null) {
                StringWriter stringWriter2 = new StringWriter();
                r6.A0f(stringWriter2);
                stringWriter2.flush();
                A01(A1A, stringWriter2);
                stringWriter2.close();
            }
            if (A1A.length() == 100) {
                A1A.append("...");
            }
            str = A1A.toString();
        } catch (Exception unused) {
            str = "failed to get parser text";
        }
        String A0u = 002.A0u("Failed to deserialize to instance ", cls.getSimpleName(), "\n", str);
        C12837T9j A1H = r6.A1H();
        ? iOException = new IOException(A0u, exc);
        iOException.A00 = A1H;
        throw iOException;
    }
}
