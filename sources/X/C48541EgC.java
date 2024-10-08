package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.EgC  reason: case insensitive filesystem */
public abstract class C48541EgC {
    public static final Boolean A00(C307896Rx r6, AnonymousClass6Tm r7) {
        Context context;
        boolean z = false;
        String A0i = DbW.A0i(r7, 0);
        UserSession A0W = DbX.A0W(r6);
        C307786Rm r0 = r6.A03;
        if (r0 != null) {
            context = r0.A00;
        } else {
            context = null;
        }
        if (A0i == null) {
            A0i = "";
        }
        2HA A03 = C3726691w.A03(context, A0W, A0i);
        if (context == null) {
            return false;
        }
        0qQ.A0B(A03, 1);
        Boolean A00 = 2Gm.A00(context, A03, false);
        if (A03 == 2HA.A0c || A00 == null || A00.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
