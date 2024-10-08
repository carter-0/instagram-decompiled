package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.7pi  reason: invalid class name and case insensitive filesystem */
public abstract class C343127pi {
    public static final boolean A00(Context context) {
        if ("Redmi Note 8".equals(Build.MODEL) || AnonymousClass0Ke.A00(context) < 2016) {
            return false;
        }
        return true;
    }
}
