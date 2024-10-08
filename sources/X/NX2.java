package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class NX2 extends C331017Pd {
    public final UserSession A00;
    public final C72476P7l A01;
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final 17i A04;

    public final /* bridge */ /* synthetic */ C232262tL A05(AnonymousClass7LQ r9) {
        0qQ.A0B(r9, 0);
        C72476P7l p7l = this.A01;
        Context A06 = JTQ.A06(this);
        UserSession userSession = this.A00;
        17i r6 = this.A04;
        AnonymousClass7L2 r5 = this.A03;
        return p7l.AWb(A06, userSession, this.A02, r9, r5, r6, false);
    }

    public NX2(UserSession userSession, C68810NXu nXu, AnonymousClass9HO r4, AnonymousClass7EZ r5, C332807Wl r6, AnonymousClass9HC r7, AnonymousClass7L2 r8) {
        super(r5, nXu, r6);
        this.A03 = r8;
        this.A00 = userSession;
        this.A02 = r7;
        this.A04 = 17h.A00(userSession);
        this.A01 = new C72476P7l(r4);
    }
}
