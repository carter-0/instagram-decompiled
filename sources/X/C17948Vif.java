package X;

import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Vif  reason: case insensitive filesystem */
public final class C17948Vif {
    public final void A01(UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        long currentTimeMillis = System.currentTimeMillis();
        String A0j = AnonymousClass7TG.A0j();
        0wc r1 = VKs.A00;
        UserSession userSession2 = userSession;
        if (r1 == null) {
            r1 = AnonymousClass0kN.A02(userSession2);
            VKs.A00 = r1;
        }
        0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.common.analytics.structuredlogger.IgTypedLogger");
        0Aj A0e = AnonymousClass7TE.A0e(r1, "instagram_smart_prefetch_ad_cta_impression");
        String str8 = str3;
        String str9 = str4;
        String str10 = str6;
        String str11 = str7;
        String str12 = str;
        if (A0e.isSampled()) {
            A0e.AAJ("product_id", str12);
            A0e.AAJ("ad_id", str8);
            A0e.AAJ("ad_tracking_token", str9);
            C13988Tno.A1C(A0e, str10);
            A0e.AAJ("prior_submodule", str11);
            C51969G9p.A1C(A0e, A0j);
        }
        VKs.A03.put(str12, Long.valueOf(currentTimeMillis));
        VKs.A05.put(str12, 0Yt.A06(new 0eP[]{new 0eP("product_id", str12), new 0eP("ad_id", str8), new 0eP("ad_tracking_token", str9), new 0eP("prior_module", str10), new 0eP("prior_submodule", str11), new 0eP("ad_media_id", str5), new 0eP("merchant_id", str2), new 0eP(SAn.A00(0, 10, 33), A0j)}));
        VKs.A02.remove(str12);
        AnonymousClass7TF.A0D().postDelayed(new C20195Wmt(userSession2, str12), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
    }

    public final void A00(UserSession userSession, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        if (VKs.A03.get(str) != null) {
            Pxe.A1X(str, VKs.A02, System.currentTimeMillis());
            0wc r1 = VKs.A00;
            if (r1 == null) {
                r1 = AnonymousClass0kN.A02(userSession);
                VKs.A00 = r1;
            }
            0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.common.analytics.structuredlogger.IgTypedLogger");
            0Aj A0e = AnonymousClass7TE.A0e(r1, "instagram_smart_prefetch_ad_cta_disappear");
            if (A0e.isSampled()) {
                A0e.AAJ("product_id", str);
                ConcurrentHashMap concurrentHashMap = VKs.A05;
                Map map = (Map) concurrentHashMap.get(str);
                String str6 = null;
                if (map != null) {
                    str2 = DbT.A11("ad_id", map);
                } else {
                    str2 = null;
                }
                Map A0w = C13989Tnp.A0w(A0e, str, "ad_id", str2, concurrentHashMap);
                if (A0w != null) {
                    str3 = DbT.A11("ad_tracking_token", A0w);
                } else {
                    str3 = null;
                }
                Map A0w2 = C13989Tnp.A0w(A0e, str, "ad_tracking_token", str3, concurrentHashMap);
                if (A0w2 != null) {
                    str4 = DbT.A11("prior_module", A0w2);
                } else {
                    str4 = null;
                }
                Map A0w3 = C13989Tnp.A0w(A0e, str, "prior_module", str4, concurrentHashMap);
                if (A0w3 != null) {
                    str5 = DbT.A11("prior_submodule", A0w3);
                } else {
                    str5 = null;
                }
                Map A0w4 = C13989Tnp.A0w(A0e, str, "prior_submodule", str5, concurrentHashMap);
                if (A0w4 != null) {
                    str6 = DbU.A0r(SAn.A00(0, 10, 33), A0w4);
                }
                C51969G9p.A1C(A0e, str6);
            }
        }
    }
}
