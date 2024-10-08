package X;

import java.lang.ref.WeakReference;

/* renamed from: X.7kg  reason: invalid class name and case insensitive filesystem */
public final class C340087kg {
    public final WeakReference A00;

    public static final 0wc A00(C340087kg r2, String str, boolean z) {
        0kJ r0;
        0lg r22 = (0lg) r2.A00.get();
        0xG r1 = null;
        if (r22 == null) {
            return null;
        }
        if (str != null) {
            r1 = new 0xG(str);
        }
        if (z) {
            r0 = 0kJ.A05;
        } else {
            r0 = 0kJ.A02;
        }
        return AnonymousClass0kN.A00(r1, r0, r22);
    }

    public C340087kg(0lg r2) {
        this.A00 = new WeakReference(r2);
    }
}
