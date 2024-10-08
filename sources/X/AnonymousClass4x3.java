package X;

import android.content.Context;
import com.facebook.common.build.BuildConstants;

/* renamed from: X.4x3  reason: invalid class name */
public abstract class AnonymousClass4x3 {
    public static int A00;

    public static final int A00(Context context) {
        0qQ.A0B(context, 0);
        int i = A00;
        if (i != 0) {
            return i;
        }
        if (!BuildConstants.A02()) {
            A00 = -1;
            return -1;
        }
        try {
            int i2 = context.getPackageManager().getPackageInfo("com.google.ar.core", 128).versionCode;
            A00 = i2;
            return i2;
        } catch (Throwable unused) {
            A00 = -1;
            return -1;
        }
    }
}
