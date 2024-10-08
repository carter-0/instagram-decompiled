package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

public final class NXI extends C331017Pd {
    public final UserSession A00;
    public final P7P A01 = new Object();
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final 17i A04;

    public final /* bridge */ /* synthetic */ C232262tL A05(AnonymousClass7LQ r9) {
        0qQ.A0B(r9, 0);
        P7P p7p = this.A01;
        Context A06 = JTQ.A06(this);
        UserSession userSession = this.A00;
        17i r6 = this.A04;
        AnonymousClass7L2 r5 = this.A03;
        return p7p.AWb(A06, userSession, this.A02, r9, r5, r6, false);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.P7P] */
    public NXI(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C332807Wl r5, AnonymousClass9HC r6, AnonymousClass7RI r7, AnonymousClass7L2 r8) {
        super(C66582MXn.A0T(layoutInflater, viewGroup, r7), r7, r5);
        this.A00 = userSession;
        this.A03 = r8;
        this.A02 = r6;
        this.A04 = 17h.A00(userSession);
    }
}
