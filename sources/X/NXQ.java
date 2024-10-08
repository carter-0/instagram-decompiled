package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

public final class NXQ extends C331017Pd {
    public final UserSession A00;
    public final C72465P7a A01;
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final 17i A04;
    public final AnonymousClass0eM A05;

    public final /* bridge */ /* synthetic */ C232262tL A05(AnonymousClass7LQ r9) {
        0qQ.A0B(r9, 0);
        C72465P7a p7a = this.A01;
        Context A06 = JTQ.A06(this);
        UserSession userSession = this.A00;
        17i r6 = this.A04;
        AnonymousClass7L2 r5 = this.A03;
        return p7a.AWb(A06, userSession, this.A02, r9, r5, r6, false);
    }

    public NXQ(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C332807Wl r6, AnonymousClass9HC r7, AnonymousClass7RD r8, AnonymousClass7L2 r9) {
        super(C66582MXn.A0T(layoutInflater, viewGroup, r8), r8, r6);
        this.A00 = userSession;
        this.A03 = r9;
        this.A02 = r7;
        this.A04 = 17h.A00(userSession);
        0t0 A012 = C73918Ply.A01(this, 24);
        this.A05 = A012;
        this.A01 = new C72465P7a(A012);
    }
}
