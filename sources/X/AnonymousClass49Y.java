package X;

import java.util.ArrayList;

/* renamed from: X.49Y  reason: invalid class name */
public final class AnonymousClass49Y implements AnonymousClass2oY {
    public final C254233s9 DRS(C254233s9 r3, C62320sa r4) {
        Object invoke = r4.invoke();
        if (r3 == null) {
            return (C254233s9) invoke;
        }
        C254233s9 r1 = (C254233s9) invoke;
        if (r1 == null) {
            return r3;
        }
        C254243sA r32 = (C254243sA) r3;
        if (!(r1 instanceof C254243sA)) {
            return r32;
        }
        ArrayList arrayList = new ArrayList();
        r32.AU1(arrayList);
        ((C254243sA) r1).AU1(arrayList);
        return new IW1(arrayList);
    }
}
