package X;

import android.util.Log;
import java.util.Locale;

public abstract class SQO {
    public static boolean A00;

    public static void A00(String str, String str2, Throwable th, Object... objArr) {
        if (A00) {
            if (objArr.length != 0) {
                str2 = Pxf.A0m(str2, objArr);
            }
            Log.e(str, str2, th);
        }
    }

    public static void A01(String str, String str2, Object... objArr) {
        if (S2G.A04) {
            S2G s2g = S2G.A03;
            if (s2g == null) {
                s2g = new S2G();
                S2G.A03 = s2g;
            }
            String str3 = str2;
            if (objArr.length != 0) {
                str3 = Pxf.A0m(str2, objArr);
            }
            s2g.A00(002.A0g(str, ": ", str3));
        }
        if (A00 && objArr.length != 0) {
            String.format((Locale) null, str2, objArr);
        }
    }

    public static void A02(String str, String str2, Object... objArr) {
        if (S2G.A04) {
            S2G s2g = S2G.A03;
            if (s2g == null) {
                s2g = new S2G();
                S2G.A03 = s2g;
            }
            String str3 = str2;
            if (objArr.length != 0) {
                str3 = Pxf.A0m(str2, objArr);
            }
            s2g.A00(002.A0g(str, ": ", str3));
        }
        if (A00) {
            if (objArr.length != 0) {
                str2 = Pxf.A0m(str2, objArr);
            }
            Log.e(str, str2);
        }
    }

    public static void A03(String str, Object[] objArr) {
        if (A00) {
            String.format((Locale) null, str, objArr);
        }
    }
}
