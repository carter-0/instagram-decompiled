package X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* renamed from: X.3Qk  reason: invalid class name */
public abstract class AnonymousClass3Qk {
    public static void A00() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            String name = myLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
            }
        }
    }

    public static void A02(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void A03(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    public static void A07(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void A08(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void A09(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void A01(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            throw new IllegalStateException(002.A11("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", str, "."));
        }
    }

    public static void A04(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void A05(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void A06(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }
}
