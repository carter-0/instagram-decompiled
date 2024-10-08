package X;

import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.Hbv  reason: case insensitive filesystem */
public abstract class C55086Hbv {
    public static final void A00(HOF hof, AnonymousClass0iw r4, UserSession userSession, String str, String str2, List list) {
        C54679HOk hOk;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), "bi_ad_preferences_recent_ad_activity");
        Long A10 = AnonymousClass7TE.A10(userSession.A06);
        if (A10 != null && A0e.isSampled()) {
            A0e.A9F("viewer_id", A10);
            A0e.A8M(hof, "event_type");
            A0e.AAJ(C273654mx.A00(615), str);
            A0e.AAJ(AnonymousClass000.A00(3599), str2);
            A0e.AAe("ads", list);
            switch (C228342lQ.A01(1Au.A00(userSession)).ordinal()) {
                case 1:
                    hOk = C54679HOk.BASIC_ADS_TIER_0;
                    break;
                case 2:
                    hOk = C54679HOk.BASIC_ADS_TIER_A;
                    break;
                case 4:
                    hOk = C54679HOk.BASIC_ADS_TIER_B;
                    break;
                case 5:
                    hOk = C54679HOk.BASIC_ADS_TIER_C;
                    break;
                case 7:
                    hOk = C54679HOk.BASIC_ADS_TIER_C_TEST;
                    break;
                case 11:
                    hOk = C54679HOk.BASIC_ADS_TIER_P;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    hOk = C54679HOk.BASIC_ADS_TIER_SHARED;
                    break;
                case 13:
                    hOk = C54679HOk.BASIC_ADS_TIER_YOUTH;
                    break;
                default:
                    hOk = C54679HOk.BASIC_ADS_TIER_NONE;
                    break;
            }
            A0e.A8M(hOk, "basic_ads_tier");
            A0e.Cgf();
        }
    }
}
