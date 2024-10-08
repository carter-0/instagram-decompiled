package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Nkg  reason: case insensitive filesystem */
public enum C69402Nkg {
    START(RealtimeSubscription.GRAPHQL_MQTT_VERSION),
    SUBMIT("2");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C69402Nkg[] nkgArr;
        A02 = 0oU.A00(nkgArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C69402Nkg nkg : values()) {
            A0x.put(nkg.A00, nkg);
        }
        A01 = A0x;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C69402Nkg(String str) {
        this.A00 = str;
    }
}
