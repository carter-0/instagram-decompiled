package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.Rgz  reason: case insensitive filesystem */
public abstract class C9803Rgz {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        Integer num;
        Intent intent;
        C307786Rm r0 = r6.A03;
        if (r0 != null) {
            Context context = r0.A00;
            if (0qQ.A0K(DbT.A0p(r7, 0), "notification")) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A00;
            }
            0qQ.A0B(num, 1);
            if (num.intValue() != 0) {
                intent = Pxe.A0G(AnonymousClass000.A00(2605));
                intent.putExtra(AnonymousClass000.A00(1090), context.getPackageName());
            } else {
                intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", context.getPackageName(), (String) null));
            }
            0b6.A00().A04().A0G(context, intent);
        }
        return null;
    }
}
