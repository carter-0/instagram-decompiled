package X;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: X.JWm  reason: case insensitive filesystem */
public final class C59750JWm {
    public final /* synthetic */ JW7 A00;

    public C59750JWm(JW7 jw7) {
        this.A00 = jw7;
    }

    public final void A00(C66443MRx mRx) {
        JW7 jw7 = this.A00;
        L0C l0c = jw7.A15;
        Context A0S = AnonymousClass7TE.A0S(jw7);
        ViewGroup viewGroup = jw7.A0n;
        MMT mmt = new MMT(mRx, 26);
        0qQ.A0B(viewGroup, 1);
        if (l0c.A00 == null) {
            String A0K = 2Yu.A0K(A0S);
            C339797kB A0O = JTQ.A0O(viewGroup);
            A0O.A06(0Yt.A0E());
            A0O.A05(DbW.A0h(A0S, A0K, 2131974231));
            A0O.A04(DbW.A0h(A0S, A0K, 2131974230));
            A0O.A02(2131974229);
            A0O.A03(LYA.A00(mmt, A0S, l0c, 12));
            l0c.A00 = A0O;
        }
    }
}
