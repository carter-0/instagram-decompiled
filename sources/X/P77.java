package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;

public final class P77 implements C328347El {
    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r13, C331837So r14, AnonymousClass7L2 r15, 17i r16, boolean z) {
        Context context2 = context;
        AnonymousClass7LQ A0Y = C66581MXm.A0Y(r14, context);
        UserSession userSession2 = userSession;
        AnonymousClass7L2 r8 = r15;
        17i r9 = r16;
        C51974G9v.A1P(userSession, r9, r15, A0Y);
        AnonymousClass9HC r6 = r13;
        0qQ.A0B(r13, 5);
        C254703su r1 = A0Y.A0e;
        0qQ.A07(r1);
        Object obj = r1.A1T;
        if (!(obj instanceof DirectAnimatedMedia)) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("message.content required to be DirectAnimatedMedia but is ");
            throw C66582MXn.A0j(JTR.A0v(obj), A1A);
        }
        String A0s = C66582MXn.A0s(userSession, r1, z);
        0qQ.A0A(A0s);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        Object obj2 = r1.A1T;
        0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.model.direct.gifs.DirectAnimatedMedia");
        return new N68(C70004Nvi.A00(context, userSession, r13, A0Y, (DirectAnimatedMedia) obj2), AnonymousClass7FX.A03(context2, userSession2, r6, A0Y, r8, r9), A0s);
    }
}
