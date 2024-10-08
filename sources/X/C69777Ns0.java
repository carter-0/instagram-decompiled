package X;

import android.content.Context;

/* renamed from: X.Ns0  reason: case insensitive filesystem */
public abstract class C69777Ns0 {
    public static final Object A00(C307896Rx r5, AnonymousClass6Tm r6) {
        C249473jq r2;
        boolean z = false;
        String A0g = DbY.A0g(r6);
        C307786Rm r1 = r5.A03;
        0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        0tS A0h = DbT.A0h();
        if (A0g.length() > 0) {
            z = true;
        }
        A0h.A0I(z);
        A0h.A0E(A0g);
        1Ma.A07();
        Context context = r1.A00;
        if ((context instanceof C249473jq) && (r2 = (C249473jq) context) != null) {
            r2.D8a(A0h);
        }
        return null;
    }
}
