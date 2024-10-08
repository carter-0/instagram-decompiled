package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lis  reason: case insensitive filesystem */
public final class C64831Lis implements AnonymousClass0lh {
    public long A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new MM7(this, 48));

    public static final void A00(C64831Lis lis, String str, String str2) {
        C51803G2m g2m = new C51803G2m(lis, str, str2, 16);
        if (0 != lis.A00) {
            g2m.invoke();
        }
    }

    public final void onSessionWillEnd() {
        MM7 mm7 = new MM7(this, 46);
        if (0 != this.A00) {
            mm7.invoke();
        }
    }

    public C64831Lis(UserSession userSession) {
        this.A01 = userSession;
    }
}
