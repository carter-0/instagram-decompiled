package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

public final class NXN extends C331017Pd {
    public final UserSession A00;
    public final P7V A01 = new Object();
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final 17i A04;

    public final /* bridge */ /* synthetic */ C232262tL A05(AnonymousClass7LQ r9) {
        0qQ.A0B(r9, 0);
        P7V p7v = this.A01;
        Context A06 = JTQ.A06(this);
        UserSession userSession = this.A00;
        17i r6 = this.A04;
        AnonymousClass7L2 r5 = this.A03;
        return p7v.AWb(A06, userSession, this.A02, r9, r5, r6, false);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.P7V, java.lang.Object] */
    public NXN(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C332807Wl r5, AnonymousClass9HC r6, AnonymousClass7L2 r7, NY6 ny6) {
        super(C66582MXn.A0T(layoutInflater, viewGroup, ny6), ny6, r5);
        this.A00 = userSession;
        this.A03 = r7;
        this.A02 = r6;
        this.A04 = 17h.A00(userSession);
    }
}
