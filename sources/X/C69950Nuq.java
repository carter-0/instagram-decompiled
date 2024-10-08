package X;

import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.Nuq  reason: case insensitive filesystem */
public abstract class C69950Nuq {
    public static final boolean A00(Capabilities capabilities, N4P n4p) {
        0qQ.A0B(n4p, 0);
        boolean z = n4p.A0v;
        boolean A05 = N4P.A05(n4p);
        int i = n4p.A09;
        boolean A1S = AnonymousClass7TF.A1S(i, 1012);
        boolean A1S2 = AnonymousClass7TF.A1S(i, 1013);
        int A00 = N4P.A00(n4p);
        if (!z || A05 || A1S || A1S2 || A00 != 1 || !capabilities.A00(C376179Gx.BLOCK)) {
            return false;
        }
        return true;
    }
}
