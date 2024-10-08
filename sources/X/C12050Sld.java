package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.common.dextricks.Constants;
import java.util.ArrayList;

/* renamed from: X.Sld  reason: case insensitive filesystem */
public abstract class C12050Sld implements C13769Tgh {
    public static final boolean A02(Context context, Uri uri, Bundle bundle) {
        boolean z = bundle.getBoolean("can_use_alley_oop", false);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("package_names");
        if (stringArrayList == null) {
            return false;
        }
        if ((context instanceof Activity) && "play.google.com".equals(uri.getHost()) && uri.getQueryParameter("listing") == null && z) {
            Intent A09 = DbX.A09(uri.toString().replace("https://play.google.com/store/apps/", "market://"));
            A09.putExtra(C66579MXk.A00(266), "com.facebook.katana");
            A09.putExtra("overlay", true);
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(A09, Constants.LOAD_RESULT_PGO_ATTEMPTED)) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    if (activityInfo != null && stringArrayList.contains(activityInfo.packageName)) {
                        Activity activity = (Activity) context;
                        Boolean bool = SQY.A01;
                        if (activity != null) {
                            try {
                                SQY.A01(A09, RQ7.A00);
                                0b6.A00().A03().A0F(activity, A09, 0);
                                return true;
                            } catch (ActivityNotFoundException unused) {
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        Intent A0E = Pxe.A0E();
        A0E.addFlags(268435456);
        A0E.setData(uri);
        PackageManager packageManager2 = context.getPackageManager();
        if (packageManager2 == null) {
            return false;
        }
        for (ResolveInfo resolveInfo2 : packageManager2.queryIntentActivities(A0E, Constants.LOAD_RESULT_PGO_ATTEMPTED)) {
            ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
            if (activityInfo2 != null) {
                String str = activityInfo2.packageName;
                if (stringArrayList.contains(str)) {
                    Intent intent = new Intent(A0E);
                    C66581MXm.A17(intent, str, activityInfo2.name);
                    Boolean bool2 = SQY.A01;
                    try {
                        SQY.A01(intent, RQ7.A00);
                        AnonymousClass0b5.A01(context, intent);
                        return true;
                    } catch (ActivityNotFoundException unused2) {
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }
}
