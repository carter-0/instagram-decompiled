package X;

import android.content.Context;

/* renamed from: X.4su  reason: invalid class name and case insensitive filesystem */
public final class C276244su {
    public final Context A00;

    public static boolean A00(C276244su r3) {
        Context context = r3.A00;
        if ((context.getApplicationInfo().targetSdkVersion >= 26 || context.checkCallingOrSelfPermission(AnonymousClass000.A00(21)) != 0) && context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            return false;
        }
        return true;
    }

    public C276244su(Context context) {
        this.A00 = context;
    }
}
