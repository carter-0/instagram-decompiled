package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class P78 implements C328347El {
    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r13, C331837So r14, AnonymousClass7L2 r15, 17i r16, boolean z) {
        C10488Rt3 rt3;
        Context context2 = context;
        AnonymousClass7LQ A0Y = C66581MXm.A0Y(r14, context);
        UserSession userSession2 = userSession;
        AnonymousClass7L2 r8 = r15;
        17i r9 = r16;
        C51974G9v.A1P(userSession, r9, r15, A0Y);
        AnonymousClass9HC r6 = r13;
        boolean A1S = C66582MXn.A1S(userSession, r13, z);
        C254703su r1 = A0Y.A0e;
        String A0u = C66582MXn.A0u(r1, A1S ? 1 : 0);
        0qQ.A0A(A0u);
        synchronized (r1) {
            rt3 = r1.A0O;
        }
        return new N6A(new QPl(rt3, A0u), AnonymousClass7FX.A03(context2, userSession2, r6, A0Y, r8, r9), A0u);
    }
}
