package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.78l  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3268678l implements 1wn {
    public final /* synthetic */ C329067Hl A00;

    public /* synthetic */ C3268678l(C329067Hl r1) {
        this.A00 = r1;
    }

    public final void onEvent(Object obj) {
        C329067Hl r4 = this.A00;
        UserSession userSession = r4.A1Z;
        0qQ.A0B(userSession, 0);
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 36319407398788480L)) {
            2Er r9 = r4.A0W;
            if (r9 != null) {
                C329907Kr r2 = r4.A0Q;
                AnonymousClass7L0 r8 = r4.A0U;
                Integer num = r2.A00;
                if (num != null && num.intValue() == 11) {
                    C3269378s r42 = C3269378s.A00;
                    View view = r2.A04;
                    C314466iJ r7 = r2.A07;
                    if (!182.A06(r3, userSession, 36319407398329723L)) {
                        return;
                    }
                    if (C3269378s.A07(userSession, r9)) {
                        r42.A09(view, userSession, r7, r8, r9);
                        return;
                    }
                    Context context = view.getContext();
                    0qQ.A07(context);
                    r42.A08(context, view, userSession, r8, r9);
                    return;
                }
                return;
            }
            return;
        }
        C329067Hl.A0Y(r4);
    }
}
