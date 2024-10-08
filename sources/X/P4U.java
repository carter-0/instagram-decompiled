package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;

public final /* synthetic */ class P4U implements C327387Ao {
    public final /* synthetic */ C327367Am A00;

    public /* synthetic */ P4U(C327367Am r1) {
        this.A00 = r1;
    }

    public final AnonymousClass7FW AXU(Context context, UserSession userSession, AnonymousClass9HC r19, AnonymousClass7LQ r20, AnonymousClass7L2 r21) {
        AnonymousClass7LQ r12 = r20;
        C254703su r1 = r12.A0e;
        AnonymousClass53G r2 = r1.A12;
        r2.getClass();
        AnonymousClass9IE r0 = r2.A00;
        r0.getClass();
        DirectMessageIdentifier A0V = r1.A0V();
        String A0t = C51971G9r.A0t(r12.A0K);
        Boolean bool = Boolean.TRUE;
        boolean equals = bool.equals(r2.A03);
        0t0 A01 = AnonymousClass0eN.A01(new C73464Pd6(0));
        2FW r14 = 2FW.A0K;
        UserSession userSession2 = userSession;
        AnonymousClass9HC r11 = r19;
        AnonymousClass7FE A04 = AnonymousClass7FD.A04(userSession2, r11, r12, r21, r14, A01);
        return new C328707Fv(AnonymousClass7FG.A00(context, userSession2, r11, r12, r14), A04, A0V, (GifUrlImpl) r0.A00, A0t, equals, false, bool.equals(r2.A02));
    }
}
