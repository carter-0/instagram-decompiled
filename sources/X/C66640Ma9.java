package X;

import java.util.List;

/* renamed from: X.Ma9  reason: case insensitive filesystem */
public abstract class C66640Ma9 {
    public static final boolean A04(List list, int i, boolean z, boolean z2) {
        0qQ.A0B(list, 3);
        if (A06(list, z, z2)) {
            return true;
        }
        if (z || i != 1) {
            return false;
        }
        return true;
    }

    public static final boolean A05(List list, boolean z) {
        AnonymousClass170 r0;
        0qQ.A0B(list, 1);
        if (z || (r0 = (AnonymousClass170) 00k.A0J(list)) == null || !r0.isRestricted()) {
            return false;
        }
        return true;
    }

    public static final boolean A06(List list, boolean z, boolean z2) {
        0qQ.A0B(list, 2);
        if (z || A05(list, z2)) {
            return true;
        }
        return false;
    }

    public static boolean A00(AnonymousClass2Ep r4) {
        boolean isPending = r4.isPending();
        boolean CUG = r4.CUG();
        return A04(r4.BRZ(), r4.BSK(), isPending, CUG);
    }

    public static final boolean A01(AnonymousClass2Ep r2) {
        if (A00(r2)) {
            if (A05(r2.BRZ(), r2.CUG())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A02(C74516PwB pwB) {
        return A05(pwB.BkC(), pwB.CUG());
    }

    public static boolean A03(N4P n4p) {
        return A06(n4p.A09(), n4p.A0C(), OPx.A00(n4p.A0A));
    }
}
