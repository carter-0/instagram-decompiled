package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

public final class SKU {
    public static HashMap A00(Context context) {
        String str;
        String str2;
        String str3 = null;
        if (context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            str = context.getPackageName();
            if (i == 0) {
                str3 = applicationInfo.nonLocalizedLabel.toString();
            } else {
                str3 = context.getString(i);
            }
        } else {
            str = null;
        }
        String str4 = Build.MODEL;
        Map map = SBS.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(map.get("major"));
        A1A.append(".");
        A1A.append(map.get("minor"));
        A1A.append(".");
        A1A.append(map.get("patch"));
        if (map.get("prerelease") != null) {
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            A1A2.append("-");
            str2 = AnonymousClass7TF.A0i(map.get("prerelease"), A1A2);
        } else {
            str2 = "";
        }
        String A0l = AnonymousClass7TF.A0l(str2, A1A);
        HashMap A0f = Dba.A0f("appDisplayName", str3);
        A0f.put("appIdentifier", str);
        A0f.put("platform", "android");
        A0f.put("deviceName", str4);
        A0f.put("reactNativeVersion", A0l);
        return A0f;
    }

    public static void A01() {
        if (!Build.FINGERPRINT.contains("vbox")) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append(Build.MODEL);
            A1A.append(" - ");
            A1A.append(Build.VERSION.RELEASE);
            A1A.append(" - API ");
            A1A.append(Build.VERSION.SDK_INT);
            A1A.toString();
        }
    }
}
