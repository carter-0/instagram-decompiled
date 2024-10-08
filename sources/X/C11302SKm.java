package X;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.SKm  reason: case insensitive filesystem */
public abstract class C11302SKm {
    public static final int A00(Throwable th) {
        if (th instanceof C13219TQk) {
            return ((C13219TQk) th).A00;
        }
        if (th instanceof C8286QnS) {
            return ((C8286QnS) th).A00;
        }
        return 0;
    }

    public static final String A01(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
            return DbT.A10(stringWriter.getBuffer());
        } finally {
            try {
                stringWriter.close();
                printWriter.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void A02(AbstractCollection abstractCollection, Iterator it) {
        String str;
        Throwable th = (Throwable) it.next();
        int A00 = A00(th);
        if ((th instanceof C13219TQk) || (th instanceof C8286QnS)) {
            str = ((C13219TQk) th).A02;
        } else if (th == null || (str = th.getMessage()) == null) {
            str = "Unknown error type";
        }
        abstractCollection.add(002.A04(A00, ", ", str));
    }
}
