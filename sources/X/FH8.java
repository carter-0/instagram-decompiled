package X;

import android.os.Build;

public abstract class FH8 {
    public static final String A02(0lg r1) {
        0qQ.A0B(r1, 0);
        String A02 = DbT.A0P(r1).A02(19f.A1u);
        if (A02 == null) {
            return "";
        }
        return A02;
    }

    public static final String A03(0lg r1) {
        0qQ.A0B(r1, 0);
        return DbZ.A0m(r1);
    }

    public static final String A01() {
        String name;
        0la A00 = 0la.A02.A00();
        if (A00 == null || (name = A00.name()) == null) {
            return "";
        }
        return DbY.A0j(name);
    }

    public static void A06(0Aj r2) {
        r2.A9F("os_version", Long.valueOf((long) Build.VERSION.SDK_INT));
    }

    public static final String A00() {
        String A0t = DbV.A0t();
        if (A0t == null) {
            return "";
        }
        return A0t;
    }

    public static void A04(0Aj r2) {
        r2.AAJ("release_channel", A01());
    }

    public static void A05(0Aj r2) {
        r2.AAJ("guid", A00());
    }

    public static void A07(0Aj r2, double d) {
        r2.A8D("current_time", Double.valueOf(d));
        r2.AAJ("guid", A00());
    }

    public static void A08(0Aj r2, 0lg r3) {
        r2.AAJ("guid", A00());
        r2.AAJ("source", A03(r3));
        r2.Cgf();
    }

    public static void A09(0Aj r2, 0lg r3) {
        r2.AAJ("guid", A00());
        r2.AAJ("source", A03(r3));
    }

    public static void A0A(0Aj r2, 0lg r3) {
        r2.AAJ("fb_family_device_id", A02(r3));
    }

    public static void A0B(0Aj r2, 0lg r3) {
        r2.AAJ("source", A03(r3));
    }

    public static void A0C(0Aj r2, 0lg r3) {
        r2.AAJ("source", A03(r3));
        r2.Cgf();
    }

    public static void A0D(0Aj r2, 0lg r3, String str, String str2) {
        r2.AAJ(str, str2);
        r2.AAJ("source", A03(r3));
    }

    public static void A0E(0Aj r2, String str, String str2) {
        r2.AAJ(str, str2);
        r2.AAJ("guid", A00());
    }
}
