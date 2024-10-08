package X;

import com.instagram.common.session.UserSession;

public final class T7P implements AnonymousClass0lh {
    public C13665TeW A00;
    public TeX A01;
    public final UserSession A02;

    public final void onSessionWillEnd() {
        this.A02.A03(T7P.class);
    }

    public T7P(UserSession userSession) {
        this.A02 = userSession;
    }
}
