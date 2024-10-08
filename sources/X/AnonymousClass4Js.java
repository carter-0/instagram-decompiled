package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.4Js  reason: invalid class name */
public final class AnonymousClass4Js {
    public final UserSession A00;
    public final AnonymousClass0iw A01;

    public AnonymousClass4Js(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r2, 2);
        this.A00 = userSession;
        this.A01 = r2;
    }

    public final void A00(Context context, C62320sa r12) {
        0qQ.A0B(r12, 1);
        UserSession userSession = this.A00;
        Context context2 = context;
        if (ORX.A01(userSession)) {
            ORX.A00(context, userSession, new C72989PRy(r12));
            return;
        }
        Integer num = AnonymousClass05K.A01;
        if (C70349O3b.A00(userSession, num)) {
            C49256Erz.A00(context2, new C71325OiW(this, r12), AnonymousClass1Qz.A00(userSession).C82(), this.A01, (ImageUrl) null, false, num);
            return;
        }
        r12.invoke();
    }
}
