package X;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* renamed from: X.RRd  reason: case insensitive filesystem */
public abstract class C9152RRd {
    public static int A00(Context context, String str, String str2, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        AppOpsManager A01 = SK9.A01(context);
        int A00 = SK9.A00(A01, str, str2, Binder.getCallingUid());
        if (A00 == 0) {
            return SK9.A00(A01, str, SK9.A02(context), i);
        }
        return A00;
    }
}
