package X;

import java.lang.ref.SoftReference;

/* renamed from: X.8gC  reason: invalid class name and case insensitive filesystem */
public final class C361418gC implements C360088dy {
    public final 0sP A00;
    public final C361428gD A01 = new C361428gD();

    public final C255463uA AXN(C62230ry r5) {
        Object obj = this.A01.get(AnonymousClass2YU.A00(r5));
        0qQ.A07(obj);
        C361448gF r3 = (C361448gF) obj;
        Object obj2 = r3.reference.get();
        if (obj2 == null) {
            C361468gH r1 = new C361468gH(r5, this);
            synchronized (r3) {
                obj2 = r3.reference.get();
                if (obj2 == null) {
                    obj2 = r1.invoke();
                    r3.reference = new SoftReference(obj2);
                }
            }
        }
        return ((C360568en) obj2).A00;
    }

    public C361418gC(0sP r2) {
        this.A00 = r2;
    }
}
