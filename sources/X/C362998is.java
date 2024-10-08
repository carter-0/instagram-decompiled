package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.instagram.common.session.UserSession;

/* renamed from: X.8is  reason: invalid class name and case insensitive filesystem */
public abstract class C362998is {
    public static final boolean A00(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        0Tu r5 = 0Tu.A05;
        if (!182.A06(r5, userSession, 36316242000220312L) || Build.VERSION.SDK_INT < 29) {
            return false;
        }
        if (context == null) {
            context = C60960kU.A00;
            0qQ.A07(context);
        }
        boolean A06 = 182.A06(r5, userSession, 36330836300350253L);
        0qQ.A0B(context, 0);
        PackageManager packageManager = context.getPackageManager();
        if (A06) {
            if (0JW.A05(packageManager, "com.facebook.stella") || 0JW.A05(packageManager, "com.facebook.stella_debug")) {
                return true;
            }
        } else if (packageManager != null) {
            String[] strArr = {"com.facebook.stella", "com.facebook.stella_debug"};
            int i = 0;
            do {
                try {
                    if (packageManager.getPackageInfo(strArr[i], 0) != null) {
                        return true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                i++;
            } while (i < 2);
        }
        if (182.A06(r5, userSession, 36316242004152481L)) {
            return true;
        }
        return false;
    }
}
