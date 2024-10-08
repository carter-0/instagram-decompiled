package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

public final class Q1Q implements C13886Tj9 {
    public final UserSession A00;
    public final AnonymousClass0JR A01;
    public final C60640iu A02;
    public final 0xG A03 = new 0xG("medialibrary");

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.0JR] */
    public Q1Q(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = C60510iO.A00(userSession);
        this.A01 = new Object();
    }

    public final void logEvent(String str, Map map) {
        0xI A002 = 0xI.A00(this.A03, str);
        A002.A0F(map);
        this.A02.EFq(A002);
    }

    public final long now() {
        return this.A01.now();
    }
}
