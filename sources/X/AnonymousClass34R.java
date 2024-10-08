package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.34R  reason: invalid class name */
public final class AnonymousClass34R {
    public final AnonymousClass34Q A00;
    public final UserSession A01;

    public AnonymousClass34R(UserSession userSession, AnonymousClass34Q r5, String str) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 2);
        this.A01 = userSession;
        if (182.A06(0Tu.A05, userSession, 36315520449908061L)) {
            r5 = new 1x3(userSession).A01(str);
        } else if (r5 == null) {
            r5 = C3252971v.A00(userSession);
        }
        this.A00 = r5;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9IV A00(AnonymousClass34L r5, List list, boolean z) {
        AnonymousClass46R A02 = 1y1.A00(r5.A00).A02(this.A00, r5.A01, new AnonymousClass9LT(list, 38));
        if (A02 == null || !A02.hasNext()) {
            return null;
        }
        boolean z2 = false;
        if (z) {
            z2 = true;
        }
        AnonymousClass9IV A002 = AnonymousClass46R.A00(A02, z2);
        if (list.contains(A002.A00)) {
            return A002;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
