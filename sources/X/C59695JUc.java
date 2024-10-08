package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JUc  reason: case insensitive filesystem */
public abstract class C59695JUc {
    public static final String A00(List list) {
        if (list == null) {
            return "[]";
        }
        try {
            StringWriter A0v = JTO.A0v();
            17W A0e = C51970G9q.A0e(A0v);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                W3F.A05(A0e, (X5I) it.next());
            }
            return JTS.A0k(A0e, A0v);
        } catch (IOException unused) {
            return "[]";
        }
    }

    public static final List A01(String str) {
        if (str == null) {
            return 0sn.A00;
        }
        try {
            return (List) 16P.A01(16P.A00(str), C59696JUd.A00);
        } catch (IOException unused) {
            return 0sn.A00;
        }
    }
}
