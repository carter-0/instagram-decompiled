package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2n5  reason: invalid class name and case insensitive filesystem */
public class C229252n5 implements 0lm {
    public final 1Bk A00;
    public final 1Bk A01;

    public C229252n5(UserSession userSession) {
        String str = userSession.A06;
        1Bk A002 = 1Bk.A00(C229272n7.A00(userSession, 002.A0g(str, "_", "starred_view")));
        1Bk A003 = 1Bk.A00(C229272n7.A00(userSession, 002.A0g(str, "_", "organic_view")));
        this.A01 = A002;
        this.A00 = A003;
    }

    public static C229252n5 A00(UserSession userSession) {
        return (C229252n5) userSession.A01(C229252n5.class, new C229262n6(userSession));
    }

    public final void onUserSessionWillEnd(boolean z) {
        1Bk r0 = this.A01;
        if (z) {
            r0.A08();
            this.A00.A08();
            return;
        }
        r0.A09();
        this.A00.A09();
    }

    public C229252n5(UserSession userSession, String str, String str2) {
        String A002 = AnonymousClass000.A00(3339);
        String A003 = AnonymousClass000.A00(3338);
        String str3 = userSession.A06;
        1Bk A012 = 1Bk.A01(002.A0g(str3, "_", A002));
        1Bk A013 = 1Bk.A01(002.A0g(str3, "_", A003));
        this.A01 = A012;
        this.A00 = A013;
    }
}
