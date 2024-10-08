package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.V9s  reason: case insensitive filesystem */
public abstract class C16889V9s {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        long j;
        Number number;
        C307786Rm r7 = r8.A03;
        if (r7 != null) {
            Object A01 = r9.A01();
            if (!(A01 instanceof Number) || (number = (Number) A01) == null) {
                j = 0;
            } else {
                j = number.longValue();
            }
            C277014uI r5 = ((C280064zw) r9.A02()).A00;
            0lg A0B = C308206Td.A0B(r8);
            if ((A0B instanceof UserSession) && A0B != null) {
                if (AnonymousClass1ZG.A01 == null) {
                    0qQ.A0F("plugin");
                    throw AnonymousClass00P.createAndThrow();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("LimitedSettingsFragment.REMINDER_DATE", j);
                UZC uzc = new UZC();
                uzc.setArguments(bundle);
                Context context = r7.A00;
                uzc.A02 = new VVK(context, r8, r5);
                DbW.A0T(A0B).A03(context, uzc);
            }
        }
        return null;
    }
}
