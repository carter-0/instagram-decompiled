package X;

/* renamed from: X.5tF  reason: invalid class name and case insensitive filesystem */
public abstract class C298325tF {
    public static void A00(C298235t6 r4, 17Z r5) {
        r5.A0c();
        if (r4.A01 != null) {
            16P.A03(r5, "scan_results");
            for (C21428Xad xad : r4.A01) {
                if (xad != null) {
                    r5.A0c();
                    r5.A0P("age_ms", xad.A00);
                    String str = xad.A02;
                    if (str != null) {
                        r5.A0R("hardware_address", str);
                    }
                    r5.A0P("rssi_dbm", xad.A01);
                    String str2 = xad.A03;
                    if (str2 != null) {
                        r5.A0R("advertisement_payload_base64", str2);
                    }
                    r5.A0Z();
                }
            }
            r5.A0Y();
        }
        Boolean bool = r4.A00;
        if (bool != null) {
            r5.A0S("enabled", bool.booleanValue());
        }
        r5.A0Z();
    }
}
