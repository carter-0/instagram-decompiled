package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Oxy  reason: case insensitive filesystem */
public final class C72189Oxy implements AnonymousClass0lh {
    public boolean A00;
    public final UserSession A01;

    public final void onSessionWillEnd() {
        this.A00 = false;
    }

    public C72189Oxy(UserSession userSession) {
        this.A01 = userSession;
    }
}
