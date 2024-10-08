package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.Rh2  reason: case insensitive filesystem */
public abstract class C9806Rh2 {
    public static final Object A00(C307896Rx r2, AnonymousClass6Tm r3) {
        String A0g = DbY.A0g(r3);
        C307786Rm r0 = r2.A03;
        if (r0 != null) {
            Context context = r0.A00;
            try {
                Uri A03 = 0cp.A03(A0g);
                0qQ.A0A(A03);
                Intent A0E = Pxe.A0E();
                A0E.setData(A03);
                A0E.setPackage("com.android.vending");
                0kR.A00(context, A0E);
            } catch (SecurityException unused) {
            }
        }
        return null;
    }
}
