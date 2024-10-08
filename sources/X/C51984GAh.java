package X;

import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GAh  reason: case insensitive filesystem */
public final class C51984GAh {
    public final AnonymousClass0iw A00;
    public final 0wc A01;
    public final UserSession A02;
    public final C249763kK A03;

    public final void A01(IntentAwareAdsInfoIntf intentAwareAdsInfoIntf, Boolean bool, List list) {
        Long l;
        0qQ.A0B(intentAwareAdsInfoIntf, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, C273654mx.A00(755));
        Long l2 = null;
        if (A0e.isSampled()) {
            A00(A0e, this, 0);
            C51969G9p.A1A(A0e, this.A00);
            C51970G9q.A1D(A0e, intentAwareAdsInfoIntf);
            Integer BUY = intentAwareAdsInfoIntf.BUY();
            if (BUY != null) {
                l = C51969G9p.A0r(BUY);
            } else {
                l = null;
            }
            A0e.A9F("multi_ads_type_number", l);
            A0e.A9F("hscroll_seed_ad_id", C51972G9s.A0j(intentAwareAdsInfoIntf.Br2()));
            Integer Br3 = intentAwareAdsInfoIntf.Br3();
            if (Br3 != null) {
                l2 = C51969G9p.A0r(Br3);
            }
            A0e.A9F("hscroll_seed_ad_position", l2);
            A0e.AAe("ad_ids", list);
            A0e.AAJ("multi_ads_id", intentAwareAdsInfoIntf.BUa());
            C51969G9p.A18(A0e, intentAwareAdsInfoIntf);
            A0e.AAJ("insertion_mechanism", intentAwareAdsInfoIntf.BHg());
            A0e.A7p("is_seed_ad_multi_ads_eligible", intentAwareAdsInfoIntf.CbN());
            A0e.AAJ("hscroll_seed_ad_tracking_token", intentAwareAdsInfoIntf.Br4());
            A0e.A7p("is_seed_ad_multi_ads_eligible", bool);
            A0e.Cgf();
        }
    }

    public final void A02(IntentAwareAdsInfoIntf intentAwareAdsInfoIntf, String str) {
        long j;
        0qQ.A0B(intentAwareAdsInfoIntf, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, AnonymousClass000.A00(1477));
        Long l = null;
        if (A0e.isSampled()) {
            Integer Br3 = intentAwareAdsInfoIntf.Br3();
            if (Br3 != null) {
                j = (long) Br3.intValue();
            } else {
                j = -1;
            }
            A0e.A9F("hscroll_seed_ad_position", Long.valueOf(j));
            C51969G9p.A1B(A0e, this.A03);
            A0e.AAJ("contextual_ads_category", "");
            A0e.A9F("chaining_position", C51971G9r.A0m());
            C51965G9l.A1R(A0e, "");
            C51969G9p.A1A(A0e, this.A00);
            C51970G9q.A1D(A0e, intentAwareAdsInfoIntf);
            A0e.AAJ("invalidation_reason", str);
            Integer BUY = intentAwareAdsInfoIntf.BUY();
            if (BUY != null) {
                l = C51969G9p.A0r(BUY);
            }
            A0e.A9F("multi_ads_type_number", l);
            C51974G9v.A0n(A0e, intentAwareAdsInfoIntf, C51972G9s.A0i(intentAwareAdsInfoIntf.Br2()));
            A0e.Cgf();
        }
    }

    public final void A03(C267324bN r6, Integer num, int i) {
        Long l;
        String str;
        Long l2;
        0qQ.A0B(r6, 2);
        if (r6.A0F()) {
            0Aj A0e = AnonymousClass7TE.A0e(this.A01, AnonymousClass000.A00(3359));
            if (A0e.isSampled()) {
                IntentAwareAdsInfoIntf A002 = C57031ILx.A00(r6);
                C51970G9q.A17(A0e, Long.parseLong(C51966G9m.A1B(r6)));
                A00(A0e, this, (long) i);
                Long A0m = C51971G9r.A0m();
                Integer A0A = r6.A0A();
                String str2 = null;
                if (A0A != null) {
                    l = C51969G9p.A0r(A0A);
                } else {
                    l = null;
                }
                A0e.AAe("position", 0sr.A1M(new Long[]{A0m, l}));
                switch (num.intValue()) {
                    case 0:
                        str = "card";
                        break;
                    case 1:
                        str = "cta";
                        break;
                    case 2:
                        str = C273654mx.A00(368);
                        break;
                    case 3:
                        str = C273654mx.A00(899);
                        break;
                    default:
                        str = "detached_headline";
                        break;
                }
                A0e.AAJ(C273654mx.A00(C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION), str);
                C51969G9p.A18(A0e, A002);
                C51970G9q.A1D(A0e, A002);
                Integer BUY = A002.BUY();
                if (BUY != null) {
                    l2 = C51969G9p.A0r(BUY);
                } else {
                    l2 = null;
                }
                A0e.A9F("multi_ads_type_number", l2);
                C51969G9p.A1A(A0e, this.A00);
                A0e.A9F("hscroll_seed_ad_id", C51972G9s.A0j(A002.Br2()));
                A0e.A7p("is_seed_ad_multi_ads_eligible", A002.CbN());
                C51965G9l.A1L(A0e, r6.ByO(this.A02));
                Integer A2P = C51966G9m.A0s(r6).A2P();
                if (A2P != null) {
                    str2 = A2P.toString();
                }
                A0e.AAJ("imp_signature", str2);
                A0e.Cgf();
                return;
            }
            return;
        }
        throw DbT.A0m();
    }

    public C51984GAh(AnonymousClass0iw r2, UserSession userSession, C249763kK r4) {
        AnonymousClass7TG.A1U(userSession, r4, r2);
        this.A02 = userSession;
        this.A03 = r4;
        this.A00 = r2;
        this.A01 = C51972G9s.A0a(r2, userSession);
    }

    public static void A00(0Aj r3, C51984GAh gAh, long j) {
        r3.A9F("chaining_position", Long.valueOf(j));
        C249763kK r2 = gAh.A03;
        r3.AAJ("chaining_session_id", r2.getSessionId());
        r3.AAJ("client_session_id", r2.getSessionId());
        r3.AAJ("contextual_ads_category", "");
    }
}
