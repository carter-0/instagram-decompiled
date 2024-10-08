package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* renamed from: X.96B  reason: invalid class name */
public final /* synthetic */ class AnonymousClass96B implements AnonymousClass96C {
    public static final AnonymousClass96B A00 = new AnonymousClass96B();

    public final String ATh(Object obj) {
        ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }
}
