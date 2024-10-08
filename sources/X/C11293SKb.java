package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Calendar;

/* renamed from: X.SKb  reason: case insensitive filesystem */
public final class C11293SKb {
    public static final long A00(int i) {
        Calendar instance = Calendar.getInstance();
        0qQ.A07(instance);
        instance.add(5, 1);
        instance.set(11, i);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis() - System.currentTimeMillis();
    }

    public static final boolean A01(Context context) {
        String str;
        String packageName = context.getPackageName();
        0qQ.A07(packageName);
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                str = context.getPackageManager().getInstallSourceInfo(packageName).getInstallingPackageName();
            } else {
                str = context.getPackageManager().getInstallerPackageName(packageName);
            }
        } catch (PackageManager.NameNotFoundException e) {
            0KC.A0G("OxygenScheduledInstallerJobService", 002.A0R("Could not find installer package name for ", packageName), e);
            str = null;
        }
        ArrayList arrayList = AnonymousClass1S6.A00;
        if (str == null || !"com.android.vending".equals(str)) {
            return false;
        }
        return true;
    }
}
