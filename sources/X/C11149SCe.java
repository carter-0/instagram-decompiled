package X;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.SCe  reason: case insensitive filesystem */
public abstract class C11149SCe {
    public static SparseArray A00 = Pxe.A0L();
    public static HashMap A01;

    public static int A00(RE0 re0) {
        Number number = (Number) A01.get(re0);
        if (number != null) {
            return number.intValue();
        }
        throw C66582MXn.A0k(re0, "PriorityMapping is missing known Priority value ", AnonymousClass7TE.A1A());
    }

    static {
        HashMap A1E = AnonymousClass7TE.A1E();
        A01 = A1E;
        C66581MXm.A1S(RE0.DEFAULT, A1E, 0);
        C66581MXm.A1S(RE0.VERY_LOW, A01, 1);
        C66581MXm.A1S(RE0.HIGHEST, A01, 2);
        Iterator A0u = Pxf.A0u(A01);
        while (A0u.hasNext()) {
            Object next = A0u.next();
            A00.append(AnonymousClass7TE.A0M(A01.get(next)), next);
        }
    }
}
