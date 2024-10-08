package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.90I  reason: invalid class name */
public final class AnonymousClass90I implements C328347El {
    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r14, C331837So r15, AnonymousClass7L2 r16, 17i r17, boolean z) {
        String A0i;
        AnonymousClass7LQ r7 = (AnonymousClass7LQ) r15;
        Context context2 = context;
        0qQ.A0B(context, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 1);
        17i r9 = r17;
        0qQ.A0B(r9, 2);
        AnonymousClass7L2 r8 = r16;
        0qQ.A0B(r8, 3);
        0qQ.A0B(r7, 4);
        AnonymousClass9HC r6 = r14;
        0qQ.A0B(r14, 5);
        C300915yA r3 = new C300915yA(userSession);
        C254793t3 r2 = r7.A0G.A0P;
        if (r2 != null) {
            C254703su r1 = r7.A0e;
            0qQ.A07(r1);
            r3.A02(r1, r2, r7.A0G.A08);
        }
        boolean A00 = AnonymousClass760.A00(userSession, z);
        C254703su r0 = r7.A0e;
        if (!A00) {
            A0i = r0.A0h();
        } else {
            A0i = r0.A0i();
        }
        0qQ.A0A(A0i);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new N6R(AnonymousClass7FX.A05(context2, userSession2, r6, r7, r8, r9, false), C70010Nvo.A00(context, userSession, r14, r7, r8), A0i);
    }
}
