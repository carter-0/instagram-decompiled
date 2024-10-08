package X;

import com.instagram.appreciation.analytics.LoggingData;
import com.instagram.common.session.UserSession;

/* renamed from: X.L5p  reason: case insensitive filesystem */
public final class C63757L5p {
    public final LTO A00;
    public final C63582KzV A01;
    public final UserSession A02;

    public /* synthetic */ C63757L5p(AnonymousClass0iw r4, UserSession userSession, String str, String str2) {
        LTO lto = new LTO(new LoggingData(str, str2), r4, AnonymousClass0kN.A01(r4, userSession));
        C63582KzV kzV = new C63582KzV(userSession);
        this.A02 = userSession;
        this.A00 = lto;
        this.A01 = kzV;
    }
}
