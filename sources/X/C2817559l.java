package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.59l  reason: invalid class name and case insensitive filesystem */
public final class C2817559l {
    public final C2817659m A00;

    public C2817559l(Context context, UserSession userSession) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        0wc A01 = AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession);
        C2817659m r0 = C2817659m.A04;
        if (r0 == null) {
            r0 = new C2817659m(context, A01);
            C2817659m.A04 = r0;
        }
        this.A00 = r0;
    }
}
