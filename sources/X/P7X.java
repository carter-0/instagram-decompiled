package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class P7X implements C328347El {
    public final /* synthetic */ AnonymousClass7L2 A00;

    public P7X(AnonymousClass7L2 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r20, C331837So r21, AnonymousClass7L2 r22, 17i r23, boolean z) {
        AnonymousClass7LQ r5 = (AnonymousClass7LQ) r21;
        Context context2 = context;
        0qQ.A0B(context2, 0);
        UserSession userSession2 = userSession;
        17i r4 = r23;
        C51974G9v.A1P(userSession2, r4, r22, r5);
        AnonymousClass9HC r6 = r20;
        0qQ.A0B(r6, 5);
        1Zp A01 = 1Zm.A00(userSession2).A01(AnonymousClass05K.A0N, AnonymousClass05K.A1F, false);
        A01.A01("view_type", r5.getType());
        A01.A00();
        boolean A002 = AnonymousClass760.A00(userSession2, z);
        C254703su r1 = r5.A0e;
        String A0u = C66582MXn.A0u(r1, A002 ? 1 : 0);
        0qQ.A0A(A0u);
        AnonymousClass7L2 r2 = this.A00;
        2FW r0 = 2FW.A1M;
        boolean z2 = false;
        AnonymousClass7FE A0V = C66582MXn.A0V(userSession2, r6, r5, r2, r0);
        AnonymousClass7FT A003 = AnonymousClass7FG.A00(context2, userSession2, r6, r5, r0);
        if (r1.A10 == 2FW.A0n) {
            z2 = true;
        }
        return new Na6(AnonymousClass7FX.A03(context2, userSession2, r6, r5, r2, r4), new NYY(A003, A0V, false, "Message type not supported yet.", (String) null, (String) null, z2), A0u);
    }
}
