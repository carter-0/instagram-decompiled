package X;

import android.content.Context;
import android.graphics.PointF;
import com.instagram.common.session.UserSession;

public final class P7D implements C328347El {
    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r21, C331837So r22, AnonymousClass7L2 r23, 17i r24, boolean z) {
        C328607Fl A04;
        Context context2 = context;
        AnonymousClass7LQ A0Y = C66581MXm.A0Y(r22, context2);
        UserSession userSession2 = userSession;
        AnonymousClass7L2 r10 = r23;
        C51974G9v.A1P(userSession2, r24, r10, A0Y);
        AnonymousClass9HC r7 = r21;
        0qQ.A0B(r7, 5);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        C254703su r2 = A0Y.A0e;
        boolean z2 = !AnonymousClass9J6.A00(6, r2.A1T);
        17i A00 = 17h.A00(userSession2);
        if (z2) {
            0qQ.A0B(A00, 2);
            A04 = AnonymousClass7FX.A00(context2, (PointF) null, userSession2, r7, (C3262275x) null, A0Y, r10, A00, true, false);
        } else {
            A04 = AnonymousClass7FX.A04(context2, userSession2, r7, A0Y, r10, A00);
        }
        String A0s = C66582MXn.A0s(userSession2, r2, z);
        0qQ.A0A(A0s);
        return new N6C(A04, C66837MdV.A00(context2, userSession2, r7, A0Y, r10), A0s);
    }
}
