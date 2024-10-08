package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KWg  reason: case insensitive filesystem */
public final class C62030KWg extends C252733pa {
    public C262204Co A00;
    public final AnonymousClass0r6 A01;
    public final 05G A02;

    public final void A00(UserSession userSession, String str, boolean z) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        C262204Co r0 = this.A00;
        if (r0 == null || !r0.isActive()) {
            this.A00 = C51966G9m.A1L(new MFh(this, userSession2, str, (AnonymousClass4D7) null, 4, z), this.A01);
        }
    }

    public C62030KWg() {
        super("Direct", AnonymousClass43D.A00(150486801));
        02z A012 = 106.A01(KRN.A00);
        this.A02 = A012;
        this.A01 = 10b.A03(A012);
    }
}
