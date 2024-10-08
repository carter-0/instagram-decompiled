package X;

import android.view.View;

public abstract class RTS {
    public static final Number A00(C307896Rx r4, AnonymousClass6Tm r5) {
        int i = 0;
        C276544tV A0O = DbY.A0O(r5);
        String str = (String) DbW.A0d(r5);
        View A05 = A0O.A05(r4.A03);
        if (A05 != null) {
            i = A05.getHeight();
        }
        float f = (float) i;
        if (str == null || !str.equalsIgnoreCase("px")) {
            if (str == null || !str.equalsIgnoreCase("dp")) {
                1Kn.A02(C273654mx.A00(1741), 002.A0R("Unrecognised unit string ", str));
                return null;
            }
            f = C18183Vmx.A01(C64361Kj.A00().A00, f);
        }
        return Q0A.A00((double) f);
    }
}
