package X;

import android.app.ActivityManager;
import android.os.Build;

/* renamed from: X.RTy  reason: case insensitive filesystem */
public abstract class C9221RTy {
    public static boolean A00() {
        if (Build.VERSION.SDK_INT < 29) {
            return true;
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return AnonymousClass7TF.A1S(runningAppProcessInfo.importance, 100);
    }
}
