package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.AYj  reason: case insensitive filesystem */
public final class C40270AYj implements AnonymousClass0lh {
    public 1Xj A00;
    public String A01 = "";
    public String A02 = "";
    public final UserSession A03;

    public final void onSessionWillEnd() {
        this.A03.A03(C40270AYj.class);
    }

    public C40270AYj(UserSession userSession) {
        this.A03 = userSession;
    }
}
