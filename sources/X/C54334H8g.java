package X;

import android.util.Pair;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;

/* renamed from: X.H8g  reason: case insensitive filesystem */
public final class C54334H8g extends C230372pW {
    public final C51984GAh A00;
    public final UserSession A01;
    public final C232852uY A02;
    public final AnonymousClass4DU A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54334H8g(UserSession userSession, C232852uY r5, AnonymousClass4DU r6, C51984GAh gAh, String str) {
        super(C51972G9s.A0c(userSession), new IP5(userSession, 1));
        0qQ.A0B(r5, 4);
        this.A01 = userSession;
        this.A04 = str;
        this.A03 = r6;
        this.A02 = r5;
        this.A00 = gAh;
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        Long l;
        Long l2;
        C267324bN r7 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        AnonymousClass7TG.A1N(r7, gDe);
        A00(r7, gDe, "impression");
        C51984GAh gAh = this.A00;
        int A09 = gDe.A09();
        0Aj A0e = AnonymousClass7TE.A0e(gAh.A01, AnonymousClass000.A00(3360));
        if (A0e.isSampled()) {
            IntentAwareAdsInfoIntf A002 = C57031ILx.A00(r7);
            C51970G9q.A17(A0e, Long.parseLong(C51966G9m.A1B(r7)));
            C51984GAh.A00(A0e, gAh, (long) A09);
            Long A0m = C51971G9r.A0m();
            Integer A0A = r7.A0A();
            String str = null;
            if (A0A != null) {
                l = C51969G9p.A0r(A0A);
            } else {
                l = null;
            }
            A0e.AAe("position", 0sr.A1M(new Long[]{A0m, l}));
            C51969G9p.A18(A0e, A002);
            C51970G9q.A1D(A0e, A002);
            Integer BUY = A002.BUY();
            if (BUY != null) {
                l2 = C51969G9p.A0r(BUY);
            } else {
                l2 = null;
            }
            A0e.A9F("multi_ads_type_number", l2);
            C51969G9p.A1A(A0e, gAh.A00);
            A0e.A9F("hscroll_seed_ad_id", C51972G9s.A0j(A002.Br2()));
            A0e.A7p("is_seed_ad_multi_ads_eligible", A002.CbN());
            Integer A2P = C51966G9m.A0s(r7).A2P();
            if (A2P != null) {
                str = A2P.toString();
            }
            A0e.AAJ("imp_signature", str);
            A0e.Cgf();
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C267324bN r2 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        AnonymousClass7TG.A1N(r2, gDe);
        A00(r2, gDe, "sub_impression");
    }

    private final void A00(C267324bN r9, C52058GDe gDe, String str) {
        int i;
        Pair pair;
        int i2;
        int i3;
        int i4;
        boolean z;
        AnonymousClass3OA A06 = r9.A06();
        C232852uY r2 = this.A02;
        AnonymousClass4DU r1 = this.A03;
        AnonymousClass3W1 r6 = gDe.A0E;
        if (r6 != null) {
            i = r6.getPosition();
        } else {
            i = -1;
        }
        C254523sc A062 = r2.A06(r1, A06, str, i);
        if (A062 != null) {
            A062.A03();
            A062.A02();
            A062.A6L = this.A04;
            UserSession userSession = this.A01;
            A062.A0K(userSession, A06);
            1Xj r5 = A06.A0K;
            if (r6 != null) {
                pair = r6.A04();
                if (pair != null) {
                    A062.A6P = (String) pair.first;
                    A062.A69 = (String) pair.second;
                }
            } else {
                pair = null;
            }
            Integer A2J = r5.A2J();
            if (A2J != null) {
                A062.A0E = A2J.intValue();
            }
            if (pair != null) {
                String str2 = (String) pair.first;
                if (str2 != null) {
                    A062.A6E = str2;
                }
                String str3 = (String) pair.second;
                if (str3 != null) {
                    A062.A6D = str3;
                }
            }
            if (r6 != null) {
                Pair A032 = r6.A03();
                if (A032 != null) {
                    Number number = (Number) A032.first;
                    if (number != null) {
                        A062.A0D = number.intValue();
                    }
                    Number number2 = (Number) A032.second;
                    if (number2 != null) {
                        A062.A0C = number2.intValue();
                    }
                }
                i2 = r6.A0H;
            } else {
                i2 = -1;
            }
            A062.A0Q(Integer.valueOf(i2));
            if (r6 != null) {
                i3 = r6.A0J;
            } else {
                i3 = -1;
            }
            A062.A0R(Integer.valueOf(i3));
            if (r6 != null) {
                i4 = r6.A0N;
            } else {
                i4 = -1;
            }
            A062.A0U(Integer.valueOf(i4));
            if (r6 != null) {
                z = r6.A2R;
            } else {
                z = false;
            }
            A062.A8A = z;
            A062.A7U = GYJ.A00(r9);
            A062.A5h = DbX.A0t(r5.A2P());
            A062.A0D(r9.A00());
            A062.A3x = DbS.A0j(C51967G9n.A04(r9.A0A(), -1));
            C233822wX.A0H(userSession, A062, r1);
        }
    }
}
