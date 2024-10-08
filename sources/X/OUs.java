package X;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class OUs {
    public static final OUs A00 = new Object();
    public static final HashMap A01 = AnonymousClass7TE.A1E();
    public static final HashMap A02 = AnonymousClass7TE.A1E();
    public static final 01W A03 = new 01W();

    public final synchronized void A00(String str, Throwable th) {
        C69678Nq0 nq0 = (C69678Nq0) A02.remove(str);
        if (nq0 != null) {
            nq0.A04(th);
        }
        01W r5 = A03;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : r5) {
            if (00p.A0k((String) next, 002.A0C(str, '$'), false)) {
                A1C.add(next);
            }
        }
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            Activity A002 = OUl.A00.A00(A18);
            if (A002 != null) {
                A002.finish();
            }
            r5.remove(A18);
        }
    }
}
