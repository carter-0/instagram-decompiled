package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;

public final class P7F implements C328347El {
    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r18, C331837So r19, AnonymousClass7L2 r20, 17i r21, boolean z) {
        Context context2 = context;
        AnonymousClass7LQ A0Y = C66581MXm.A0Y(r19, context2);
        UserSession userSession2 = userSession;
        AnonymousClass7L2 r8 = r20;
        17i r14 = r21;
        C51974G9v.A1P(userSession2, r14, r8, A0Y);
        AnonymousClass9HC r6 = r18;
        0qQ.A0B(r6, 5);
        C254703su r1 = A0Y.A0e;
        Object obj = r1.A1T;
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.model.direct.gifs.DirectAnimatedMedia");
        String A0s = C66582MXn.A0s(userSession2, r1, z);
        0qQ.A0A(A0s);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new N6E(AnonymousClass7FX.A03(context2, userSession2, r6, A0Y, r8, r14), C70006Nvk.A00(context2, userSession2, r6, A0Y, r8, (DirectAnimatedMedia) obj), A0s);
    }
}
