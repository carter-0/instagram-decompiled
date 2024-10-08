package X;

import java.util.Set;

/* renamed from: X.8Xj  reason: invalid class name and case insensitive filesystem */
public abstract class C357308Xj {
    public static final boolean A00(C357638Yz r7, AnonymousClass8DD r8, C353508Hx r9) {
        boolean z;
        AnonymousClass87G A0D;
        0qQ.A0B(r7, 0);
        0qQ.A0B(r9, 2);
        if (r8 == null || (r8.A0D() != null && ((A0D = r8.A0D()) == null || A0D.A04 != AnonymousClass87I.EMPTY))) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = false;
        if (((Set) r7.A07.A00).size() < 2) {
            z2 = true;
        }
        boolean CYO = r9.CYO();
        boolean z3 = true;
        if (r9.AuT().A00.ordinal() == 0) {
            z3 = false;
        }
        if (z || z2 || z3 || CYO) {
            return true;
        }
        return false;
    }
}
