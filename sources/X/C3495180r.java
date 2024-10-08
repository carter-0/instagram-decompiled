package X;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.80r  reason: invalid class name and case insensitive filesystem */
public abstract class C3495180r {
    public static final C340277l0 A00(Context context) {
        0qQ.A0B(context, 0);
        if (C3495280s.A00(context)) {
            return C340277l0.CAMERA2;
        }
        return C340277l0.CAMERA1;
    }

    public static final boolean A01(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || ((!packageManager.hasSystemFeature("android.hardware.camera.concurrent") && !C348137xw.A02(C348147xx.A00)) || A00(context) != C340277l0.CAMERA2)) {
            return false;
        }
        return true;
    }
}
