package X;

import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class GB0 implements C250603lj {
    public final UserSession A00;
    public final C230292pL A01;
    public final AnonymousClass2pP A02;
    public final C51984GAh A03;

    public final void ATF(AnonymousClass30Y r14, C252093oY r15) {
        Runnable runnable;
        boolean A1U = AnonymousClass7TF.A1U(0, r14, r15);
        Object obj = r14.A03;
        if (!((C267324bN) obj).A0F()) {
            obj = null;
        }
        C267324bN r6 = (C267324bN) obj;
        if (r6 != null) {
            C254213s7 A002 = this.A02.A00(r6.getId());
            float CFe = r15.CFe(r14);
            Integer CEk = r15.CEk(r14);
            0qQ.A07(CEk);
            int intValue = CEk.intValue();
            if (intValue == 0) {
                A002.A03(r14, r15);
                C230292pL r1 = this.A01;
                if (r1 != null) {
                    r1.A00(((C52058GDe) r14.A04).A09());
                }
            } else if (intValue != A1U) {
                A002.A04(r15);
                if (A002.A05 >= 250) {
                    C51984GAh gAh = this.A03;
                    long A09 = (long) ((C52058GDe) r14.A04).A09();
                    long j = A002.A05;
                    0Aj A0e = AnonymousClass7TE.A0e(gAh.A01, AnonymousClass000.A00(3362));
                    Long l = null;
                    if (A0e.isSampled()) {
                        IntentAwareAdsInfoIntf A003 = C57031ILx.A00(r6);
                        List<AnonymousClass3OA> A022 = C57031ILx.A02(r6);
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        for (AnonymousClass3OA r62 : A022) {
                            String str = r62.A0S;
                            0qQ.A0B(str, 0);
                            C51973G9u.A1F(str, A1C);
                        }
                        A0e.A9F("chaining_position", Long.valueOf(A09));
                        C249763kK r7 = gAh.A03;
                        C51965G9l.A1R(A0e, r7.getSessionId());
                        C51969G9p.A1B(A0e, r7);
                        A0e.A9F("sum_duration_ms", Long.valueOf(j));
                        A0e.AAe("ad_ids", A1C);
                        A0e.A9F("first_hscroll_item_ad_id", (Long) 00k.A0J(A1C));
                        C51969G9p.A1A(A0e, gAh.A00);
                        Integer BUY = A003.BUY();
                        if (BUY != null) {
                            l = C51969G9p.A0r(BUY);
                        }
                        A0e.A9F("multi_ads_type_number", l);
                        C51969G9p.A18(A0e, A003);
                        A0e.AAJ("insertion_mechanism", A003.BHg());
                        C51974G9v.A0n(A0e, A003, C51972G9s.A0i(A003.Br2()));
                        C51970G9q.A1D(A0e, A003);
                        A0e.Cgf();
                    }
                }
                C230292pL r2 = this.A01;
                if (!(r2 == null || (runnable = r2.A03) == null)) {
                    r2.A08.removeCallbacks(runnable);
                    r2.A07 = false;
                }
                A002.A02();
            } else {
                A002.A03(r14, r15);
                C230292pL r5 = this.A01;
                if (r5 != null) {
                    if (r6.A03().A00 == 10 && ((double) CFe) >= 1.0d && r5.A01 == AnonymousClass05K.A00) {
                        if (182.A06(0Tu.A06, this.A00, 36319239892114510L)) {
                            String BUa = C57031ILx.A00(r6).BUa();
                            if (BUa != null) {
                                r5.A02(BUa, "476267598351478");
                            } else {
                                throw AnonymousClass7TE.A0y();
                            }
                        }
                    }
                    if (r5.A01.intValue() == A1U) {
                        r5.A01 = AnonymousClass05K.A0C;
                    }
                }
            }
        }
    }

    public GB0(UserSession userSession, C230292pL r5, C51984GAh gAh) {
        this.A00 = userSession;
        this.A03 = gAh;
        this.A01 = r5;
        this.A02 = new AnonymousClass2pP(C60510iO.A00(userSession), true);
    }
}
