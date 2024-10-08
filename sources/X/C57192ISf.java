package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.ISf  reason: case insensitive filesystem */
public final class C57192ISf implements C229742nx {
    public final /* synthetic */ C52766GcJ A00;

    public C57192ISf(C52766GcJ gcJ) {
        this.A00 = gcJ;
    }

    public final /* bridge */ /* synthetic */ void DM1(Object obj, int i, int i2) {
        1Xg r11 = (1Xg) obj;
        0qQ.A0B(r11, 0);
        AnonymousClass1Xn r1 = r11.A05;
        if (r1 instanceof 1Xl) {
            1Xj A02 = 1Xi.A02(r1);
            if (A02 != null) {
                C52766GcJ gcJ = this.A00;
                UserSession userSession = gcJ.A05;
                C271794jb r2 = new C271794jb(userSession, A02);
                AnonymousClass4DU r4 = gcJ.A08;
                C233822wX.A0N(userSession, r2, A02, r4, AnonymousClass05K.A01, "delivery");
                if (A02.CcK() && !C271854jh.A00(userSession, A02) && !C228342lQ.A08(userSession, 1Au.A00(userSession))) {
                    C233822wX.A0O(userSession, r2, A02, r4, Integer.valueOf(A02.A0m()), "duplicate_ad_received", A02.A2p(), AnonymousClass7TE.A1I("duplicate_ad_inserted"), AnonymousClass7TE.A1I("duplicate_ad_received"));
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
