package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* renamed from: X.96E  reason: invalid class name */
public final /* synthetic */ class AnonymousClass96E implements AnonymousClass96C {
    public static final AnonymousClass96E A00 = new AnonymousClass96E();

    public final String ATh(Object obj) {
        ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.minSdkVersion);
        }
        return "";
    }
}
