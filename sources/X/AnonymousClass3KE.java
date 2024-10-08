package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.3KE  reason: invalid class name */
public final class AnonymousClass3KE {
    public final void A01(String str, UserSession userSession, 1Xj r5) {
        0qQ.A0B(str, 2);
        Map map = ((C294395mN) userSession.A01(C294395mN.class, C294385mM.A00)).A00;
        String id = r5.getId();
        if (id != null) {
            map.put(id, str);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.3KD] */
    public static final void A00() {
        AnonymousClass3KD r1 = AnonymousClass3KD.A04;
        AnonymousClass3KD r12 = r1;
        if (r1 == null) {
            ? obj = new Object();
            AnonymousClass3KD.A04 = obj;
            r12 = obj;
        }
        0qQ.A0C(r12, "null cannot be cast to non-null type com.instagram.shopping.adapter.ifu.ShoppingIFUManager");
    }
}
