package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6zW  reason: invalid class name and case insensitive filesystem */
public final class C324556zW implements AnonymousClass0lh {
    public final 0xa A00;
    public final UserSession A01;

    public final String A00() {
        return this.A00.getString("account_delegate_ig_id", (String) null);
    }

    public final void onSessionWillEnd() {
        this.A01.A03(C324556zW.class);
    }

    public C324556zW(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = 1Al.A01(userSession).A04(1An.A1s, getClass());
    }
}
