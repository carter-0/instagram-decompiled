package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.NWx  reason: case insensitive filesystem */
public final class C68787NWx extends C331017Pd {
    public final UserSession A00;
    public final AnonymousClass9HC A01;
    public final AnonymousClass7L2 A02;
    public final 17i A03;

    public final /* bridge */ /* synthetic */ C232262tL A05(AnonymousClass7LQ r7) {
        0qQ.A0B(r7, 0);
        Context A06 = JTQ.A06(this);
        UserSession userSession = this.A00;
        17i r5 = this.A03;
        AnonymousClass7L2 r4 = this.A02;
        return C72480P7p.A00(A06, userSession, this.A01, r7, r4, r5);
    }

    public C68787NWx(UserSession userSession, AnonymousClass7EZ r3, C332807Wl r4, AnonymousClass9HC r5, C68814NXy nXy, AnonymousClass7L2 r7) {
        super(r3, nXy, r4);
        this.A02 = r7;
        this.A00 = userSession;
        this.A01 = r5;
        this.A03 = 17h.A00(userSession);
    }
}
