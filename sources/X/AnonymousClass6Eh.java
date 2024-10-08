package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: X.6Eh  reason: invalid class name */
public final class AnonymousClass6Eh {
    public static String A00 = "Unknown";
    public static volatile boolean A01;

    public static final String A00(Context context) {
        if (!A01) {
            synchronized (AnonymousClass6Eh.class) {
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    if (packageInfo != null) {
                        String str = packageInfo.versionName;
                        if (str == null) {
                            str = "";
                        }
                        A00 = str;
                        A01 = true;
                    } else {
                        0KC.A0Q("ApplicationManifestHelper", "Package info for %s is null", new Object[]{context.getPackageName()});
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    0KC.A0L("ApplicationManifestHelper", "Failed to get package info for %s", e, new Object[]{context.getPackageName()});
                }
            }
        }
        return A00;
    }
}
