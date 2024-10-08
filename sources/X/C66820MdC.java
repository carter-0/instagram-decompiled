package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.MdC  reason: case insensitive filesystem */
public final class C66820MdC implements C328347El {
    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r13, C331837So r14, AnonymousClass7L2 r15, 17i r16, boolean z) {
        AnonymousClass7LQ A0Y = C66581MXm.A0Y(r14, context);
        17i r9 = r16;
        C51974G9v.A1P(userSession, r9, r15, A0Y);
        AnonymousClass9HC r6 = r13;
        boolean A1S = C66582MXn.A1S(userSession, r13, z);
        C254703su r1 = A0Y.A0e;
        String A0u = C66582MXn.A0u(r1, A1S ? 1 : 0);
        0qQ.A0A(A0u);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C66818MdA(AnonymousClass7FX.A03(context, userSession, r6, A0Y, r15, r9), Md5.A00(context, userSession, C66582MXn.A0U(userSession, r13, A0Y, r15, r1), r13, A0Y), A0u);
    }
}
