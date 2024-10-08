package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: X.4x4  reason: invalid class name */
public abstract class AnonymousClass4x4 {
    public static Boolean A00;
    public static boolean A01;

    public static boolean A00(Context context, boolean z) {
        if ((z || A01) && Boolean.TRUE.equals(A00)) {
            throw new RuntimeException("it looks you are in a test that needs camera 1 but camera 2 was already initialized.");
        }
        boolean z2 = false;
        if (z) {
            A01 = true;
            A00 = false;
        }
        Boolean bool = A00;
        if (bool == null) {
            if (Build.VERSION.SDK_INT > 29) {
                bool = true;
            } else {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && packageManager.hasSystemFeature("android.hardware.camera.level.full")) {
                    z2 = true;
                }
                bool = Boolean.valueOf(z2);
            }
            A00 = bool;
        }
        return bool.booleanValue();
    }
}
