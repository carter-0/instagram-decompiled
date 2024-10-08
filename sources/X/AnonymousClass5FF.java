package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;

/* renamed from: X.5FF  reason: invalid class name */
public abstract class AnonymousClass5FF {
    public static final AnonymousClass5FG A00 = new AnonymousClass5FG();

    public static final boolean A00(Context context, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        return A01(context, userSession, str, (String) null, false);
    }

    public static final boolean A01(Context context, UserSession userSession, String str, String str2, boolean z) {
        Intent launchIntentForPackage;
        String str3;
        if (str == null) {
            return false;
        }
        Intent data = new Intent("android.intent.action.VIEW").setFlags(268435456).setData(0cp.A01(A00, str));
        0qQ.A07(data);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        ResolveInfo resolveActivity = packageManager.resolveActivity(data, Constants.LOAD_RESULT_PGO_ATTEMPTED);
        if (resolveActivity != null) {
            if (str2 == null || str2.equals("") || !z) {
                return true;
            }
            ActivityInfo activityInfo = resolveActivity.activityInfo;
            if (activityInfo != null) {
                str3 = activityInfo.packageName;
            } else {
                str3 = null;
            }
            return str2.equals(str3);
        } else if (str2 == null || !182.A06(0Tu.A05, userSession, 36326068885403112L) || (launchIntentForPackage = packageManager.getLaunchIntentForPackage(str2)) == null || packageManager.resolveActivity(launchIntentForPackage, Constants.LOAD_RESULT_PGO_ATTEMPTED) == null) {
            return false;
        } else {
            return true;
        }
    }
}
