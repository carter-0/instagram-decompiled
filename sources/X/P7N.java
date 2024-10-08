package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class P7N implements C328347El {
    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r13, C331837So r14, AnonymousClass7L2 r15, 17i r16, boolean z) {
        C328607Fl A03;
        AnonymousClass7LQ r7 = (AnonymousClass7LQ) r14;
        Context context2 = context;
        UserSession userSession2 = userSession;
        AnonymousClass9HC r6 = r13;
        AnonymousClass7L2 r8 = r15;
        17i r9 = r16;
        AnonymousClass752 A04 = C3259874y.A04(context2, userSession2, r6, r7, r8, r9);
        boolean z2 = A04.A04 instanceof AnonymousClass754;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        if (z2) {
            A03 = AnonymousClass7FX.A04(context2, userSession2, r6, r7, r8, r9);
        } else {
            A03 = AnonymousClass7FX.A03(context2, userSession2, r6, r7, r8, r9);
        }
        return new AnonymousClass75S(A03, A04, C66582MXn.A0t(r7.A0e, AnonymousClass760.A00(userSession, z) ? 1 : 0));
    }
}
