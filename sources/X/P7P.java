package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class P7P implements C328347El {
    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r18, C331837So r19, AnonymousClass7L2 r20, 17i r21, boolean z) {
        Context context2 = context;
        AnonymousClass7LQ A0Y = C66581MXm.A0Y(r19, context2);
        UserSession userSession2 = userSession;
        AnonymousClass7L2 r8 = r20;
        17i r14 = r21;
        C51974G9v.A1P(userSession2, r14, r8, A0Y);
        AnonymousClass9HC r6 = r18;
        0qQ.A0B(r6, 5);
        C254703su r0 = A0Y.A0e;
        1Xj A0T = r0.A0T();
        if (A0T != null) {
            String A0s = C66582MXn.A0s(userSession2, r0, z);
            0qQ.A0A(A0s);
            int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new N6N(AnonymousClass7FX.A03(context2, userSession2, r6, A0Y, r8, r14), C70009Nvn.A00(context2, userSession2, r6, A0Y, r8, A0T), A0s);
        }
        throw AnonymousClass7TE.A0w("Error, DirectMessage object has no media share for message rendering");
    }
}
