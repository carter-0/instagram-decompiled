package X;

import com.facebook.common.dextricks.DexOptimization;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gak  reason: case insensitive filesystem */
public final class C52672Gak {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;

    public static final 1Ln A00(C52672Gak gak, Long l, String str, String str2, String str3) {
        long j;
        Long A10;
        UserSession userSession = gak.A01;
        1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(AnonymousClass0kN.A01(gak.A00, userSession), "ig_lead_gen_ads_preclick_consumer"), 223);
        String str4 = gak.A03;
        long j2 = 0;
        if (str4 == null || (A10 = AnonymousClass7TE.A10(str4)) == null) {
            j = 0;
        } else {
            j = A10.longValue();
        }
        A0U.A0Q("lead_form_id", Long.valueOf(j));
        A0U.A0R("event_type", DexOptimization.OPT_KEY_CLIENT);
        A0U.A0R(TraceFieldType.AdhocEventName, str3);
        A0U.A0R("flow_step", str2);
        A0U.A0R(AnonymousClass000.A00(3137), str);
        String fbidV2 = DbX.A0m(userSession).getFbidV2();
        if (fbidV2 != null) {
            j2 = C51967G9n.A08(AnonymousClass7TE.A10(fbidV2), 0);
        }
        A0U.A0Q("user_igid", Long.valueOf(j2));
        A0U.A0R("ad_id", gak.A02);
        A0U.A0Q("dwell_time", l);
        return A0U;
    }

    public static final String A01(C250943mJ r1) {
        if (r1 == null) {
            return null;
        }
        C55038Hb9 hb9 = C55038Hb9.$redex_init_class;
        int ordinal = r1.ordinal();
        if (ordinal == 4) {
            return "lead_ads_reels_offsite_generic_question";
        }
        if (ordinal == 1) {
            return "lead_ads_reels_first_question";
        }
        if (ordinal == 2) {
            return "lead_ads_reels_first_question_short_answer";
        }
        return null;
    }

    public static String A02(GFJ gfj) {
        return A01(gfj.A06.A06().A0L);
    }

    public static void A03(C52672Gak gak, Long l, String str, String str2) {
        A00(gak, l, str, str2, "click").Cgf();
    }

    public static void A04(C52672Gak gak, String str, String str2) {
        A00(gak, (Long) null, str, str2, "click").Cgf();
    }

    public C52672Gak(AnonymousClass0iw r1, UserSession userSession, String str, String str2) {
        AnonymousClass7TG.A1O(userSession, r1);
        this.A01 = userSession;
        this.A00 = r1;
        this.A03 = str;
        this.A02 = str2;
    }
}
