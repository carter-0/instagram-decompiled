package X;

import android.view.View;

/* renamed from: X.EeM  reason: case insensitive filesystem */
public abstract class C48427EeM {
    public static Object A00(AnonymousClass6Tm r6) {
        C307786Rm r5 = (C307786Rm) r6.A01();
        boolean A1a = AnonymousClass7TE.A1a(r6.A02());
        C276544tV r3 = (C276544tV) r6.A00();
        View view = C308206Td.A00(r5).mView;
        if (view != null) {
            2dZ A00 = C16859V8o.A00(C308206Td.A03(r5), r5);
            if (A00 != null) {
                A00.A0B = A1a;
            }
            C48383Ede.A00(view, r5, r3);
        }
        return null;
    }
}
