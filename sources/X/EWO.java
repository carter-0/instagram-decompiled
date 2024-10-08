package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

public enum EWO {
    UPSELL_DESIGN_VARIANT_0(0, "9"),
    UPSELL_DESIGN_VARIANT_1(1, RealtimeSubscription.GRAPHQL_MQTT_VERSION),
    UPSELL_DESIGN_VARIANT_IGDS_FOLLOW_UP_2(17, "17"),
    UPSELL_DESIGN_VARIANT_OPC_MONETIZATION(18, "18"),
    UPSELL_DESIGN_VARIANT_OPC_BRAND_BUILDING(19, "19");
    
    public static final Map A02 = null;
    public final long A00;
    public final String A01;

    /* access modifiers changed from: public */
    static {
        EWO[] ewoArr;
        A03 = 0oU.A00(ewoArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r5));
        for (EWO ewo : values()) {
            A0x.put(Long.valueOf(ewo.A00), ewo);
        }
        A02 = A0x;
    }

    /* access modifiers changed from: public */
    EWO(long j, String str) {
        this.A00 = j;
        this.A01 = str;
    }
}
