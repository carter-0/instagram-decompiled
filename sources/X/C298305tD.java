package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.5tD  reason: invalid class name and case insensitive filesystem */
public abstract class C298305tD {
    public static void A00(C298225t5 r2, 17Z r3) {
        r3.A0c();
        if (r2.A02 != null) {
            16P.A03(r3, "scan_results");
            for (C298255t8 r0 : r2.A02) {
                if (r0 != null) {
                    C298315tE.A00(r0, r3);
                }
            }
            r3.A0Y();
        }
        if (r2.A00 != null) {
            r3.A0q(RealtimeConstants.MQTT_CONNECTED);
            C298315tE.A00(r2.A00, r3);
        }
        Boolean bool = r2.A01;
        if (bool != null) {
            r3.A0S("enabled", bool.booleanValue());
        }
        r3.A0Z();
    }
}
