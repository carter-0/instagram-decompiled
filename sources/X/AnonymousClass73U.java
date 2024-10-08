package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.73U  reason: invalid class name */
public final class AnonymousClass73U implements C328347El {
    public final AnonymousClass9HO A00;

    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r17, C331837So r18, AnonymousClass7L2 r19, 17i r20, boolean z) {
        String A0i;
        AnonymousClass7LQ r10 = (AnonymousClass7LQ) r18;
        Context context2 = context;
        0qQ.A0B(context, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        17i r5 = r20;
        0qQ.A0B(r5, 2);
        AnonymousClass7L2 r11 = r19;
        0qQ.A0B(r11, 3);
        0qQ.A0B(r10, 4);
        AnonymousClass9HC r9 = r17;
        0qQ.A0B(r9, 5);
        boolean A002 = AnonymousClass760.A00(userSession2, z);
        C254703su r0 = r10.A0e;
        if (!A002) {
            A0i = r0.A0h();
        } else {
            A0i = r0.A0i();
        }
        0qQ.A0A(A0i);
        return new AnonymousClass748(AnonymousClass7FX.A05(context2, userSession2, r9, r10, r11, r5, false), AnonymousClass79S.A06(context2, userSession2, this.A00, r9, r10, r11, r10.A0U, r10.A0V), A0i);
    }

    public AnonymousClass73U(AnonymousClass9HO r1) {
        this.A00 = r1;
    }
}
