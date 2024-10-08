package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4X2  reason: invalid class name */
public final class AnonymousClass4X2 implements AnonymousClass0lh {
    public 1Bk A00;
    public final UserSession A01;

    public static final 1Bk A00(AnonymousClass4X2 r5) {
        1Bk r0 = r5.A00;
        if (r0 == null) {
            1Bl r4 = 1Bk.A03;
            UserSession userSession = r5.A01;
            String A0g = 002.A0g(userSession.A06, "_", "video_view");
            0qQ.A07(A0g);
            r0 = r4.A01(new C229282n8(userSession, A0g));
        }
        r5.A00 = r0;
        return r0;
    }

    public final void onSessionWillEnd() {
        1Bk r0 = this.A00;
        if (r0 != null) {
            r0.A09();
        }
    }

    public AnonymousClass4X2(UserSession userSession) {
        this.A01 = userSession;
    }
}
