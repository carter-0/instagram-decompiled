package X;

import com.instagram.common.session.UserSession;

public final class JVO {
    public C63779L6l A00;
    public boolean A01;
    public final UserSession A02;
    public final C320296s9 A03;
    public final String A04;
    public final AnonymousClass0eM A05 = C66306MMp.A01(this, 9);
    public final AnonymousClass07Z A06;

    public JVO(AnonymousClass07Z r2, UserSession userSession, C320296s9 r4, String str) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A04 = str;
        this.A06 = r2;
        this.A03 = r4;
    }

    public static final void A00(JVO jvo) {
        if (jvo.A01) {
            C63779L6l l6l = jvo.A00;
            if (l6l != null) {
                l6l.A02.A01(AnonymousClass05K.A00);
                return;
            }
            return;
        }
        MG8.A01(jvo, AnonymousClass07a.A00(jvo.A06), 47);
    }
}
