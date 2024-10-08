package X;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

public abstract class STH {
    public static C13868Tip A00 = C13868Tip.A00;
    public static final Object A01 = Pxe.A0p();

    public static String A00(String str, Throwable th) {
        boolean z;
        String str2;
        if (th == null) {
            str2 = null;
        } else {
            synchronized (A01) {
                Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        z = false;
                        break;
                    } else if (th2 instanceof UnknownHostException) {
                        z = true;
                        break;
                    } else {
                        th2 = th2.getCause();
                    }
                }
                if (z) {
                    str2 = "UnknownHostException (no network)";
                } else {
                    str2 = Log.getStackTraceString(th).trim().replace("\t", "    ");
                }
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            return 002.A0h(str, "\n  ", str2.replace("\n", "\n  "), 10);
        }
        return str;
    }

    public static void A01(String str) {
        synchronized (A01) {
            A00(str, (Throwable) null);
        }
    }

    public static void A02(String str, String str2) {
        synchronized (A01) {
            Log.e(str, A00(str2, (Throwable) null));
        }
    }

    public static void A03(String str, String str2) {
        synchronized (A01) {
            Log.w(str, A00(str2, (Throwable) null));
        }
    }

    public static void A04(String str, String str2, Throwable th) {
        synchronized (A01) {
            Log.e(str, A00(str2, th));
        }
    }

    public static void A05(String str, String str2, Throwable th) {
        synchronized (A01) {
            Log.w(str, A00(str2, th));
        }
    }
}
