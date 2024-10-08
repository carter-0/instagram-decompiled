package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.7AM  reason: invalid class name */
public final class AnonymousClass7AM {
    public final UserSession A00;
    public final C327367Am A01;
    public final C332807Wl A02;
    public final AnonymousClass9HC A03;

    public AnonymousClass7AM(UserSession userSession, C327367Am r3, C332807Wl r4, AnonymousClass9HC r5) {
        0qQ.A0B(r3, 4);
        this.A00 = userSession;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
    }

    public final AnonymousClass7AU A00(LayoutInflater layoutInflater, ViewGroup viewGroup, AnonymousClass79L r14, AnonymousClass7L2 r15) {
        0qQ.A0B(r14, 0);
        UserSession userSession = this.A00;
        C327367Am r4 = this.A01;
        C72444P6f p6f = new C72444P6f();
        C72421P5i p5i = new C72421P5i(r4);
        AnonymousClass7AO r7 = new AnonymousClass7AO(new P4T(r4), new P57(r4), p5i, p6f);
        C332807Wl r8 = this.A02;
        AnonymousClass9HC r9 = this.A03;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new AnonymousClass7AU(r14.createViewHolder(viewGroup, layoutInflater), r14, userSession, r7, r8, r9, r15);
    }
}
