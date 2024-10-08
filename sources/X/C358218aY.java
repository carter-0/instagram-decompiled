package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.8aY  reason: invalid class name and case insensitive filesystem */
public abstract class C358218aY {
    public static final Map A00;
    public static final List A01;

    public static final boolean A00(C279284yO r5, Set set) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(set, 1);
        for (Object next : set) {
            0sn r0 = (List) A00.get(r5);
            if (r0 == null) {
                r0 = 0sn.A00;
            }
            if (!r0.contains(next)) {
                return true;
            }
        }
        return false;
    }

    static {
        List singletonList = Collections.singletonList(C358088aL.A0M);
        0qQ.A07(singletonList);
        A01 = singletonList;
        A00 = 0se.A0M(new 0eP(AnonymousClass9QA.A00, singletonList));
    }
}
