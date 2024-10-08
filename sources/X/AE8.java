package X;

import android.app.Notification;
import android.content.LocusId;
import android.os.Build;

public abstract class AE8 {
    public static C370428wR A00(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C370428wR.A01(AE7.A00(notification));
        }
        return null;
    }

    public static SJT A01(Notification notification) {
        LocusId A01;
        if (Build.VERSION.SDK_INT < 29 || (A01 = AE7.A01(notification)) == null) {
            return null;
        }
        return SJT.A00(A01);
    }

    public static boolean A02(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AE7.A02(notification);
        }
        return false;
    }
}
