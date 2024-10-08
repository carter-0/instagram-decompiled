package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

public final class NX0 extends C331017Pd {
    public final UserSession A00;
    public final P76 A01 = new Object();
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final 17i A04;

    public final /* bridge */ /* synthetic */ C232262tL A05(AnonymousClass7LQ r9) {
        0qQ.A0B(r9, 0);
        P76 p76 = this.A01;
        Context A06 = JTQ.A06(this);
        UserSession userSession = this.A00;
        17i r6 = this.A04;
        AnonymousClass7L2 r5 = this.A03;
        return p76.AWb(A06, userSession, this.A02, r9, r5, r6, false);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.P76, java.lang.Object] */
    public NX0(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, NY7 ny7, C332807Wl r6, AnonymousClass9HC r7, AnonymousClass7L2 r8) {
        super(C66582MXn.A0T(layoutInflater, viewGroup, ny7), ny7, r6);
        this.A00 = userSession;
        this.A03 = r8;
        this.A02 = r7;
        this.A04 = 17h.A00(userSession);
    }
}
