package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.RTz  reason: case insensitive filesystem */
public abstract class C9222RTz {
    public static final boolean A00(Context context) {
        0qQ.A0B(context, 0);
        if (Build.VERSION.SDK_INT < 35 || context.getApplicationInfo().targetSdkVersion < 35) {
            return false;
        }
        return true;
    }
}
