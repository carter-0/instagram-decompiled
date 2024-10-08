package X;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LLw  reason: case insensitive filesystem */
public abstract class C64078LLw {
    public static final Comparator A00;
    public static final Comparator A01;

    public static final List A00(1UV r7, AnonymousClass8XW r8) {
        0qQ.A0B(r8, 0);
        Comparator comparator = A01;
        0qQ.A0B(comparator, 2);
        ArrayList A04 = r8.A04();
        ArrayList A05 = r8.A05();
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A04.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (r7.apply(next)) {
                A1C.add(next);
            }
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator it2 = A05.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (r7.apply(next2)) {
                A1C2.add(next2);
            }
        }
        return 00k.A0g(00k.A0S(A1C2, A1C), comparator);
    }

    static {
        Integer A0j = C51967G9n.A0j();
        A01 = new MAR(0sr.A1P(new Integer[]{A0j, -2, -3, -10, -4, -6, -7, -8, -5, -9}));
        A00 = new MAR(0sr.A1P(new Integer[]{A0j, -2, -3, -4, -9, -10, -5, -6, -7, -8}));
    }
}
