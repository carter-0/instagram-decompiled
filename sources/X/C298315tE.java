package X;

/* renamed from: X.5tE  reason: invalid class name and case insensitive filesystem */
public abstract class C298315tE {
    public static void A00(C298255t8 r2, 17Z r3) {
        r3.A0c();
        Integer num = r2.A01;
        if (num != null) {
            r3.A0P("age_ms", num.intValue());
        }
        String str = r2.A03;
        if (str != null) {
            r3.A0R("hardware_address", str);
        }
        r3.A0P("rssi_dbm", r2.A00);
        String str2 = r2.A04;
        if (str2 != null) {
            r3.A0R("network_name", str2);
        }
        Integer num2 = r2.A02;
        if (num2 != null) {
            r3.A0P("frequency_mhz", num2.intValue());
        }
        r3.A0Z();
    }
}
