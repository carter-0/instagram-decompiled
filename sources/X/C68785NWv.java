package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.NWv  reason: case insensitive filesystem */
public final class C68785NWv extends C331017Pd {
    public final UserSession A00;
    public final P7B A01 = new Object();
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;

    public final /* bridge */ /* synthetic */ C232262tL A05(AnonymousClass7LQ r9) {
        0qQ.A0B(r9, 0);
        P7B p7b = this.A01;
        Context A06 = JTQ.A06(this);
        UserSession userSession = this.A00;
        17i A002 = 17h.A00(userSession);
        AnonymousClass7L2 r5 = this.A03;
        return p7b.AWb(A06, userSession, this.A02, r9, r5, A002, false);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.P7B] */
    public C68785NWv(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, AnonymousClass7RP r5, C332807Wl r6, AnonymousClass9HC r7, AnonymousClass7L2 r8) {
        super(C66582MXn.A0T(layoutInflater, viewGroup, r5), r5, r6);
        this.A00 = userSession;
        this.A03 = r8;
        this.A02 = r7;
    }
}
