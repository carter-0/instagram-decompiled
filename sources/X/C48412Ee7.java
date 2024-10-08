package X;

import android.content.Context;

/* renamed from: X.Ee7  reason: case insensitive filesystem */
public abstract class C48412Ee7 {
    public static final Object A00(C307896Rx r4, AnonymousClass6Tm r5) {
        C277014uI r1 = ((C280064zw) r5.A01()).A00;
        String A0i = DbW.A0i(r5, 1);
        1xC.A01.A02(new C50295FXa(r4, r1, 0), C50261FVs.class);
        C49670F1c instance = C49670F1c.getInstance();
        Context A04 = DbT.A04();
        if (A0i == null) {
            A0i = "unknown";
        }
        instance.startDeviceValidation(A04, A0i);
        return null;
    }
}
