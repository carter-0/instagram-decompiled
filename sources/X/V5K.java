package X;

import android.content.Context;

public abstract class V5K {
    public static final Number A00(C307896Rx r2, AnonymousClass6Tm r3) {
        Ty7 A0P = C13989Tnp.A0P(r2, DbY.A0O(r3), r3, 1);
        if (A0P == null) {
            return null;
        }
        Context context = C64361Kj.A00().A00;
        if (C245983dn.A03()) {
            return Q0A.A00((double) C18183Vmx.A01(context, (float) A0P.A02.A04));
        }
        throw new RuntimeException("Cannot getScroll off the main thread!");
    }
}
