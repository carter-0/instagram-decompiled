package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.Khp  reason: case insensitive filesystem */
public enum C62559Khp {
    CONNECTED(RealtimeConstants.MQTT_CONNECTED),
    UNCONNECTED("unconnected"),
    MARQUEE("marquee"),
    UNKNOWN("unknown");
    
    public final String A00;

    /* access modifiers changed from: public */
    static {
        C62559Khp[] khpArr;
        A01 = 0oU.A00(khpArr);
    }

    /* access modifiers changed from: public */
    C62559Khp(String str) {
        this.A00 = str;
    }
}
