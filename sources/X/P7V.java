package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class P7V implements C328347El {
    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r14, C331837So r15, AnonymousClass7L2 r16, 17i r17, boolean z) {
        Context context2 = context;
        AnonymousClass7LQ A0Y = C66581MXm.A0Y(r15, context);
        UserSession userSession2 = userSession;
        AnonymousClass7L2 r9 = r16;
        17i r10 = r17;
        C51974G9v.A1P(userSession, r10, r9, A0Y);
        AnonymousClass9HC r7 = r14;
        boolean A1S = C66582MXn.A1S(userSession, r14, z);
        C254703su r4 = A0Y.A0e;
        String A0u = C66582MXn.A0u(r4, A1S ? 1 : 0);
        0qQ.A0A(A0u);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        Object obj = r4.A1T;
        if (!(obj instanceof C44681Ciz)) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("message.content required to be DirectVotingShare but is");
            throw C66582MXn.A0j(JTR.A0v(obj), A1A);
        }
        return new N6X(AnonymousClass7FX.A03(context2, userSession2, r7, A0Y, r9, r10), new C68816NYa(C66580MXl.A0Y(context, userSession, r14, A0Y, r4), C66582MXn.A0U(userSession, r14, A0Y, r9, r4)), A0u);
    }
}
