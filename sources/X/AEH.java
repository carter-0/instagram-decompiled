package X;

import java.util.ArrayList;
import java.util.List;

public abstract class AEH {
    public static final AnonymousClass831 A00(AnonymousClass831 r5, int i) {
        AnonymousClass51M r3;
        AnonymousClass51M r1;
        AnonymousClass51O A04 = r5.A04(i);
        if (A04 instanceof AnonymousClass51M) {
            r3 = (AnonymousClass51M) A04;
        } else {
            r3 = null;
        }
        AnonymousClass51O A042 = r5.A04(i + 1);
        if (A042 instanceof AnonymousClass51M) {
            r1 = (AnonymousClass51M) A042;
        } else {
            r1 = null;
        }
        if (r3 == null || r3.A0M == null) {
            if (r1 != null) {
                r1.A0L = null;
            }
        } else if (!A02(r5, i)) {
            r3.A0M = null;
            if (r1 != null) {
                r1.A0L = null;
            }
        } else if (r1 != null) {
            r1.A0L = r3.A0M;
        }
        List list = r5.A02;
        boolean z = r5.A03;
        0qQ.A0B(list, 0);
        return new AnonymousClass831(list, z);
    }

    public static final AnonymousClass831 A01(AnonymousClass831 r7, String str, int i) {
        AnonymousClass51M r3;
        AnonymousClass51M r2;
        AnonymousClass51M r1;
        AnonymousClass51M r12;
        0qQ.A0B(r7, 0);
        int i2 = i + 1;
        AnonymousClass51O A04 = r7.A04(i2);
        if (!(A04 instanceof AnonymousClass51M) || (r12 = (AnonymousClass51M) A04) == null) {
            r3 = null;
        } else {
            r3 = AnonymousClass51M.A00((GTT) null, r12, (AnonymousClass51R) null, 0.0f, 0, 0, 0, 0, 1073741823);
        }
        AnonymousClass51O A042 = r7.A04(i);
        if (!(A042 instanceof AnonymousClass51M) || (r1 = (AnonymousClass51M) A042) == null) {
            r2 = null;
        } else {
            r2 = AnonymousClass51M.A00((GTT) null, r1, (AnonymousClass51R) null, 0.0f, 0, 0, 0, 0, 1073741823);
        }
        ArrayList A0U = 00k.A0U(r7.A05());
        boolean A02 = A02(r7, i);
        if (r3 != null) {
            if (A02) {
                r3.A0L = str;
            } else {
                r3.A0L = null;
            }
            A0U.set(i2, r3);
        }
        if (r2 != null) {
            if (A02) {
                r2.A0M = str;
            } else {
                r2.A0M = null;
            }
            A0U.set(i, r2);
        }
        return new AnonymousClass831(A0U, false);
    }

    public static final boolean A02(AnonymousClass831 r4, int i) {
        AnonymousClass51M r2;
        AnonymousClass51M r1;
        0qQ.A0B(r4, 0);
        AnonymousClass51O A04 = r4.A04(i + 1);
        if (A04 instanceof AnonymousClass51M) {
            r2 = (AnonymousClass51M) A04;
        } else {
            r2 = null;
        }
        AnonymousClass51O A042 = r4.A04(i);
        if (!(A042 instanceof AnonymousClass51M) || (r1 = (AnonymousClass51M) A042) == null || C394689yW.A00(r1, false, true)) {
            return r2 == null || C394689yW.A00(r2, true, false);
        }
        return false;
    }
}
