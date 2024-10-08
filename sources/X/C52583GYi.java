package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.GYi  reason: case insensitive filesystem */
public final class C52583GYi implements C250603lj {
    public final AnonymousClass2z7 A00;
    public final 1Ua A01;
    public final AnonymousClass2pP A02;

    public C52583GYi(Context context, UserSession userSession, AnonymousClass4DU r12, C249763kK r13) {
        this.A02 = new AnonymousClass2pP(C60510iO.A00(userSession), true);
        1Ua A002 = 1UX.A00(context, userSession);
        0qQ.A07(A002);
        this.A01 = A002;
        this.A00 = new AnonymousClass2z7(userSession, r12, (C228182kv) null, r13, A002, "instagram_organic_carousel_vpvd_imp");
    }

    public final void ATF(AnonymousClass30Y r8, C252093oY r9) {
        boolean A1U = AnonymousClass7TF.A1U(0, r8, r9);
        C267324bN r2 = (C267324bN) r8.A03;
        1Xj r4 = r2.A02;
        if (r4 != null && r2.A01 == C295365o2.ORGANIC) {
            AnonymousClass2pP r3 = this.A02;
            C254213s7 A002 = r3.A00(r2.getId());
            int A0A = C51968G9o.A0A(r8, r9);
            if (A0A == 0 || A0A == A1U) {
                A002.A03(r8, r9);
                return;
            }
            A002.A04(r9);
            AnonymousClass2z7 r1 = this.A00;
            if (r1 instanceof C230332pS) {
                r3.A01(r1, A002, r4, r8.A04);
            }
        }
    }
}
