package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EHi  reason: case insensitive filesystem */
public final class C47797EHi extends 0ng {
    public C47797EHi() {
        super(1634543048);
    }

    public final void run() {
        long currentTimeMillis = System.currentTimeMillis();
        0xa r0 = AnonymousClass2AZ.A01;
        if (r0 != null) {
            0xY AR4 = r0.AR4();
            AR4.E5c(AnonymousClass000.A00(1539), currentTimeMillis);
            AR4.apply();
        }
        UserSession userSession = AnonymousClass2AZ.A00;
        if (userSession != null) {
            0xY AR42 = ((AnonymousClass3UF) userSession.A01(AnonymousClass3UF.class, new C51763G0f(userSession, 3))).A00.AR4();
            AR42.E5c("last_app_foreground_background_timestamp", currentTimeMillis);
            AR42.apply();
        }
    }
}
