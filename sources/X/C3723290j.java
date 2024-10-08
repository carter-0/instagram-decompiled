package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.90j  reason: invalid class name and case insensitive filesystem */
public final class C3723290j implements C328347El {
    public final String A00;

    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r16, C331837So r17, AnonymousClass7L2 r18, 17i r19, boolean z) {
        String A0i;
        AnonymousClass7LQ r10 = (AnonymousClass7LQ) r17;
        Context context2 = context;
        0qQ.A0B(context, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 1);
        17i r5 = r19;
        0qQ.A0B(r5, 2);
        AnonymousClass7L2 r11 = r18;
        0qQ.A0B(r11, 3);
        0qQ.A0B(r10, 4);
        AnonymousClass9HC r9 = r16;
        0qQ.A0B(r9, 5);
        C300915yA r3 = new C300915yA(userSession);
        C254793t3 r2 = r10.A0G.A0P;
        if (r2 != null) {
            C254703su r1 = r10.A0e;
            0qQ.A07(r1);
            r3.A02(r1, r2, r10.A0G.A08);
        }
        boolean A002 = AnonymousClass760.A00(userSession, z);
        C254703su r0 = r10.A0e;
        if (!A002) {
            A0i = r0.A0h();
        } else {
            A0i = r0.A0i();
        }
        0qQ.A0A(A0i);
        return new C66861Mdu(AnonymousClass7FX.A05(context, userSession, r9, r10, r11, r5, false), AnonymousClass90T.A05.A00(context2, userSession2, r9, r10, r11, this.A00), A0i);
    }

    public C3723290j(String str) {
        this.A00 = str;
    }
}
