package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9wq  reason: invalid class name and case insensitive filesystem */
public abstract class C393689wq {
    public static final boolean A00(C307896Rx r6, AnonymousClass6Tm r7) {
        boolean A01 = Q0A.A01(r7.A03(0));
        Object A03 = r7.A03(1);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        if (0qQ.A0K(A03, "story")) {
            Object A00 = r7.A00();
            0qQ.A0C(A00, "null cannot be cast to non-null type kotlin.String");
            if (0qQ.A0K(A00, "close_friends")) {
                UserSession A0B = C308206Td.A0B(r6);
                0xY AR4 = 2D5.A00(A0B).A04.AR4();
                AR4.E5T("PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_STORY_CLOSE_FRIENDS", A01);
                AR4.apply();
                0qQ.A0B(A0B, 0);
                0xY AR42 = 2D5.A00(new C351998Bg(A0B).A00).A04.AR4();
                AR42.E5T("PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_STORY_CLOSE_FRIENDS_EDUCATION_HAS_SHOWN", true);
                AR42.apply();
                return true;
            }
        }
        return false;
    }
}
