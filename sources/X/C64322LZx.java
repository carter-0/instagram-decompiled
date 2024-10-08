package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LZx  reason: case insensitive filesystem */
public final class C64322LZx implements 2YM {
    public final UserSession A00;

    public C64322LZx(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        return 2YT.A01(this, cls);
    }

    public final 2YL create(Class cls) {
        UserSession userSession = this.A00;
        return new C60125Jg6(new C62027KWb(userSession, new L29(userSession)));
    }
}
