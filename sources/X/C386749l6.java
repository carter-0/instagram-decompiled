package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.common.session.UserSession;

/* renamed from: X.9l6  reason: invalid class name and case insensitive filesystem */
public final class C386749l6 extends 0ng {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ 183 A01;

    public final void run() {
        1AA r4;
        1AA r3;
        183 r1 = this.A01;
        UserSession userSession = this.A00;
        1AV A012 = r1.A01();
        if (A012 != null) {
            r4 = A012.A01.A00;
        } else {
            r4 = null;
        }
        1AV A02 = r1.A02(userSession);
        if (A02 != null) {
            r3 = A02.A01.A00;
        } else {
            r3 = null;
        }
        1At.A00(r3, r4, (LightweightQuickPerformanceLogger) null, userSession, 1Aj.A01(userSession), 1Aj.A00(), AnonymousClass05K.A0Y, 0sr.A1P(new 1As[]{new 1As(AnonymousClass0yP.A00(36329930061005181L)), new 1As(AnonymousClass0yP.A00(36892880014476236L))}), 0sr.A1P(new 1As[]{new 1As(C63130yM.A00(18315535846490494L)), new 1As(C63130yM.A00(18878485799961549L))}), 1792);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386749l6(UserSession userSession, 183 r3) {
        super(501143860);
        this.A01 = r3;
        this.A00 = userSession;
    }
}
