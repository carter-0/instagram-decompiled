package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.concurrent.CancellationException;

/* renamed from: X.9ET  reason: invalid class name */
public final class AnonymousClass9ET {
    public final Context A00;

    public AnonymousClass9ET(Context context) {
        0qQ.A0B(context, 1);
        this.A00 = context;
    }

    public final void A00(UserSession userSession, G60 g60) {
        0qQ.A0B(userSession, 0);
        C71132ar r0 = (C71132ar) 2aN.A00(userSession);
        C39726A6r a6r = new C39726A6r(2aD.A09, r0.A00, r0.A01);
        Ez6 ez6 = new Ez6(userSession, a6r, g60, this);
        HashMap hashMap = a6r.A02;
        C262204Co r1 = (C262204Co) hashMap.get(ez6);
        if (r1 != null) {
            r1.AG7((CancellationException) null);
        }
        C262224Cq r3 = a6r.A03;
        MH3 mh3 = new MH3(a6r, ez6, (AnonymousClass4D7) null, 44);
        hashMap.put(ez6, 1Eo.A03(AnonymousClass05K.A00, 19B.A00, mh3, r3));
    }
}
