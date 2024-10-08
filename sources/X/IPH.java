package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class IPH implements C250603lj {
    public final AnonymousClass2z2 A00;
    public final 1Ua A01;
    public final AnonymousClass2pP A02;

    public IPH(Context context, UserSession userSession, AnonymousClass4DU r12, C249763kK r13) {
        this.A02 = new AnonymousClass2pP(C60510iO.A00(userSession), true);
        1Ua A002 = 1UX.A00(context, userSession);
        0qQ.A07(A002);
        this.A01 = A002;
        this.A00 = new AnonymousClass2z2(userSession, r12, (C228182kv) null, r13, A002, "instagram_ad_vpvd_imp");
    }

    public final void ATF(AnonymousClass30Y r8, C252093oY r9) {
        boolean A1U = AnonymousClass7TF.A1U(0, r8, r9);
        AnonymousClass3OA A07 = ((C267324bN) r8.A03).A07();
        if (A07 != null) {
            AnonymousClass2pP r3 = this.A02;
            C254213s7 A002 = r3.A00(A07.A0S);
            AnonymousClass3W1 r1 = ((C52058GDe) r8.A04).A0E;
            if (r1 != null) {
                Integer CEk = r9.CEk(r8);
                0qQ.A07(CEk);
                int intValue = CEk.intValue();
                if (intValue == 0 || intValue == A1U) {
                    A002.A03(r8, r9);
                    return;
                }
                A002.A04(r9);
                r3.A01(this.A00, A002, A07, r1);
            }
        }
    }
}
