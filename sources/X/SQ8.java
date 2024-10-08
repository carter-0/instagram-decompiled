package X;

import android.os.Bundle;

public abstract class SQ8 {
    public static String A00(Bundle bundle, int i) {
        return bundle.getString(002.A0b("AUTH_FLOW_UTIL_AUTH_FLOW", "#", i));
    }

    public static String A01(Bundle bundle, int i) {
        return bundle.getString(002.A0b("AUTH_FLOW_UTIL_AUTH_STEP", "#", i));
    }

    public static void A02(String str, Bundle bundle) {
        Pxi.A0x(bundle, "AUTH_FLOW_UTIL_AUTH_FLOW", str, 1);
    }

    public static void A03(String str, Bundle bundle) {
        Pxi.A0x(bundle, "AUTH_FLOW_UTIL_AUTH_STEP", str, 1);
    }
}
