package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

public abstract class SC4 {
    public static final C10268RpS A00 = new C10268RpS("CommonUtils", "");

    public static String A00(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            C10268RpS rpS = A00;
            String concat = "Exception thrown when trying to get app version ".concat(e.toString());
            if (!Log.isLoggable("CommonUtils", 6)) {
                return "";
            }
            String str = rpS.A00;
            if (str != null) {
                concat = str.concat(concat);
            }
            Log.e("CommonUtils", concat);
            return "";
        }
    }
}
