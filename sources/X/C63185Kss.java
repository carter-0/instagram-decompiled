package X;

import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Kss  reason: case insensitive filesystem */
public abstract class C63185Kss {
    public static final String A00(List list) {
        StringWriter A0v = JTO.A0v();
        17W A0e = C51970G9q.A0e(A0v);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LIP.A00(A0e, (C61015JvF) it.next());
        }
        return JTS.A0k(A0e, A0v);
    }
}
