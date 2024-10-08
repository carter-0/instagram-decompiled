package X;

import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;

public final class IPI implements C250603lj {
    public final UserSession A00;
    public final AnonymousClass2pP A01;
    public final C51984GAh A02;

    public final void ATF(AnonymousClass30Y r15, C252093oY r16) {
        Long l;
        C252093oY r3 = r16;
        boolean A1U = AnonymousClass7TF.A1U(0, r15, r3);
        C267324bN r11 = (C267324bN) r15.A03;
        C254213s7 A002 = this.A01.A00(C51966G9m.A1B(r11));
        int A0A = C51968G9o.A0A(r15, r3);
        if (A0A == 0 || A0A == A1U) {
            A002.A03(r15, r3);
            return;
        }
        A002.A04(r3);
        if (A002.A05 >= 250) {
            C51984GAh gAh = this.A02;
            int A09 = ((C52058GDe) r15.A04).A09();
            long j = A002.A04;
            double d = (double) A002.A05;
            0Aj A0e = AnonymousClass7TE.A0e(gAh.A01, "instagram_ad_vpvd_imp");
            if (A0e.isSampled()) {
                1Xj A0s = C51966G9m.A0s(r11);
                0qQ.A0B(A0s, 0);
                String id = A0s.getId();
                if (id != null) {
                    Long A0g = C51972G9s.A0g(A0s);
                    if (A0g != null) {
                        IntentAwareAdsInfoIntf A003 = C57031ILx.A00(r11);
                        C51965G9l.A1I(A0e, id);
                        A0e.A9F("m_t", A0g);
                        A0e.A9F("max_duration_ms", Long.valueOf(j));
                        C51970G9q.A16(A0e, d);
                        String A1B = C51966G9m.A1B(r11);
                        0qQ.A0B(A1B, 0);
                        C51965G9l.A1D(A0e, 00y.A0n(10, A1B));
                        C51971G9r.A17(A0e, A09);
                        C51965G9l.A1R(A0e, gAh.A03.getSessionId());
                        A0e.AAJ("contextual_ads_category", "");
                        C51969G9p.A18(A0e, A003);
                        C51969G9p.A1A(A0e, gAh.A00);
                        String Br2 = A003.Br2();
                        if (Br2 != null) {
                            l = 00y.A0n(10, Br2);
                        } else {
                            l = null;
                        }
                        A0e.A9F("hscroll_seed_ad_id", l);
                        DbX.A1L(A0e);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
        }
        A002.A02();
    }

    public IPI(UserSession userSession, C51984GAh gAh) {
        this.A00 = userSession;
        this.A02 = gAh;
        this.A01 = C51972G9s.A0f(userSession);
    }
}
