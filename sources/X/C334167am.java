package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7am  reason: invalid class name and case insensitive filesystem */
public final class C334167am {
    public 1Xj A00;
    public final UserSession A01;

    public C334167am(UserSession userSession, 1Xj r3) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r3;
    }

    public static final void A00(C334167am r8, VQ0 vq0, boolean z) {
        1Xj r7 = r8.A00;
        if (r7 != null) {
            if (z) {
                r7.A0U.clear();
            }
            C15596UfO ufO = new C15596UfO(r7, r8, vq0);
            UserSession userSession = r8.A01;
            1NY r3 = new 1NY(userSession, -2);
            r3.A08(AnonymousClass05K.A0N);
            r3.A0K("limited_interactions/%s/comments/limited_comments/", new Object[]{r7.getId()});
            r3.A0O((15p) null, CG5.class, D30.class, false);
            if (!z) {
                r3.A0G("next_min_id", r7.A0O);
            }
            if (AnonymousClass4CM.A00(userSession).A00()) {
                r3.A9m("can_support_carousel_mentions", "true");
            }
            1OC A0M = r3.A0M();
            A0M.A00 = ufO;
            1ES.A03(A0M);
        }
    }
}
