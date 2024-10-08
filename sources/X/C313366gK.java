package X;

import java.util.HashMap;

/* renamed from: X.6gK  reason: invalid class name and case insensitive filesystem */
public abstract class C313366gK {
    public static final C313376gL A00(C229382nI r2) {
        0qQ.A0B(r2, 0);
        HashMap hashMap = C313376gL.A06;
        C313376gL r0 = (C313376gL) hashMap.get(r2);
        if (r0 != null) {
            return r0;
        }
        C313376gL r02 = new C313376gL(r2);
        hashMap.put(r2, r02);
        return r02;
    }
}
