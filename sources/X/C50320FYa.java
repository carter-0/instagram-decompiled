package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FYa  reason: case insensitive filesystem */
public final class C50320FYa implements AnonymousClass0lh {
    public TeY A00;
    public final UserSession A01;

    public final void onSessionWillEnd() {
        this.A01.A03(C50320FYa.class);
    }

    public C50320FYa(UserSession userSession) {
        this.A01 = userSession;
    }
}
