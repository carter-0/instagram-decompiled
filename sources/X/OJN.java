package X;

import com.facebook.mobileconfig.factory.MobileConfigValueSource;

public final class OJN {
    public OB0 A00;

    public final String A01(String str) {
        OB0 ob0 = this.A00;
        if (ob0 == null) {
            return null;
        }
        0Tu r6 = 0Tu.A05;
        Number A14 = C51966G9m.A14(str, ob0.A00);
        if (A14 != null) {
            long longValue = A14.longValue();
            if (longValue != 0) {
                1AA r2 = ob0.A01;
                0Tu A002 = 0Tu.A00(r6);
                A002.A02 = true;
                String C1v = r2.C1v(A002, longValue);
                MobileConfigValueSource mobileConfigValueSource = A002.A00.A00;
                if (mobileConfigValueSource == MobileConfigValueSource.SERVER || mobileConfigValueSource == MobileConfigValueSource.OVERRIDE) {
                    return C1v;
                }
            }
        }
        return null;
    }

    public static String A00(String str, String str2, int i) {
        String str3;
        if (str2.length() > 0) {
            str3 = 002.A0R("_", str2);
        } else {
            str3 = "";
        }
        return 002.A07(i, str, str3, "_V");
    }
}
