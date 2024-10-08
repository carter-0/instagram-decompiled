package X;

/* renamed from: X.74e  reason: invalid class name and case insensitive filesystem */
public abstract class C3257974e {
    public static final boolean A00(C254703su r3, AnonymousClass48T r4, String str, boolean z) {
        boolean z2 = r3.A2P;
        if (!AnonymousClass48T.A00(r3, r4, true)) {
            return false;
        }
        if (z2) {
            if (!z) {
                if (str.equals(r3.A1u) || !AnonymousClass48T.A00(r3, r4, false)) {
                    return false;
                }
                return true;
            }
        } else if (z) {
            if (!r4.A01(r3)) {
                return true;
            }
            return false;
        }
        return AnonymousClass48T.A00(r3, r4, false);
    }
}
