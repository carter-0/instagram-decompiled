package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

public final class NXO extends C331017Pd {
    public final UserSession A00;
    public final P78 A01 = new Object();
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final 17i A04;
    public final C229382nI A05;

    public final /* bridge */ /* synthetic */ C232262tL A05(AnonymousClass7LQ r9) {
        0qQ.A0B(r9, 0);
        P78 p78 = this.A01;
        Context A06 = JTQ.A06(this);
        UserSession userSession = this.A00;
        17i r6 = this.A04;
        AnonymousClass7L2 r5 = this.A03;
        return p78.AWb(A06, userSession, this.A02, r9, r5, r6, false);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.P78, java.lang.Object] */
    public NXO(LayoutInflater layoutInflater, ViewGroup viewGroup, C229382nI r4, UserSession userSession, AnonymousClass7RL r6, C332807Wl r7, AnonymousClass9HC r8, AnonymousClass7L2 r9) {
        super(C66582MXn.A0T(layoutInflater, viewGroup, r6), r6, r7);
        this.A00 = userSession;
        this.A03 = r9;
        this.A02 = r8;
        this.A05 = r4;
        this.A04 = 17h.A00(userSession);
    }
}
