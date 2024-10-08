package X;

import android.os.Build;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.4pp  reason: invalid class name and case insensitive filesystem */
public final class C275244pp {
    public static final Map A02 = new HashMap();
    public static final boolean A03;
    public static final boolean A04;
    public static final boolean A05;
    public static final String[] A06 = {"huawei", "honor"};
    public static final String[] A07 = {"xiaomi", "redmi", "poco", "mi", "blackshark"};
    public static final String[] A08 = {"oppo", "realme", "oneplus"};
    public final Looper A00;
    public final C274834pA A01;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i >= 29) {
            z = true;
        }
        A03 = z;
        boolean z2 = false;
        if (i >= 31) {
            z2 = true;
        }
        A05 = z2;
        boolean z3 = false;
        if (i >= 30) {
            z3 = true;
        }
        A04 = z3;
    }

    public C275244pp(Looper looper, C274834pA r4, C274774p4 r5) {
        this.A00 = looper;
        this.A01 = r4;
        C262444Ef.A00().A00.post(new C275254pq(this, r5));
    }
}
