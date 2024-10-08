package X;

import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Wmt  reason: case insensitive filesystem */
public final class C20195Wmt implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public C20195Wmt(UserSession userSession, String str) {
        this.A01 = str;
        this.A00 = userSession;
    }

    public final void run() {
        String str;
        String str2;
        String str3;
        String str4;
        ConcurrentHashMap concurrentHashMap = VKs.A03;
        String str5 = this.A01;
        if (concurrentHashMap.get(str5) != null && VKs.A02.get(str5) == null) {
            ConcurrentHashMap concurrentHashMap2 = VKs.A04;
            if (concurrentHashMap2.get(str5) == null) {
                UserSession userSession = this.A00;
                Pxe.A1X(str5, concurrentHashMap2, System.currentTimeMillis());
                0wc r1 = VKs.A00;
                if (r1 == null) {
                    r1 = AnonymousClass0kN.A02(userSession);
                    VKs.A00 = r1;
                }
                0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.common.analytics.structuredlogger.IgTypedLogger");
                0Aj A0e = AnonymousClass7TE.A0e(r1, "instagram_smart_prefetch_prefetch_triggered");
                if (A0e.isSampled()) {
                    A0e.AAJ("product_id", str5);
                    ConcurrentHashMap concurrentHashMap3 = VKs.A05;
                    Map map = (Map) concurrentHashMap3.get(str5);
                    String str6 = null;
                    if (map != null) {
                        str = DbT.A11("ad_id", map);
                    } else {
                        str = null;
                    }
                    Map A0w = C13989Tnp.A0w(A0e, str5, "ad_id", str, concurrentHashMap3);
                    if (A0w != null) {
                        str2 = DbT.A11("ad_tracking_token", A0w);
                    } else {
                        str2 = null;
                    }
                    Map A0w2 = C13989Tnp.A0w(A0e, str5, "ad_tracking_token", str2, concurrentHashMap3);
                    if (A0w2 != null) {
                        str3 = DbT.A11("prior_module", A0w2);
                    } else {
                        str3 = null;
                    }
                    Map A0w3 = C13989Tnp.A0w(A0e, str5, "prior_module", str3, concurrentHashMap3);
                    if (A0w3 != null) {
                        str4 = DbT.A11("prior_submodule", A0w3);
                    } else {
                        str4 = null;
                    }
                    Map A0w4 = C13989Tnp.A0w(A0e, str5, "prior_submodule", str4, concurrentHashMap3);
                    if (A0w4 != null) {
                        str6 = DbU.A0r(SAn.A00(0, 10, 33), A0w4);
                    }
                    C51969G9p.A1C(A0e, str6);
                }
            }
        }
    }
}
