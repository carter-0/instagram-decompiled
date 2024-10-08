package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import java.util.Arrays;
import java.util.Map;
import kotlin.Deprecated;

/* renamed from: X.45p  reason: invalid class name and case insensitive filesystem */
public abstract class C2604245p {
    @Deprecated(message = "")
    public static final C346927vz A00(Map map) {
        String str;
        0qQ.A0B(map, 0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            return C282655Ed.A00(map);
        }
        if (i == 33) {
            str = "android.permission.READ_MEDIA_IMAGES";
        } else {
            str = "android.permission.READ_EXTERNAL_STORAGE";
        }
        return (C346927vz) map.get(str);
    }

    public static final void A01(Activity activity, 1DN r3) {
        0qQ.A0B(activity, 0);
        0qQ.A0B(r3, 1);
        String[] A05 = A05(activity);
        1DL.A04(activity, r3, (String[]) Arrays.copyOf(A05, A05.length));
    }

    public static final boolean A03(Context context) {
        0qQ.A0B(context, 0);
        if (Build.VERSION.SDK_INT >= 34) {
            return C282655Ed.A02(context);
        }
        String[] A05 = A05(context);
        return 1DL.A08(context, (String[]) Arrays.copyOf(A05, A05.length));
    }

    public static final boolean A04(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C282655Ed.A03(context);
        }
        return false;
    }

    public static final boolean A02(Activity activity) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C282655Ed.A01(activity);
        }
        for (String A05 : A05(activity)) {
            if (1DL.A05(activity, A05)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated(message = "")
    public static final String[] A05(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            return C282655Ed.A04();
        }
        if (i == 33 && context.getApplicationInfo().targetSdkVersion >= 33) {
            return new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.ACCESS_MEDIA_LOCATION"};
        }
        if (i >= 29) {
            return new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.ACCESS_MEDIA_LOCATION"};
        }
        return new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
    }
}
