package X;

import java.util.List;
import java.util.Map;

public abstract class GCG implements JR4 {
    public String A00 = AnonymousClass7TG.A0j();

    public static boolean A06(C52465GTr gTr) {
        return gTr.A01().A0N != null;
    }

    public final /* synthetic */ void Ciu(List list) {
    }

    public static void A02(0Aj r2, C52465GTr gTr, String str) {
        r2.AAJ("afi_type", str);
        r2.AAJ("ad_tracking_token", gTr.A01().A0j);
    }

    public static void A04(0Aj r2, C54033GyI gyI) {
        r2.AAJ("afi_type", gyI.A05);
        r2.AAJ("ad_tracking_token", gyI.A04);
    }

    public static void A05(0Aj r2, Map map) {
        r2.A9H("extra_data", map);
        r2.AAJ("trigger_source", "ad_dwell");
        r2.AAJ("question_id", "main_question");
    }

    public final String AaG() {
        return this.A00;
    }

    public final void Chi() {
        if (this instanceof C54033GyI) {
            C54033GyI gyI = (C54033GyI) this;
            0Aj A0e = AnonymousClass7TE.A0e(gyI.A03, "instagram_ads_feedback_interface_dismiss");
            if (A0e.isSampled()) {
                C51970G9q.A17(A0e, gyI.A01);
                A03(A0e, gyI, gyI.A02);
                A04(A0e, gyI);
                A05(A0e, C54033GyI.A00(gyI, false));
                C51970G9q.A1B(A0e, gyI.A00);
                C51969G9p.A1C(A0e, gyI.A06);
                return;
            }
            return;
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public static long A01(C52465GTr gTr) {
        Integer num = gTr.A01().A0P;
        if (num != null) {
            return (long) num.intValue();
        }
        return 0;
    }

    public static void A03(0Aj r2, GCG gcg, long j) {
        r2.A9F("ig_userid", Long.valueOf(j));
        r2.AAJ("afi_id", gcg.A00);
    }
}
