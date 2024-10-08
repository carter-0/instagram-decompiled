package X;

import android.content.Context;

/* renamed from: X.Ebn  reason: case insensitive filesystem */
public abstract class C48268Ebn {
    public static final Object A00(C307896Rx r5, AnonymousClass6Tm r6) {
        C277014uI A0S = DbX.A0S(r6, 0);
        C307786Rm r0 = r5.A03;
        if (r0 != null) {
            Context context = r0.A00;
            if (A0S == null) {
                G9A g9a = (G9A) C46604Dhk.A01(context);
                if (g9a != null) {
                    g9a.FJi((X5O) null);
                } else {
                    throw AnonymousClass7TE.A0z("Cannot update back button override without an existing bottom sheet.");
                }
            } else {
                C51113Fol fol = new C51113Fol(r5, A0S, 0);
                G9A g9a2 = (G9A) C46604Dhk.A01(context);
                if (g9a2 != null) {
                    g9a2.FJi(fol);
                    return null;
                }
                throw AnonymousClass7TE.A0z("Cannot update back button override without an existing bottom sheet.");
            }
        }
        return null;
    }
}
