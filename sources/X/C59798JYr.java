package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JYr  reason: case insensitive filesystem */
public abstract class C59798JYr {
    public static final ArrayList A00(List list, int i) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            M1Y m1y = (M1Y) it.next();
            if (m1y.A03 < i) {
                A1C.add(m1y);
            }
        }
        return A1C;
    }
}
