package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.B6v  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41920B6v {
    public static Map A00(C239623He r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.AZC() != null) {
            A1H.put("ad_pod_id", r3.AZC());
        }
        r3.BGt();
        A1H.put("index_in_ad_pod", Integer.valueOf(r3.BGt()));
        r3.BWp();
        return C41845B3m.A0u("num_ads_in_ad_pod", Integer.valueOf(r3.BWp()), A1H);
    }
}
