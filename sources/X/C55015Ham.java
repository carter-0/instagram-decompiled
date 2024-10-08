package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ham  reason: case insensitive filesystem */
public abstract class C55015Ham {
    public static final void A00(AnonymousClass0iw r3, UserSession userSession, 1Xj r5) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "ig_bottomsheet_done");
        if (A0e.isSampled()) {
            A0e.AAJ("detail", "swipe_collapse");
            String A2n = r5.A2n();
            if (A2n != null) {
                A0e.A9F("ig_media_id", AnonymousClass7TE.A10(A2n));
                DbW.A15(A0e, r3);
                A0e.Cgf();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
