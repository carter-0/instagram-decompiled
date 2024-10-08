package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Hys  reason: case insensitive filesystem */
public abstract class C56460Hys {
    public static final Map A00;

    public static final String A00(UserSession userSession, String str, boolean z) {
        if (z && 182.A06(0Tu.A05, userSession, 36319390212168909L) && str != null && str.length() != 0) {
            Map map = A00;
            Iterator A16 = DbV.A16(map);
            while (true) {
                if (!A16.hasNext()) {
                    break;
                }
                String A18 = AnonymousClass7TE.A18(A16);
                if (00l.A0d(str, A18, false)) {
                    String A11 = DbT.A11(A18, map);
                    if (A11 != null) {
                        return A11;
                    }
                }
            }
        }
        return str;
    }

    static {
        0eP[] r3 = new 0eP[28];
        System.arraycopy(DbW.A1b("suicide_or_self_harm_concern-eating_disorder", "ig_ad_offensive"), AnonymousClass7TF.A1X(new 0eP[]{AnonymousClass7TE.A1L("fraud_or_scam-financial_or_identity_scam", "ig_ad_scam_misleading"), AnonymousClass7TE.A1L("fraud_or_scam-misleading_product_or_service", "ig_ad_scam_misleading"), AnonymousClass7TE.A1L("fake_celebrity_endorsement", "ig_ad_scam_misleading"), AnonymousClass7TE.A1L("fake_advertiser", "ig_ad_business_impersonation"), AnonymousClass7TE.A1L("misleading_annoying_or_scam-annoying_or_spam", "ig_ad_spam"), AnonymousClass7TE.A1L("false_news", "ig_ad_scam_misleading"), AnonymousClass7TE.A1L("unauthorized_political_ad", "ig_ad_political"), AnonymousClass7TE.A1L("adult_content-threatening_to_share_nude_images", "ig_ad_sexually_inappropriate"), AnonymousClass7TE.A1L("adult_content-prostitution", "ig_ad_sexually_inappropriate"), AnonymousClass7TE.A1L("adult_content-sexual_exploitation", "ig_ad_sexually_inappropriate"), AnonymousClass7TE.A1L("adult_content-nudity_or_sexual_activity", "ig_ad_sexually_inappropriate"), AnonymousClass7TE.A1L("violent_hateful_or_disturbing-credible_threat", "ig_ad_violent_prohibited"), AnonymousClass7TE.A1L("human_trafficking", "ig_ad_violent_prohibited"), AnonymousClass7TE.A1L("violence_hate_or_exploitation-sexual_exploitation-yes", "ig_ad_violent_prohibited"), AnonymousClass7TE.A1L("violence_hate_or_exploitation-sexual_exploitation-no", "ig_ad_violent_prohibited"), AnonymousClass7TE.A1L("violent_hateful_or_disturbing-terrorism", "ig_ad_violent_prohibited"), AnonymousClass7TE.A1L("violent_hateful_or_disturbing-violence", "ig_ad_violent_prohibited"), AnonymousClass7TE.A1L("violent_hateful_or_disturbing-organised_crime", "ig_ad_violent_prohibited"), AnonymousClass7TE.A1L("violent_hateful_or_disturbing-promotes_hate-organised_hate_group", "ig_ad_violent_prohibited"), AnonymousClass7TE.A1L("violent_hateful_or_disturbing-promotes_hate-contains_hateful_speech", "ig_ad_violent_prohibited"), AnonymousClass7TE.A1L("violent_hateful_or_disturbing-violence_death_or_severe_injury", "ig_ad_violent_prohibited"), AnonymousClass7TE.A1L("violent_hateful_or_disturbing-animal_abuse", "ig_ad_violent_prohibited"), AnonymousClass7TE.A1L("harrassment_or_abuse-harassment-me", "ig_ad_offensive"), AnonymousClass7TE.A1L("ig_bullying_or_harassment-harassment-someone_i_know_v3", "ig_ad_offensive"), AnonymousClass7TE.A1L("harrassment_or_abuse-harassment-someone_i_dont_know", "ig_ad_offensive"), AnonymousClass7TE.A1L("intellectual_property", "ig_ad_ip_violation"), AnonymousClass7TE.A1L("suicide_or_self_harm_concern-suicide_or_self_injury", "ig_ad_offensive")}, r3) ? 1 : 0, r3, 27, 1);
        A00 = 0Yt.A06(r3);
    }
}
