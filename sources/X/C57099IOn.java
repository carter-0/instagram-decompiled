package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IOn  reason: case insensitive filesystem */
public final class C57099IOn implements 0lm {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final UserSession A03;

    public final void onUserSessionWillEnd(boolean z) {
        this.A00 = false;
        this.A02 = false;
        this.A01 = false;
    }

    public C57099IOn(UserSession userSession) {
        this.A03 = userSession;
    }
}
