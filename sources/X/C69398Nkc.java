package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Nkc  reason: case insensitive filesystem */
public enum C69398Nkc {
    PRIMARY(RealtimeSubscription.GRAPHQL_MQTT_VERSION);
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C69398Nkc[] nkcArr;
        A02 = 0oU.A00(nkcArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C69398Nkc nkc : values()) {
            A0x.put(nkc.A00, nkc);
        }
        A01 = A0x;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C69398Nkc(String str) {
        this.A00 = str;
    }
}
