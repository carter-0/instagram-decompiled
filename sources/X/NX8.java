package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class NX8 extends C331017Pd {
    public final UserSession A00;
    public final C72474P7j A01 = new Object();
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final 17i A04;

    public final /* bridge */ /* synthetic */ C232262tL A05(AnonymousClass7LQ r9) {
        0qQ.A0B(r9, 0);
        C72474P7j p7j = this.A01;
        Context A06 = JTQ.A06(this);
        UserSession userSession = this.A00;
        17i r6 = this.A04;
        AnonymousClass7L2 r5 = this.A03;
        return p7j.AWb(A06, userSession, this.A02, r9, r5, r6, false);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.P7j, java.lang.Object] */
    public NX8(UserSession userSession, AnonymousClass7EZ r3, C332807Wl r4, AnonymousClass9HC r5, C68812NXw nXw, AnonymousClass7L2 r7) {
        super(r3, nXw, r4);
        this.A00 = userSession;
        this.A03 = r7;
        this.A02 = r5;
        this.A04 = 17h.A00(userSession);
    }
}
