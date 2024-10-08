package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.P7n  reason: case insensitive filesystem */
public final class C72478P7n implements C328347El {
    public final AnonymousClass9HO A00;

    /* renamed from: A00 */
    public final N6L AWb(Context context, UserSession userSession, AnonymousClass9HC r20, AnonymousClass7LQ r21, AnonymousClass7L2 r22, 17i r23, boolean z) {
        AnonymousClass7LQ r9 = r21;
        Context context2 = context;
        UserSession userSession2 = userSession;
        AnonymousClass9HC r8 = r20;
        AnonymousClass7L2 r10 = r22;
        AnonymousClass79c A06 = AnonymousClass79S.A06(context2, userSession2, this.A00, r8, r9, r10, r9.A0U, r9.A0V);
        String A0t = C66582MXn.A0t(r9.A0e, AnonymousClass760.A00(userSession2, z) ? 1 : 0);
        return new N6L(AnonymousClass7FX.A03(context2, userSession2, r8, r9, r10, r23), new NYG(A06, A06.CBF()), A0t);
    }

    public C72478P7n(AnonymousClass9HO r1) {
        this.A00 = r1;
    }
}
