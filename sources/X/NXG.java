package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class NXG extends C331017Pd {
    public final UserSession A00;
    public final C72478P7n A01;
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final 17i A04;

    public final /* bridge */ /* synthetic */ C232262tL A05(AnonymousClass7LQ r9) {
        C72478P7n p7n = this.A01;
        Context A07 = DbS.A07(this);
        UserSession userSession = this.A00;
        17i r6 = this.A04;
        return p7n.AWb(A07, userSession, this.A02, r9, this.A03, r6, false);
    }

    public NXG(UserSession userSession, AnonymousClass9HO r3, AnonymousClass7EZ r4, C332807Wl r5, AnonymousClass9HC r6, NY3 ny3, AnonymousClass7L2 r8) {
        super(r4, ny3, r5);
        this.A00 = userSession;
        this.A04 = 17h.A00(userSession);
        this.A03 = r8;
        this.A02 = r6;
        this.A01 = new C72478P7n(r3);
    }
}
